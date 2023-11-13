package com.soft2242.shop.service;

import com.soft2242.shop.entity.UserShippingAddress;
import com.baomidou.mybatisplus.extension.service.IService;
import com.soft2242.shop.vo.AddressVO;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author ycshang
 * @since 2023-11-09
 */
public interface UserShippingAddressService extends IService<UserShippingAddress> {

    Integer saveShippingAddress(AddressVO addressVO);

    Integer editShippingAddress(AddressVO addressVO);

    List<AddressVO> getList(Integer userId);

    /**
     *收货地址详情
     *
     * @param id
     * @return
     */
    AddressVO getAddressInfo(Integer id);

    /**
     * 删除收货地址
     *
     * @param id
     */
    void removeShippingAddress(Integer id);
}
