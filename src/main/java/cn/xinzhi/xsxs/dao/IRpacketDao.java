package cn.xinzhi.xsxs.dao;

import cn.xinzhi.xsxs.pojo.Rpacket;
import cn.xinzhi.xsxs.pojo.Userinfo;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository("ird")
public interface IRpacketDao {
    int insertRP(@Param("rp")Rpacket rp);
    List<Rpacket> selectRP();
}
