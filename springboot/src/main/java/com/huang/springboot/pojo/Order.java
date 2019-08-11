package com.huang.springboot.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * create by Mr.huang
 * 666
 * 666
 */
public class Order implements Serializable {
    private String oid;
    private Date order_time;
    private int order_total_price;

    @Override
    public String toString() {
        return "Order{" +
                "oid='" + oid + '\'' +
                ", order_time=" + order_time +
                ", order_total_price=" + order_total_price +
                '}';
    }

    public String getOid() {
        return oid;
    }

    public void setOid(String oid) {
        this.oid = oid;
    }

    public Date getOrder_time() {
        return order_time;
    }

    public void setOrder_time(Date order_time) {
        this.order_time = order_time;
    }

    public int getOrder_total_price() {
        return order_total_price;
    }

    public void setOrder_total_price(int order_total_price) {
        this.order_total_price = order_total_price;
    }

    public Order() {
    }
}
