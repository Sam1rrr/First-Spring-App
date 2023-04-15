package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
//        Email email=new Email();
//        Sms sms=new Sms();
//        Notification notification=new Notification(email); //constructor injection
//        Notification notification2=new Notification(sms);
//        Notification notification3=new Notification(); //constructor injection
//        notification3.setMessage(sms);
//
//
//        notification.alert();
//        notification2.alert();
//        notification3.alert();


        ApplicationContext applicationContextcontext = new AnnotationConfigApplicationContext(SpringConfig.class);
        Notification notification = applicationContextcontext.getBean("notification", Notification.class);
        notification.alert();

    }
}