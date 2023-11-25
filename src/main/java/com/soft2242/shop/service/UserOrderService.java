package com.soft2242.shop.service;

import com.soft2242.shop.entity.UserOrder;
import com.baomidou.mybatisplus.extension.service.IService;
import com.soft2242.shop.vo.UserOrderVO;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author ycshang
 * @since 2023-11-09
 */
public interface UserOrderService extends IService<UserOrder> {
    /**
     * 提交订单
     *
     * return
     */
    Integer addGoodsOrder(UserOrderVO orderVO);
}
