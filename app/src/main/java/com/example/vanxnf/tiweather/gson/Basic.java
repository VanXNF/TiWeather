package com.example.vanxnf.tiweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by VanXN on 2018/2/27.
 * Basic字段
 */

public class Basic {

    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update {

        @SerializedName("loc")
        public String updateTime;

    }
}
