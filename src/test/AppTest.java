package test;

import country.service.IServiceWorker;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppTest {


    ApplicationContext applicationContext =
            new ClassPathXmlApplicationContext("beans/*.xml");
    IServiceWorker serviceWorker = applicationContext.getBean(IServiceWorker.class);



}
