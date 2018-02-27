package com.example.vanxnf.tiweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by VanXN on 2018/2/27.
 * now字段
 */

public class Now {

    //云量
    public String cloud;

    //天气状况代码
    @SerializedName("cond_code")
    public String condCode;

    //天气状况代码
    @SerializedName("cond_txt")
    public String condText;

    //体感温度，默认单位：摄氏度
    public String fl;

    //相对湿度
    public String hum;

    //降水量
    public String pcpn;

    //大气压强
    public String pres;

    //温度，默认单位：摄氏度
    public String tmp;

    //能见度，单位：公里
    public String vis;

    //风向360角度
    @SerializedName("wind_deg")
    public String windDeg;

    //风向
    @SerializedName("wind_dir")
    public String windDir;

    //风力
    @SerializedName("wind_sc")
    public String windSc;

    //风速，公里/小时
    @SerializedName("wind_spd")
    public String windSpd;

}
