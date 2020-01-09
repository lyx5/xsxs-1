package cn.xinzhi.xsxs.controller;

import cn.xinzhi.xsxs.pojo.Balanceconsumptiondetail;
import cn.xinzhi.xsxs.pojo.Xbconsumptiondetail;
import cn.xinzhi.xsxs.service.IConsumptionService;
import cn.xinzhi.xsxs.service.serviceimpl.ConsumptionServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@CrossOrigin
@RestController
public class ConsumptionController {
    public void setConsumptionService(ConsumptionServiceImpl consumptionService) {
        ConsumptionService = consumptionService;
    }

    @Autowired
    private ConsumptionServiceImpl ConsumptionService;


    public String pay(int money,String papid){
        return null;
    }
    @CrossOrigin
    @PostMapping(value = "/yeinearn",consumes = "application/json",produces = "application/json")
    @ResponseBody
    public String insertBae(@RequestBody Balanceconsumptiondetail balanceconsumptiondetail){
        String s = null;
        if (balanceconsumptiondetail != null){
            balanceconsumptiondetail.setBcdTime(new Date());
            balanceconsumptiondetail.setBcdType(0);
            s = ConsumptionService.insertBaConsumption(balanceconsumptiondetail);
        }else{
            s = "拜拜";
        }
        return s;
    }
    @CrossOrigin
    @PostMapping(value = "/yeinexpend",consumes = "application/json",produces = "application/json")
    public String insertBax(@RequestBody Balanceconsumptiondetail balanceconsumptiondetail){
        String s = null;
        if (balanceconsumptiondetail != null){
            balanceconsumptiondetail.setBcdTime(new Date());
            balanceconsumptiondetail.setBcdType(1);
            s = ConsumptionService.insertBaConsumption(balanceconsumptiondetail);
        }else{
            s = "拜拜";
        }
        return s;
    }
    @CrossOrigin
    @GetMapping (value = "/yeseearn/{papide}",consumes = "application/json",produces = "application/json")
    public List<Balanceconsumptiondetail> selectBae(@PathVariable("papide") String papid){
        if(papid != null){
            Balanceconsumptiondetail balanceconsumptiondetail = new Balanceconsumptiondetail();
            balanceconsumptiondetail.setPaPid(papid);
            balanceconsumptiondetail.setBcdType(0);
            List<Balanceconsumptiondetail> baConsumption = ConsumptionService.getBaConsumption(balanceconsumptiondetail);
            return baConsumption;
        }else{
            return null;
        }
    }
    @CrossOrigin
    @GetMapping(value = "/yeseexpend/{papidx}",consumes = "application/json",produces = "application/json")
    public List<Balanceconsumptiondetail> selectBax(@PathVariable("papidx") String papid){
        if(papid != null){
            Balanceconsumptiondetail balanceconsumptiondetail = new Balanceconsumptiondetail();
            balanceconsumptiondetail.setPaPid(papid);
            balanceconsumptiondetail.setBcdType(1);
            List<Balanceconsumptiondetail> baConsumption = ConsumptionService.getBaConsumption(balanceconsumptiondetail);
            return baConsumption;
        }else{
            return null;
        }
    }
    @CrossOrigin
    @PostMapping(value = "/xbinearn",consumes = "application/json",produces = "application/json")
    @ResponseBody
    public String insertXbn(@RequestBody Xbconsumptiondetail xbconsumptiondetail){
        String s = null;
        if (xbconsumptiondetail != null){
            xbconsumptiondetail.setXcdTime(new Date());
            xbconsumptiondetail.setXcdType(0);
            s = ConsumptionService.insertXbConsumption(xbconsumptiondetail);
        }else{
            s = "拜拜";
        }
        return s;
    }
    @CrossOrigin
    @PostMapping(value = "/xbinexpend",consumes = "application/json",produces = "application/json")
    @ResponseBody
    public String insertXbx(@RequestBody Xbconsumptiondetail xbconsumptiondetail){
        String s = null;
        if (xbconsumptiondetail != null){
            xbconsumptiondetail.setXcdTime(new Date());
            xbconsumptiondetail.setXcdType(1);
            s = ConsumptionService.insertXbConsumption(xbconsumptiondetail);
        }else{
            s = "拜拜";
        }
        return s;
    }
    @CrossOrigin
    @GetMapping (value = "/xbseearn/{papidb}",consumes = "application/json",produces = "application/json")
    public List<Xbconsumptiondetail> selectxbe(@PathVariable("papidb") String papid){
        if(papid != null){
            Xbconsumptiondetail xbconsumptiondetail = new Xbconsumptiondetail();
            xbconsumptiondetail.setPaPid(papid);
            xbconsumptiondetail.setXcdType(0);
            List<Xbconsumptiondetail> xbConsumption = ConsumptionService.getXbConsumption(xbconsumptiondetail);
            return xbConsumption;
        }else{
            return null;
        }
    }
    @CrossOrigin
    @GetMapping (value = "/xbseearn/{papidb}",consumes = "application/json",produces = "application/json")
    public List<Xbconsumptiondetail> selectxbs(@PathVariable("papidb") String papid){
        if(papid != null){
            Xbconsumptiondetail xbconsumptiondetail = new Xbconsumptiondetail();
            xbconsumptiondetail.setPaPid(papid);
            xbconsumptiondetail.setXcdType(0);
            List<Xbconsumptiondetail> xbConsumption = ConsumptionService.getXbConsumption(xbconsumptiondetail);
            return xbConsumption;
        }else{
            return null;
        }
    }
}
