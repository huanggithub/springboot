package com.huang.springboot.pojo;

import java.io.Serializable;

/**
 * create by Mr.huang
 * 666
 * 666
 */
public class Menu implements Serializable {
    private String mid;
    private String menu_name;
    private String menu_remark;
    private int menu_price;
    private int menu_sale;
    private String menu_img;

    @Override
    public String toString() {
        return "Menu{" +
                "mid='" + mid + '\'' +
                ", menu_name='" + menu_name + '\'' +
                ", menu_remark='" + menu_remark + '\'' +
                ", menu_price=" + menu_price +
                ", menu_sale=" + menu_sale +
                ", menu_img='" + menu_img + '\'' +
                '}';
    }

    public String getMid() {
        return mid;
    }

    public void setMid(String mid) {
        this.mid = mid;
    }

    public String getMenu_name() {
        return menu_name;
    }

    public void setMenu_name(String menu_name) {
        this.menu_name = menu_name;
    }

    public String getMenu_remark() {
        return menu_remark;
    }

    public void setMenu_remark(String menu_remark) {
        this.menu_remark = menu_remark;
    }

    public int getMenu_price() {
        return menu_price;
    }

    public void setMenu_price(int menu_price) {
        this.menu_price = menu_price;
    }

    public int getMenu_sale() {
        return menu_sale;
    }

    public void setMenu_sale(int menu_sale) {
        this.menu_sale = menu_sale;
    }

    public String getMenu_img() {
        return menu_img;
    }

    public void setMenu_img(String menu_img) {
        this.menu_img = menu_img;
    }

    public Menu() {
    }
}
