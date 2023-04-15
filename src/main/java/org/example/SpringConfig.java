package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration

public class SpringConfig {
    @Bean
    public Message getSms() {
        return new Sms();
    }

    @Bean
    public Message getEmail() {
        return new Email();
    }
//    @Bean
//    public Notification getNotificationEmail(){
//        Notification notification=new Notification();
//        notification.setMessage(getEmail());
//        return  notification();
//    }
//    @Bean
//    public Notification getNotificationSms(){
//        Notification notification=new Notification();
//        notification.setMessage(getSms());
//        return  notification();
//    }

}
