package hello;

import javafx.application.Application;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;

/**
 * Created by ngocl on 11/30/2015.
 */
@SpringBootApplication
public class HelloWorld extends SpringBootServletInitializer {
    public static void main(String[] args) {
        SpringApplication.run(HelloWorld.class,args);
    }
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(applicationClass);
    }

    private static Class<HelloWorld> applicationClass = HelloWorld.class;
}
