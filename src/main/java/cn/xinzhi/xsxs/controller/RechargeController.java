package cn.xinzhi.xsxs.controller;

import cn.xinzhi.xsxs.pojo.Pricetype;
import cn.xinzhi.xsxs.service.serviceimpl.RechargeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@CrossOrigin
@RestController
public class RechargeController {
    @Autowired
    private RechargeServiceImpl irs;

    public void setIrs(RechargeServiceImpl irs) {
        this.irs = irs;
    }
    @CrossOrigin
    @GetMapping("/xbrecharge")
    public List<Pricetype> xbRecharge(){
        List<Pricetype> recharge = irs.getRecharge(0);
        if (recharge != null){
            return recharge;
        }else{
            return null;
        }
    }
    @CrossOrigin
    @GetMapping("/yerecharge")
    public List<Pricetype> yeRecharge(){
        List<Pricetype> recharge = irs.getRecharge(1);
        if (recharge != null){
            return recharge;
        }else{
            return null;
        }
    }
}
