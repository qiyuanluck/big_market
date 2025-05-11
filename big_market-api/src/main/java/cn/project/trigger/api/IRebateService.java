package cn.project.trigger.api;

import cn.project.trigger.api.dto.RebateRequestDTO;
import cn.project.trigger.api.request.Request;
import cn.project.trigger.api.response.Response;

/**
 * @Author: qiyuan
 * @Date: 2025/05/11 17:11
 * @Description:
 */
public interface IRebateService {

    Response<Boolean> rebate(Request<RebateRequestDTO> request);

}
