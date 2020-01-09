package cn.xinzhi.xsxs.service.serviceimpl;

import cn.xinzhi.xsxs.dao.IRechargeDao;
import cn.xinzhi.xsxs.pojo.Pricetype;
import cn.xinzhi.xsxs.service.IRechargeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("irs")
public class RechargeServiceImpl implements IRechargeService {
    @Autowired
    private IRechargeDao ird;

    public void setiRechargeDao(IRechargeDao iRechargeDao) {
        this.ird = iRechargeDao;
    }

    @Override
    public List<Pricetype> getRecharge(int type) {
        List<Pricetype> pricetypes = ird.selectRecharge(type);
        if (pricetypes != null){
            return pricetypes;
        }else{
            return null;
        }
    }
}
