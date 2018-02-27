package com.example.vanxnf.tiweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by VanXN on 2018/2/27.
 * Basic字段
 */

public class Basic {

    //地区／城市ID
    @SerializedName("cid")
    public String weatherId;

    //地区／城市名称
    @SerializedName("location")
    public String cityName;

    //该地区／城市的上级城市
    @SerializedName("parent_city")
    public String parentCity;

    //该地区／城市所属行政区域
    @SerializedName("admin_area")
    public String adminArea;

    //该地区／城市所属国家名称
    public String cnty;

    //经度
    public String lat;

    //纬度
    public String lon;

    //时区
    public String tz;

}
