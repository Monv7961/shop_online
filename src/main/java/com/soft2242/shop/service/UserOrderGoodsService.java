package com.soft2242.shop.service;

import com.soft2242.shop.entity.UserOrderGoods;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author ycshang
 * @since 2023-11-09
 */
public interface UserOrderGoodsService extends IService<UserOrderGoods> {
    /**
     * 批量插入订单记录
     *
     * @Param list
     */
    void batchUserOrderGoods(List<UserOrderGoods> list);
}
