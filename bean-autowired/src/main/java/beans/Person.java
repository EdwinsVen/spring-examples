package beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Person {
    private String name = "Dude";

    // The @Autowired annotation we tell Spring to look for a Job instance in the context and inject the value here
    // Problem with this is that you cannot make it final.
    // The @qalifier tag is used to choose exactly what bean we want, in case there are more than one of the same type
    @Autowired
    @Qualifier("job1")
    private Job job;

    // This one will be injected through the setter
    private PhoneNumber number;

    // Here we don't inject the instance in the class field, but in the constructor
    // This also allows us to make the field final
    private final Location location;

    // Here Spring uses this constructor and looks for a Location in the context to inject here
    @Autowired
    public Person(Location location) {
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Job getJob() {
        return job;
    }

    public void setJob(Job job) {
        this.job = job;
    }

    public Location getLocation() {
        return location;
    }

    public PhoneNumber getNumber() {
        return number;
    }

    // In this case the injection happens in the setter
    @Autowired
    public void setNumber(PhoneNumber number) {
        this.number = number;
    }
}
