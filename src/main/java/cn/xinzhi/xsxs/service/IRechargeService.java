package cn.xinzhi.xsxs.service;

import cn.xinzhi.xsxs.pojo.Pricetype;
import org.springframework.stereotype.Service;

import java.util.List;


public interface IRechargeService {
    List<Pricetype> getRecharge(int type);
}
