package main;

public class Job {
    private String position;
    private String description;


    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString(){
        return "Position: " + position + System.lineSeparator() +
                "Description: " + description + System.lineSeparator();
    }
}
