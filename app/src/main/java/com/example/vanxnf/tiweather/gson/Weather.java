package com.example.vanxnf.tiweather.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by VanXN on 2018/2/27.
 * weather总
 */

public class Weather {

    public String status;

    public Basic basic;

    public Update update;

    public Now now;

    @SerializedName("daily_forecast")
    public List<Forecast> forecastList;

    @SerializedName("lifestyle")
    public List<Lifestyle> lifestyleList;
}
