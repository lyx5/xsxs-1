package cn.xinzhi.xsxs.controller;

import cn.xinzhi.xsxs.pojo.Price;
import cn.xinzhi.xsxs.service.IPriceService;
import cn.xinzhi.xsxs.service.serviceimpl.PriceServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
public class PriceController {
    @Autowired
    private PriceServiceImpl ips;

    public void setIps(PriceServiceImpl ips) {
        this.ips = ips;
    }

    @CrossOrigin
    @GetMapping("/sPrice/{papid}")
    public Price getPrice(@PathVariable("papid")  String papid){
        Price price = ips.getPrice(papid);
        return price;
    }
    @CrossOrigin
    @PostMapping(value = "/uPrice/{papid1}",consumes = "application/json",produces = "application/json")
    public String up(@PathVariable("papid1") String papid,@RequestBody Price price){
        if(price != null){
            String s = ips.setPrice(price, papid);
            return s;
        }else{
            return "再见";
        }
    }
}
