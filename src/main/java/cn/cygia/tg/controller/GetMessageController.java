package cn.cygia.tg.controller;

import cn.cygia.tg.entity.GoodEntity;
import cn.cygia.tg.entity.OrderDetailEntity;
import cn.cygia.tg.entity.OrderListEntity;
import cn.cygia.tg.entity.UserGradeEntity;
import cn.cygia.tg.resp.BaseResp;
import cn.cygia.tg.service.GoodService;
import cn.cygia.tg.service.OrderDetailService;
import cn.cygia.tg.service.OrderListService;
import cn.cygia.tg.service.UserGradeService;
import cn.cygia.tg.util.GsonUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/get")
public class GetMessageController {


    @Autowired
    OrderListService orderListService;

    @Autowired
    OrderDetailService orderDetailService;

    @Autowired
    UserGradeService userGradeService;

    @Autowired
    GoodService goodService;

    @RequestMapping(value ="/orderList")
    public String getOrderList(){

        List<OrderListEntity> orderListEntityList = orderListService.getOrderList();
        BaseResp<List<OrderListEntity>> baseResp = new BaseResp<List<OrderListEntity>>();
        baseResp.setCode(BaseResp.SUCCESS);
        baseResp.setMessage("成功");
        baseResp.setData(orderListEntityList);
        return GsonUtil.getInstance().toJson(baseResp);
    }

    @RequestMapping(value = "/orderDetail")
    public String getOrderDetail(@RequestParam(name ="orderId")String orderId){

        List<OrderDetailEntity> orderDetailEntityList = orderDetailService.getOrderDetail(orderId);
        BaseResp<List<OrderDetailEntity>> baseResp = new BaseResp<List<OrderDetailEntity>>();
        baseResp.setCode(BaseResp.SUCCESS);
        baseResp.setMessage("获取订单详情成功");
        baseResp.setData(orderDetailEntityList);
        return GsonUtil.getInstance().toJson(baseResp);
    }

    @RequestMapping(value = "/userGrade")
    public String getUserGrade(){

        List<UserGradeEntity> userGradeEntityList = userGradeService.getUserGrade();
        BaseResp<List<UserGradeEntity>> baseResp = new BaseResp<List<UserGradeEntity>>();
        baseResp.setCode(BaseResp.SUCCESS);
        baseResp.setMessage("获取用户信用等级成功");
        baseResp.setData(userGradeEntityList);
        return GsonUtil.getInstance().toJson(baseResp);
    }

    @RequestMapping(value = "/login")
    public String login(@RequestParam(name = "username")String userName,
                        @RequestParam(name = "password")String userPassword){

        BaseResp<String> baseResp = new BaseResp<String>();

        if(userName.equals("admin")&&userPassword.equals("admin")){
            baseResp.setCode(BaseResp.SUCCESS);
            baseResp.setMessage("登录成功");
            return GsonUtil.getInstance().toJson(baseResp);

        }
        else{
            baseResp.setCode(BaseResp.FAIL);
            baseResp.setMessage("登录失败，用户名或密码错误");
            return GsonUtil.getInstance().toJson(baseResp);
        }
    }

    @RequestMapping(value = "/good")
    public String getGoodMessage(@RequestParam(name ="ognNumber")String ognNumber){
        BaseResp<GoodEntity> baseResp = new BaseResp<GoodEntity>();
        GoodEntity goodEntity = goodService.getGoodMessage(ognNumber);
        if(goodEntity!=null){
            baseResp.setMessage("成功找到该商品");
            baseResp.setCode(BaseResp.SUCCESS);
            baseResp.setData(goodEntity);
        }
        else {
            baseResp.setMessage("搜寻商品失败");
            baseResp.setCode(BaseResp.SUCCESS);
            baseResp.setData(null);
        }
        return GsonUtil.getInstance().toJson(baseResp);
    }
}
