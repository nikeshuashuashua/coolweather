package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * Created by xiaoxin on 2018/6/7.
 */

public class Province extends DataSupport {

    private int id; //每个实体类中都有的名字
    private String provinceName; //记录省的名字
    private int provinceCode; //记录省的代号
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public int getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }


}
