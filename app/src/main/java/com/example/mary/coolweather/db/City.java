package com.example.mary.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by mary on 2017/9/22.
 */

public class City extends DataSupport{

    private int id;

    private int cityCode;

    private String cityName;

    private int provinceId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCityCode() {
        return cityCode;
    }

    public void setCityCode(int cityVode) {
        this.cityCode = cityVode;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public int getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(int provinceId) {
        this.provinceId = provinceId;
    }
}
