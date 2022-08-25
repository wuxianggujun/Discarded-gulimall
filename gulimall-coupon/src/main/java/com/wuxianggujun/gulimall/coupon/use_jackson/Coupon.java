package com.wuxianggujun.gulimall.coupon.use_jackson;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
//@JsonInclude(JsonInclude.Include.NON_NULL)
//@JsonIgnoreProperties({"couponCode", "status"})
@JsonSerialize(using = CouponSerialize.class)
public class Coupon {

    //    @JsonIgnore
    private int id;

    //    @JsonProperty("user")
    private Long userId;

    private String couponCode;

    //    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "hh:mm:ss")
    private Date assignTime;

    private CouponStatus status;

    private CouponTemplate template;

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class CouponTemplate {
        private String name;
        private String logo;
    }

    public static Coupon fake() {
        return new Coupon(1, 100L, "123456", new Date(), CouponStatus.USABLE, new CouponTemplate("CouponTemplate", "imooc"));
    }
}
