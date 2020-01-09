package cn.xinzhi.xsxs.dao;

import cn.xinzhi.xsxs.pojo.Pricetype;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface IRechargeDao {
    List<Pricetype> selectRecharge(@Param("type") int type);
}
