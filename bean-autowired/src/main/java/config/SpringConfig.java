package config;

import beans.Job;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "beans")
public class SpringConfig {

    @Bean
    Job job1(){
        Job j = new Job();
        j.setPosition("Inside Bean");
        return j;
    }

    @Bean
    Job job2(){
        Job j = new Job();
        j.setPosition("Inside Bean2");
        return j;
    }
}
