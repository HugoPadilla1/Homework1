public class Person {
    private String name; // String for name - self expl.

    private int age; // int for age ex. 18, 20, 22.

    private String eyeColor; // String for eyeColor ex. "Red", "Green", "Blue".

    public Person(){ // empty constructor allows for default values when unspecified
        this.name = "Hugo"; // i am the default
        this.age = 19;
        this.eyeColor = "Brown";
    }

    public Person(String name, int age, String eyeColor){ // 3 arg constructor that allows for custom Person creation
        this.name = name;
        this.age = age;
        this.eyeColor = eyeColor;
    }

    public int getAge() { // Age getter and setters
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEyeColor() { // Eye color getter and setters
        return eyeColor;
    }

    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }

    public String getName() { // Name getter and setters
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return ("A person called " + name + " is " + age + " years old, with an eye color of " + eyeColor + ".");
    }

    public void talk(){
        System.out.println("Welcome, coders! I am " + name + "!");
    }
}
