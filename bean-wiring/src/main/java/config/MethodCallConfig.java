package config;

import main.Job;
import main.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MethodCallConfig {

    @Bean
    Person person(){
        Person p = new Person();
        p.setName("Mr Dude");
        // Here we call the other bean in order to link them together
        p.setJob(job());

        return p;
    }

    @Bean
    Job job(){
        Job j = new Job();
        j.setPosition("Example");
        j.setDescription("Those working as Examples must appear when someone is needed but no one shows up.");
        return j;
    }
}
