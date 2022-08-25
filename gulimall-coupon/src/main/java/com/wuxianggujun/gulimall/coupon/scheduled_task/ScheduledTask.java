package com.wuxianggujun.gulimall.coupon.scheduled_task;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@SuppressWarnings("all")
public class ScheduledTask {
    @Scheduled(fixedRate = 1000)
    public void task01() throws Exception {
        System.out.println("Schedule Task process task01.");
        while (true) {
            Thread.sleep(2000);
            System.out.println("Schedule Task process something!");
        }
    }
    
    @Scheduled(fixedRate = 1000)
    public void task02() throws Exception {
        System.out.println("Schedule Task process task02.");
    }
}
