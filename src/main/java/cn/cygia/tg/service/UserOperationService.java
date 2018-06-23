package cn.cygia.tg.service;

import cn.cygia.tg.entity.UserEntity;

public interface UserOperationService {
    UserEntity register(String username,String password);
    UserEntity login(String username,String password);
}
