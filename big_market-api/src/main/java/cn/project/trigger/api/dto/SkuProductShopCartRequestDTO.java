package cn.project.trigger.api.dto;

import lombok.Data;

/**
 * @Author: qiyuan
 * @Date: 2025/05/08 16:56
 * @Description: 商品购物车请求对象
 */
@Data
public class SkuProductShopCartRequestDTO {

    /**
     * 用户ID
     */
    private String userId;
    /**
     * sku 商品
     */
    private Long sku;

}
