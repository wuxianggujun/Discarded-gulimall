package com.wuxianggujun.gulimall.coupon.use_jackson;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

import java.io.IOException;
import java.text.SimpleDateFormat;

public class CouponSerialize extends JsonSerializer<Coupon> {
    
    @Override
    public void serialize(Coupon coupon, JsonGenerator jsonGenerator, 
                          SerializerProvider serializerProvider) throws IOException {
        //开始序列化标记
        jsonGenerator.writeStartObject();
        
        jsonGenerator.writeStringField("id",String.valueOf(coupon.getId()));
        jsonGenerator.writeStringField("userId",coupon.getUserId().toString());
        jsonGenerator.writeStringField("couponCode",coupon.getCouponCode());
        jsonGenerator.writeStringField("assignTime",new SimpleDateFormat("HH:mm:ss").format(coupon.getAssignTime()));
        jsonGenerator.writeStringField("status",coupon.getStatus().getCode().toString());
        jsonGenerator.writeStringField("name",coupon.getTemplate().getName());
        jsonGenerator.writeStringField("logo",coupon.getTemplate().getLogo());
        //结束序列化过程
        jsonGenerator.writeEndObject();
    }
}
