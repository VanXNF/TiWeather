package com.example.vanxnf.tiweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by VanXN on 2018/2/27.
 * now字段
 */

public class Now {

    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More {

        @SerializedName("txt")
        public String info;

    }
}
