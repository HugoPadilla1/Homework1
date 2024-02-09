import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Person hugo = new Person(); // initializes person with default values // refer to Person()
        System.out.println(hugo);
        hugo.setName("Howard Roark"); // changes the name from "Hugo" to "Howard Roark"
        System.out.println(hugo);
        hugo.talk();
        // end of person
        Bike bike = new Bike(); // initializes a default bike ("Shwinn", 2 wheels, 12.5 top speed, 2014)
        System.out.println(bike);
        Bike bike2 = new Bike(); // initializes bike2 with default values // see above ^^^
        bike2.setManufacturer("Suzuki");
        bike2.setYearMade(2020);
        bike2.setTopSpeed(125); // new values defined for a Suzuki bike made in 2020 with a top speed of 125 mph.
        System.out.println(bike2);


    }
}