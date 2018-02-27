package com.example.vanxnf.tiweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by VanXN on 2018/2/27.
 * forecast字段
 */

public class Forecast {

    //白天天气状况代码
    @SerializedName("cond_code_d")
    public String dayWeatherCode;

    //晚间天气状况代码
    @SerializedName("cond_code_n")
    public String nightWeatherCode;

    //白天天气状况描述
    @SerializedName("cond_txt_d")
    public String dayWeatherDescription;

    //晚间天气状况描述
    @SerializedName("cond_txt_n")
    public String nightWeatherDescription;

    //预报日期
    public String date;

    //相对湿度
    public String hum;

    //月升时间
    public String mr;

    //月落时间
    public String ms;

    //降水量
    public String pcpn;

    //降水概率
    public String pop;

    //大气压强
    public String pres;

    //日出时间
    public String sr;

    //日落时间
    public String ss;

    //最高温度
    @SerializedName("tmp_max")
    public String maxTemperature;

    //最低温度
    @SerializedName("tmp_min")
    public String minTemperature;

    //紫外线强度指数
    @SerializedName("uv_index")
    public String uvIndex;

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
