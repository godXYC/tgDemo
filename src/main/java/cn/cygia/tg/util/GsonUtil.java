package cn.cygia.tg.util;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * Gson对象单例类
 * Author:xzw
 * date:2018/01/05
 */

public class GsonUtil {


    private GsonUtil(){

    }

    public static Gson getInstance() {
        return GsonHolder.instance;
    }

    private static class GsonHolder {
        public static Gson instance = new GsonBuilder()
                .setPrettyPrinting()
                .disableHtmlEscaping()
                .setDateFormat("yyyy-MM-dd HH:mm:ss").create();
    }

}
