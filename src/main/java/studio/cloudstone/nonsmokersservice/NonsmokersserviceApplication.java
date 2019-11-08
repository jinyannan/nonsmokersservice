package studio.cloudstone.nonsmokersservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

//@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
@SpringBootApplication
public class NonsmokersserviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(NonsmokersserviceApplication.class, args);
    }

}
