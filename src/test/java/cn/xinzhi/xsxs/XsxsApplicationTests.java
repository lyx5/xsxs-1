package cn.xinzhi.xsxs;


import cn.xinzhi.xsxs.util.RedPacketUtil;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class XsxsApplicationTests {

    @Test
    void contextLoads() {
        RedPacketUtil util = new RedPacketUtil();
        System.out.println(util.splitRedPackets(20, 10));
    }
}
