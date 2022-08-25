package com.wuxianggujun.gulimall.coupon.use_jackson;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ObjectMapperConfig {
    
    @Bean
    @Primary //多个同样的bean，优先使用这个bean
    public ObjectMapper objectMapper(){
        ObjectMapper mapper = new ObjectMapper();
        //忽略json字符串中不识别的字段
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES,false);
        return mapper;
    }
}
