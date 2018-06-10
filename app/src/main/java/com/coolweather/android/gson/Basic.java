package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by xiaoxin on 2018/6/10.
 */

public class Basic {
    @SerializedName("city")//使用@SerializedName注解的方式让JSON字段和Java字段之间建立映射关系
    public String cityName;//城市名

    @SerializedName("id")
    public String weatherId;//城市对应的天气ID

    public Update update;

    public class Update {

        @SerializedName("loc")//表示天气的更新时间
        public String updateTime;

    }
}
