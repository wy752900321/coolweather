package com.example.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by Administrator on 2018/1/7.
 */

public class 县 extends DataSupport{

    private int 县id;

    private String 县名;

    private String 天气查询id;

    private int 所属城市id;

    public int get县id() {
        return 县id;
    }

    public void set县id(int 县id) {
        this.县id = 县id;
    }

    public String get县名() {
        return 县名;
    }

    public void set县名(String 县名) {
        this.县名 = 县名;
    }

    public String get天气查询id() {
        return 天气查询id;
    }

    public void set天气查询id(String 天气查询id) {
        this.天气查询id = 天气查询id;
    }

    public int get所属城市id() {
        return 所属城市id;
    }

    public void set所属城市id(int 所属城市id) {
        this.所属城市id = 所属城市id;
    }


}
