package com.example.coolweather.db;

import org.litepal.crud.DataSupport;
import org.xml.sax.SAXException;

/**
 * Created by Administrator on 2018/1/7.
 */

public class 城市 extends DataSupport {

    private int 城市id;

    private String 城市名;

    private int 城市代号;

    private int 所属城市id;

    public int get城市id() {
        return 城市id;
    }

    public void set城市id(int 城市id) {
        this.城市id = 城市id;
    }

    public String get城市名() {
        return 城市名;
    }

    public void set城市名(String 城市名) {
        this.城市名 = 城市名;
    }

    public int get城市代号() {
        return 城市代号;
    }

    public void set城市代号(int 城市代号) {
        this.城市代号 = 城市代号;
    }

    public int get所属城市id() {
        return 所属城市id;
    }

    public void set所属城市id(int 所属城市id) {
        this.所属城市id = 所属城市id;
    }




}
