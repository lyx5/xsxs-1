package cn.xinzhi.xsxs.service;

import cn.xinzhi.xsxs.pojo.Rpacket;

import java.util.List;

public interface IRpacketService {
    public List<Rpacket> saveRpacket(Rpacket rpacket);
    public List<Rpacket> getRpacket();
    public Rpacket judgeRpacket(Rpacket rpacket);
}
