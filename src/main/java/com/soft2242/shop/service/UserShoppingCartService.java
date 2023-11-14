package com.soft2242.shop.service;

import com.soft2242.shop.entity.UserShoppingCart;
import com.baomidou.mybatisplus.extension.service.IService;
import com.soft2242.shop.query.CartQuery;
import com.soft2242.shop.vo.CartGoodsVO;

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
     * @parm query
     * @return
     */
    CartGoodsVO addShopCart(CartQuery query);
}
