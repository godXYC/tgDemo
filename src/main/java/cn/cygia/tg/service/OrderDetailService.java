package cn.cygia.tg.service;

import cn.cygia.tg.entity.OrderDetailEntity;

import java.util.List;

public interface OrderDetailService {
    List<OrderDetailEntity> getOrderDetail(String sn);
}
