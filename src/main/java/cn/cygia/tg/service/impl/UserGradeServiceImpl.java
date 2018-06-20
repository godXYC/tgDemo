package cn.cygia.tg.service.impl;


import cn.cygia.tg.entity.UserGradeEntity;
import cn.cygia.tg.repository.UserGradeRepository;
import cn.cygia.tg.service.UserGradeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserGradeServiceImpl implements UserGradeService{

    @Autowired
    UserGradeRepository userGradeRepository;

    @Override
    public List<UserGradeEntity> getUserGrade() {

        List<UserGradeEntity> userGradeEntityList = userGradeRepository.findAll();
        return userGradeEntityList;
    }
}
