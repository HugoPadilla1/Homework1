public class Bike {
    private String manufacturer;

    private int yearMade;

    private int wheels;

    private double topSpeed; // added data for our bike

    public Bike(){ // empty constructor with default values for when not specified
        this.manufacturer = "Schwinn";
        this.yearMade = 2014;
        this.wheels = 2;
        this.topSpeed = 12.5;
    }

    public Bike(String manufacturer, int yearMade, int wheels, double topSpeed){ // 4-arg constructor for creating custom bikes
        this.manufacturer = manufacturer;
        this.yearMade = yearMade;
        this.wheels = wheels;
        this.topSpeed = topSpeed;
    }

    // getters and setters for manufacturer, yearMade, wheels, and topSpeed
    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getYearMade() {
        return yearMade;
    }

    public void setYearMade(int yearMade) {
        this.yearMade = yearMade;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public double getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(double topSpeed) {
        this.topSpeed = topSpeed;
    }

    @Override
    public String toString() {
        return ("A bike from " + yearMade + " made by " + manufacturer + " with " + wheels + " wheel(s) has a top speed of " + topSpeed + " mph.");
    }
}
