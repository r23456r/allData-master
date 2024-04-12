package cn.datax.service.data.masterdata;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients(basePackages = {"cn.datax.service.system.api.feign", "cn.datax.service.workflow.api.feign"})
@SpringBootApplication
public class DataxMasterdataApplication {

    public static void main(String[] args) {
        SpringApplication.run(DataxMasterdataApplication.class);
    }
}
