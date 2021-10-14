package config;

import main.Job;
import main.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ParameterConfig {

    // If we add another bean as parameter, Spring looks for it in the context and provides it for us
    @Bean
    Person person(Job job){
        Person p = new Person();
        p.setName("Mrs Dudette");
        // Here Spring looked for a Job type Bean and gave it to us as a parameter
        p.setJob(job);

        return p;
    }

    @Bean
    Job job(){
        Job j = new Job();
        j.setPosition("Test");
        j.setDescription("Even less effort than example.");
        return j;
    }
}
