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
        ArrayList<Bike> bikeList = new ArrayList<>(); // making a new ArrayList to store our bikes
        bikeList.add(bike);
        bikeList.add(bike2);
        System.out.println(bikeList); // printing list of bikes
        int totalWheels = 0;
        for (Bike bike3 : bikeList){
            totalWheels += bike.getWheels(); // method to add the total number of wheels given in the array
        }
        System.out.println("Total Wheels: " + totalWheels);
        int year = 9999;
        for (Bike bike3 : bikeList){
            if (bike.getYearMade() < year){ // this method should find the lowest value of year from the list and replace our 'year' variable with it
                year = bike.getYearMade();
            }
        }
        System.out.println("The oldest bike was made in " + year); // this year is then called here and deemed the oldest bike
        // end of bike
        Textbook book = new Textbook();
        System.out.println(book);
        book.flipPage(); // attempting to flip our physics book
        Textbook book1 = new Textbook();
        book1.setName("Advanced Calculus");
        book1.setSubject("Mathematics");
        System.out.println(book1);
    }
}