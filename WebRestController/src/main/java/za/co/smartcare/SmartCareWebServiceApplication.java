package za.co.smartcare;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource({"classpath:applicationContext.xml"})
public class SmartCareWebServiceApplication {

    //
    public static void main(String[] args) {

       SpringApplication.run(SmartCareWebServiceApplication.class, args);
    }

}
