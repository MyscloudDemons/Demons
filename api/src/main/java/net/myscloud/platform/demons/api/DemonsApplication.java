package net.myscloud.platform.demons.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableCaching
@EnableScheduling
@SpringBootApplication
@EnableTransactionManagement
public class DemonsApplication {
    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(DemonsApplication.class);
        application.run(args);
    }
}