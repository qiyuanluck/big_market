package cn.project.infrastructure.adapter.port;

import cn.project.domain.award.adapter.port.IAwardPort;
import cn.project.infrastructure.gateway.IOpenAIAccountService;
import cn.project.infrastructure.gateway.dto.AdjustQuotaRequestDTO;
import cn.project.infrastructure.gateway.dto.AdjustQuotaResponseDTO;
import cn.project.infrastructure.gateway.response.Response;
import cn.project.types.enums.ResponseCode;
import cn.project.types.exception.AppException;
import com.alibaba.fastjson2.JSON;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import retrofit2.Call;

import javax.annotation.Resource;

/**
 * @Author: qiyuan
 * @Date: 2025/05/10 21:42
 * @Description:
 */
@Slf4j
@Service
public class AwardPort implements IAwardPort {

    @Value("${gateway.config.big-market-appId}")
    private String BIG_MARKET_APPID;
    @Value("${gateway.config.big-market-appToken}")
    private String BIG_MARKET_APPTOKEN;

    @Resource
    private IOpenAIAccountService openAIAccountService;

    @Override
    public void adjustAmount(String userId, Integer increaseQuota) throws Exception {
        log.info("消息部分信息" + userId + increaseQuota);
        try {
            AdjustQuotaRequestDTO requestDTO = AdjustQuotaRequestDTO.builder()
                    .appId(BIG_MARKET_APPID)
                    .appToken(BIG_MARKET_APPTOKEN)
                    .openid(userId)
                    .increaseQuota(increaseQuota)
                    .build();

            Call<Response<AdjustQuotaResponseDTO>> call = openAIAccountService.adjustQuota(requestDTO);
            Response<AdjustQuotaResponseDTO> response = call.execute().body();
            log.info("请求OpenAI应用账户调额接口完成 userId:{} increaseQuota:{} response:{}", userId, increaseQuota, JSON.toJSONString(response));

            if (null == response || null == response.getCode() || !"0000".equals(response.getCode())) {
                throw new AppException(ResponseCode.GATEWAY_ERROR.getCode(), ResponseCode.GATEWAY_ERROR.getInfo());
            }

        } catch (Exception e) {
            log.error("请求OpenAI应用账户调额接口失败 userId:{} increaseQuota:{}", userId, increaseQuota, e);
            throw e;
        }

    }

}
