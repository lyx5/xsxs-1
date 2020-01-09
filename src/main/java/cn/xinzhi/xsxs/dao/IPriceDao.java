package cn.xinzhi.xsxs.dao;

import cn.xinzhi.xsxs.pojo.Paccount;
import cn.xinzhi.xsxs.pojo.Price;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository("iPriceDao")
public interface IPriceDao {
    int insertPrice(@Param("iprice") Price price);
    int updatePrice(@Param("uprice") Price price);
    Price selectPrice(@Param("priceid") Integer priceid);
    Paccount selectPaccount(@Param("apapid") String papid);
}
