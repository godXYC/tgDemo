package cn.cygia.tg.service.impl;

import cn.cygia.tg.entity.UserEntity;
import cn.cygia.tg.repository.UserOperationRepository;
import cn.cygia.tg.service.UserOperationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserOperationServiceImpl implements UserOperationService{

    @Autowired
    UserOperationRepository userOperationRepository;

    @Override
    public UserEntity register(String username, String password) {
        UserEntity userEntity = new UserEntity();
        if(username!=null&&password!=null){
            UserEntity isExist = userOperationRepository.findByNickName(username);
            if(isExist==null){
                userEntity.setNickName(username);
                userEntity.setPassword(password);
                userEntity.setPhoneNumber(username);
                userOperationRepository.save(userEntity);
                return userEntity;
            }
            else {
               return null;
            }
        }
        else {
            return null;
        }
    }

    @Override
    public UserEntity login(String username, String password) {
        if(username!=null&&password!=null){
            UserEntity userEntity = userOperationRepository.findByNickNameAndPassword(username,password);
            if(userEntity!=null){
                return userEntity;
            }
            else{
                return null;
            }
        }
        else{
            return null;
        }

    }
}
