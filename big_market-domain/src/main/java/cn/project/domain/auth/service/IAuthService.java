package cn.project.domain.auth.service;

/**
 * @Author: qiyuan
 * @Date: 2025/05/11 16:43
 * @Description:
 */
public interface IAuthService {

    boolean checkToken(String token);

    String openid(String token);

}
