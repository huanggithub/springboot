package com.huang.springboot.pojo;

import java.io.Serializable;

/**
 * create by Mr.huang
 * 666
 * 666
 */
public class Item implements Serializable {
    private int iid;
    private String mid;
    private int item_number;
    private int item_subtotal;
    private String oid;
    @Override
    public String toString() {
        return "Item{" +
                "iid=" + iid +
                ", mid='" + mid + '\'' +
                ", item_number=" + item_number +
                ", item_subtotal=" + item_subtotal +
                ", oid='" + oid + '\'' +
                '}';
    }

    public int getIid() {
        return iid;
    }

    public void setIid(int iid) {
        this.iid = iid;
    }

    public String getMid() {
        return mid;
    }

    public void setMid(String mid) {
        this.mid = mid;
    }

    public int getItem_number() {
        return item_number;
    }

    public void setItem_number(int item_number) {
        this.item_number = item_number;
    }

    public int getItem_subtotal() {
        return item_subtotal;
    }

    public void setItem_subtotal(int item_subtotal) {
        this.item_subtotal = item_subtotal;
    }

    public String getOid() {
        return oid;
    }

    public void setOid(String oid) {
        this.oid = oid;
    }

    public Item() {
    }
}
