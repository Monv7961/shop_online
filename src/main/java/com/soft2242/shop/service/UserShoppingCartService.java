package com.soft2242.shop.service;

import com.soft2242.shop.entity.UserShoppingCart;
import com.baomidou.mybatisplus.extension.service.IService;
import com.soft2242.shop.query.CartQuery;
import com.soft2242.shop.vo.CartGoodsVO;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author ycshang
 * @since 2023-11-09
 */
public interface UserShoppingCartService extends IService<UserShoppingCart> {
    /**
     * 添加购物车
     *
     * @param query
     * @return
     */
    CartGoodsVO addShopCart(CartQuery query);

    /**
     * 购物车列表
     *
     * @Param userId
     * @return
     */
    List<CartGoodsVO> shopCartList(Integer userId);
}
