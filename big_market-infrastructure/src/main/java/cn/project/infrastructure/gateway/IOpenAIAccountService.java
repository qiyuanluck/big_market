package cn.project.infrastructure.gateway;

import cn.project.infrastructure.gateway.dto.AdjustQuotaRequestDTO;
import cn.project.infrastructure.gateway.dto.AdjustQuotaResponseDTO;
import cn.project.infrastructure.gateway.response.Response;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

/**
 * @Author: qiyuan
 * @Date: 2025/05/10 20:56
 * @Description: OpenAI应用项目账户服务接口
 */
public interface IOpenAIAccountService {

    @POST("/api/v1/account/adjust_quota")
    Call<Response<AdjustQuotaResponseDTO>> adjustQuota(@Body AdjustQuotaRequestDTO requestDTO);

}
