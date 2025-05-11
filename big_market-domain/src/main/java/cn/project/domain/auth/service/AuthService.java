package cn.project.domain.auth.service;

import io.jsonwebtoken.Claims;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @Author: qiyuan
 * @Date: 2025/05/11 16:43
 * @Description:
 */
@Slf4j
@Service
public class AuthService extends AbstractAuthService {

    @Override
    public boolean checkToken(String token) {
        return isVerify(token);
    }

    @Override
    public String openid(String token) {
        Claims claims = decode(token);
        return claims.get("openId").toString();
    }

}
