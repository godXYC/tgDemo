package cn.cygia.tg.controller;

import cn.cygia.tg.entity.UserEntity;
import cn.cygia.tg.resp.BaseResp;
import cn.cygia.tg.service.UserOperationService;
import cn.cygia.tg.util.GsonUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/user")
public class UserOperationController {

    @Autowired
    UserOperationService userOperationService;

    @RequestMapping(value = "/register")
    public String register(@RequestParam(name = "username")String userName,
                           @RequestParam(name = "password")String password){
        BaseResp<UserEntity> baseResp = new BaseResp<UserEntity>();
        UserEntity userEntity = userOperationService.register(userName,password);
        if(userEntity!=null){
            baseResp.setCode(BaseResp.SUCCESS);
            baseResp.setMessage("注册成功");
        }
        else{
            baseResp.setCode(BaseResp.FAIL);
            baseResp.setMessage("注册失败");
        }
        return GsonUtil.getInstance().toJson(baseResp);

    }
}
