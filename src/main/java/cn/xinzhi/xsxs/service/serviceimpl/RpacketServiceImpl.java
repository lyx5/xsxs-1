package cn.xinzhi.xsxs.service.serviceimpl;

import cn.xinzhi.xsxs.dao.IRpacketDao;
import cn.xinzhi.xsxs.pojo.Rpacket;
import cn.xinzhi.xsxs.service.IRpacketService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class RpacketServiceImpl implements IRpacketService {
    @Autowired
    private IRpacketDao iRpacketDao;

    public void setiRpacketDao(IRpacketDao iRpacketDao) {
        this.iRpacketDao = iRpacketDao;
    }

    @Override
    public List<Rpacket> saveRpacket(Rpacket rpacket) {
        if(rpacket != null){
            int i = iRpacketDao.insertRP(rpacket);
            if (i > 0){
                getRpacket();
            }
        }
        return null;
    }

    @Override
    public List<Rpacket> getRpacket() {
        List<Rpacket> rpackets = iRpacketDao.selectRP();
        if (rpackets != null){
            return rpackets;
        }else{
            return null;
        }
    }

    @Override
    public Rpacket judgeRpacket(Rpacket rpacket) {
        if (rpacket != null){
            if((rpacket.getRpAmount() >= 10) && (rpacket.getRpNum() >= 10 && rpacket.getRpNum() <= rpacket.getRpAmount())){
            }
        }
        return null;
    }
}
