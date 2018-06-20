package cn.cygia.tg.service.impl;


import cn.cygia.tg.entity.OrderListEntity;
import cn.cygia.tg.repository.OrderListRepository;
import cn.cygia.tg.service.OrderListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class OrderListServiceImpl implements OrderListService{

    @Autowired
    OrderListRepository orderListRepository;

    @Override
    public List<OrderListEntity> getOrderList() {

        List<OrderListEntity> orderListEntityList = new ArrayList<OrderListEntity>();
        orderListEntityList = orderListRepository.findAll();
        return orderListEntityList;
    }
}
