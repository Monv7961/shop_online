package com.soft2242.shop.convert;

import com.soft2242.shop.entity.UserOrder;
import com.soft2242.shop.vo.OrderDetailVO;
import org.mapstruct.factory.Mappers;

public interface UserOrderDetailConvert {
    UserOrderDetailConvert INSTANCE = Mappers.getMapper(UserOrderDetailConvert.class);

    OrderDetailVO convertToOrderDetailVO(UserOrder userOrder);
}
