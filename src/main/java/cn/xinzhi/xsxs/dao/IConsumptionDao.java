package cn.xinzhi.xsxs.dao;

import cn.xinzhi.xsxs.pojo.Balanceconsumptiondetail;
import cn.xinzhi.xsxs.pojo.Paccount;
import cn.xinzhi.xsxs.pojo.Price;
import cn.xinzhi.xsxs.pojo.Xbconsumptiondetail;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface IConsumptionDao {
    int InsertXB(@Param("xbmx")Xbconsumptiondetail xbconsumptiondetail);
    int InsertYE(@Param("yemx")Balanceconsumptiondetail balanceconsumptiondetail);
    List<Xbconsumptiondetail> selectxb(@Param("xb") Xbconsumptiondetail xbconsumptiondetail);
    List<Balanceconsumptiondetail> selectba(@Param("ba") Balanceconsumptiondetail balanceconsumptiondetail);
}
