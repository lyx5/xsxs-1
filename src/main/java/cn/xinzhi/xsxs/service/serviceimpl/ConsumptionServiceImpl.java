package cn.xinzhi.xsxs.service.serviceimpl;

import cn.xinzhi.xsxs.dao.IConsumptionDao;
import cn.xinzhi.xsxs.pojo.Balanceconsumptiondetail;
import cn.xinzhi.xsxs.pojo.Xbconsumptiondetail;
import cn.xinzhi.xsxs.service.IConsumptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("iics")
public class ConsumptionServiceImpl implements IConsumptionService {
    @Autowired
    private IConsumptionDao iConsumptionDao;

    public void setiConsumptionDao(IConsumptionDao iConsumptionDao) {
        this.iConsumptionDao = iConsumptionDao;
    }

    @Override
    public String insertBaConsumption(Balanceconsumptiondetail balanceconsumptiondetail) {
        if(balanceconsumptiondetail != null){
            String s = null;
            int i = iConsumptionDao.InsertYE(balanceconsumptiondetail);
            if(i >0){
                if(balanceconsumptiondetail.getBcdType() == 0){
                    s = "充值成功";
                }
                if(balanceconsumptiondetail.getBcdType() == 1){
                    s = "支付成功";
                }
            }else{
                s = "支付失败";
            }
            return s;
        }else{
            return "再见";
        }
    }

    @Override
    public String insertXbConsumption(Xbconsumptiondetail xbconsumptiondetail) {
        if(xbconsumptiondetail != null){
            String s = null;
            int i = iConsumptionDao.InsertXB(xbconsumptiondetail);
            if(i >0){
                if(xbconsumptiondetail.getXcdType() == 0){
                    s = "充值成功";
                }
                if(xbconsumptiondetail.getXcdType() == 1){
                    s = "支付成功";
                }
            }else{
                s = "支付失败";
            }
            return s;
        }else{
            return "再见";
        }
    }

    @Override
    public List<Balanceconsumptiondetail> getBaConsumption(Balanceconsumptiondetail balanceconsumptiondetail) {
        if(balanceconsumptiondetail != null){
            List<Balanceconsumptiondetail> selectba = iConsumptionDao.selectba(balanceconsumptiondetail);
            return selectba;
        }else {
            return null;
        }
    }

    @Override
    public List<Xbconsumptiondetail> getXbConsumption(Xbconsumptiondetail xbconsumptiondetail) {
        if(xbconsumptiondetail != null){
            List<Xbconsumptiondetail> selectxb = iConsumptionDao.selectxb(xbconsumptiondetail);
            return selectxb;
        }else{
            return null;
        }
    }
}
