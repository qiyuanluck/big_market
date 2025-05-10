package cn.project.config;

import cn.project.infrastructure.gateway.IOpenAIAccountService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;

/**
 * @Author: qiyuan
 * @Date: 2025/05/10 20:36
 * @Description:
 */
@Slf4j
@Configuration
@EnableConfigurationProperties(Retrofit2ConfigProperties.class)
public class Retrofit2Config {

    @Bean
    public Retrofit retrofit(Retrofit2ConfigProperties properties) {
        return new Retrofit.Builder()
                .baseUrl(properties.getApiHost())
                .addConverterFactory(JacksonConverterFactory.create()).build();
    }

    @Bean
    public IOpenAIAccountService weixinApiService(Retrofit retrofit) {
        return retrofit.create(IOpenAIAccountService.class);
    }

}
