package cn.cygia.tg.service.impl;

import cn.cygia.tg.entity.OrderDetailEntity;
import cn.cygia.tg.repository.OrderDetailRepository;
import cn.cygia.tg.service.OrderDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderDetailServiceImpl implements OrderDetailService{

    @Autowired
    OrderDetailRepository orderDetailRepository;

    @Override
    public List<OrderDetailEntity> getOrderDetail(String sn) {

        if(sn!=null){
            List<OrderDetailEntity> orderDetailEntityList = orderDetailRepository.findAllByConSn(sn);
            return orderDetailEntityList;
        }
        else {
            return null;
        }

    }
}
