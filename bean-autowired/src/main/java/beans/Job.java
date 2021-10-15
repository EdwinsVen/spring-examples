package beans;

import org.springframework.stereotype.Component;

// We use the component annotation to avoid having to initialize the instance in the config class
@Component
public class Job {
    private String position = "Dev";

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return "position: " + position;
    }
}
