package com.example.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by Administrator on 2018/1/7.
 */

public class 省 extends DataSupport{
    private int 省id;

    private String 省名;

    private int 省代号;

    public int get省id() {
        return 省id;
    }

    public void set省id(int 省id) {
        this.省id = 省id;
    }

    public String get省名() {
        return 省名;
    }

    public void set省名(String 省名) {
        this.省名 = 省名;
    }

    public int get省代号() {
        return 省代号;
    }

    public void set省代号(int 省代号) {
        this.省代号 = 省代号;
    }




}
