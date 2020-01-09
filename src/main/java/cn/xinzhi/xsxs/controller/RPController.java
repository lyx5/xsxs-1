package cn.xinzhi.xsxs.controller;

import cn.xinzhi.xsxs.service.IRpacketService;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RPController {
    private IRpacketService irps;

    public void setIrps(IRpacketService irps) {
        this.irps = irps;
    }
}
