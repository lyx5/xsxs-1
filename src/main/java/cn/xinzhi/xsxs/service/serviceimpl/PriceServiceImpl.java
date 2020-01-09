package cn.xinzhi.xsxs.service.serviceimpl;

import cn.xinzhi.xsxs.dao.IPriceDao;
import cn.xinzhi.xsxs.pojo.Paccount;
import cn.xinzhi.xsxs.pojo.Price;
import cn.xinzhi.xsxs.service.IPriceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("ips")
public class PriceServiceImpl implements IPriceService {
    @Autowired
    private IPriceDao iPriceDao;

    public void setiPriceDao(IPriceDao iPriceDao) {
        this.iPriceDao = iPriceDao;
    }

    @Override
    public String insertPrice(Price price) {
        if(price.getPxPrice() == null){
            price.setPxPrice(0);
        }
        if(price.getPxXb() == null){
            price.setPxXb(0);
        }
        int i = iPriceDao.insertPrice(price);
        if (i > 0){
            return "充值成功";
        }else{
            return "支付失败";
        }
    }
    @Override
    public Price getPrice(String papid) {
        if(papid != null){
            Paccount paccount = iPriceDao.selectPaccount(papid);
            Integer i = paccount.getAcid();
            Price price = iPriceDao.selectPrice(i);
            if(price != null){
                return price;
            }else{
                return null;
            }
        }else{
            return null;
        }
    }

    @Override
    public String update(Price price,Price price1) {
        Integer pxPrice = price1.getPxPrice();
        Integer pxXb = price1.getPxXb();
        price.setPiid(price1.getPiid());
        if(price.getPxPrice() != null){
            price.setPxPrice(price.getPxPrice() + pxPrice);
        }
        if(price.getPxXb() != null){
            price.setPxXb(price.getPxXb() + pxXb);
        }
        int i = iPriceDao.updatePrice(price);
        if (i > 0){
            return "充值成功";
        }else{
            return "充值失败";
        }
    }

    @Override
    public String setPrice(Price price, String papid) {
        Price price1 = getPrice(papid);
        if(price != null){
            if(price1 != null){
                String update = update(price,price1);
                return update;
            }else{
                Paccount paccount = iPriceDao.selectPaccount(papid);
                price.setPxPid(paccount.getAcid());
                String s = insertPrice(price);
                return s;
            }
        }else{
            return "暂无数据";
        }
    }

}
