package cn.xinzhi.xsxs.service;

import cn.xinzhi.xsxs.pojo.Price;
import org.springframework.stereotype.Service;


public interface IPriceService {
    String insertPrice(Price price);
    Price getPrice(String papid);
    String update(Price price,Price price1);
    String setPrice(Price price,String papid);
}
