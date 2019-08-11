package com.huang.springboot.web;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.huang.springboot.entity.Result;
import com.huang.springboot.mapper.ItemMapper;
import com.huang.springboot.mapper.MenuMapper;
import com.huang.springboot.mapper.OrderMapper;
import com.huang.springboot.pojo.Item;
import com.huang.springboot.pojo.Menu;
import com.huang.springboot.pojo.Order;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.*;

/**
 * create by Mr.huang
 * 666
 * 666
 */
@Controller
@RequestMapping("/")
public class MenuController {
    @Autowired(required = false)
    private MenuMapper menuMapper;
    @Autowired(required = false)
    private OrderMapper orderMapper;
    @Autowired(required = false)
    private ItemMapper itemMapper;
    @RequestMapping("findmenu")
    @ResponseBody
    public Result findMenu(){
        List<Menu> menu = new ArrayList<>();
        try {
            menu = menuMapper.findMenu();
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false,"请求菜单失败");
        }

        return new Result(true,"请求菜单成功",menu);
    }


    @RequestMapping("submitorder")
    @ResponseBody
    public Result submitOrder(@RequestParam Map map){
        try {
            System.out.println(map);
            String oid = UUID.randomUUID().toString().substring(0,10);
            Order order = new Order();
            order.setOid(oid);
            order.setOrder_time(new Date());
            order.setOrder_total_price(Integer.parseInt((String) map.get("totalPrice")));
            orderMapper.add(order);
//            List = JSONArray.parse();
            List o = JSONObject.parseArray((String) map.get("order"));
//            map.get("order")
//            List<HashMap> o = (List) map.get("order");
            for ( Object o1 : o) {
                Map m = new HashMap();
                m = (Map) o1;
                Item item = new Item();
                item.setItem_number(Integer.parseInt(m.get("item_number").toString()));
                item.setItem_subtotal(Integer.parseInt(m.get("item_subtotal").toString()));
                item.setMid( m.get("mid").toString());
                item.setOid(oid);
                itemMapper.add(item);
            }
        } catch (NumberFormatException e) {
            e.printStackTrace();
            return null;
        }
        return new Result(true,"提交成功");
    }
}
