package beans;

import org.springframework.stereotype.Component;

@Component
public class Location {
    private String city = "NYC";
    private String state = "NY";

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return city + ", " + state;
    }
}
