package com.wuxianggujun.gulimall.coupon;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.wuxianggujun.gulimall.coupon.use_jackson.Coupon;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class TestObjectMapper {

    @Autowired
    private ObjectMapper mapper;

    @Test
    public void testUseJacksonAnnotation() throws Exception {
        Coupon coupon = Coupon.fake();
//        coupon.setTemplate(null);
        System.out.printf("coupon = %s%n", mapper.writeValueAsString(coupon));

    }
}
