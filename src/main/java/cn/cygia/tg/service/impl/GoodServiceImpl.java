package cn.cygia.tg.service.impl;

import cn.cygia.tg.entity.GoodEntity;
import cn.cygia.tg.repository.GoodRepository;
import cn.cygia.tg.service.GoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GoodServiceImpl implements GoodService{

    @Autowired
    GoodRepository goodRepository;

    @Override
    public GoodEntity getGoodMessage(String goodNumber) {
        if(goodNumber!=null){
            GoodEntity goodEntity = goodRepository.findByGoodNumber(goodNumber);
            return goodEntity;
        }
        else {
            return null;
        }

    }
}
