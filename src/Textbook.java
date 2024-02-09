public class Textbook {
    private String name;

    private String author;

    private String subject;

    private int publishDate; // year of being published

    public Textbook(){ // empty constructor with our default values for a textbook
        this.name = "Understanding Mechanics";
        this.author = "Hugo J. Padilla";
        this.subject = "Physics";
        this.publishDate = 2016; // physics textbook authored by myself
    }

    public Textbook(String name, String author, String subject, int publishDate){ // 4 arg constructor with inserted values
        this.name = name;
        this.author = author;
        this.subject = subject;
        this.publishDate = publishDate;
    }

    // getters and setters for our data


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(int publishDate) {
        this.publishDate = publishDate;
    }

    // end of getters and setters

    public void flipPage(){
        System.out.println("You did not create enough friction to flip the page."); // physics reference
    }

    @Override
    public String toString() {
        return ("The textbook " + name + " for " + subject + " was authored by " + author + " in " + publishDate + ".");
    }
}
