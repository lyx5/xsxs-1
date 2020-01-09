package cn.xinzhi.xsxs.service;

import cn.xinzhi.xsxs.pojo.Balanceconsumptiondetail;
import cn.xinzhi.xsxs.pojo.Xbconsumptiondetail;

import java.util.List;
public interface IConsumptionService {
    String insertBaConsumption(Balanceconsumptiondetail balanceconsumptiondetail);
    String insertXbConsumption(Xbconsumptiondetail xbconsumptiondetail);
    List<Balanceconsumptiondetail> getBaConsumption(Balanceconsumptiondetail balanceconsumptiondetail);
    List<Xbconsumptiondetail> getXbConsumption(Xbconsumptiondetail xbconsumptiondetail);
}