package part4Aggregation;

public class Course {
    // Instance vars
    private String courseName;
    private Instructor instructor;
    private Textbook textbook;

    // Constructor
    public Course(String courseName, Instructor instructor, Textbook textbook) {
        this.courseName = courseName;
        this.instructor = instructor;
        this.textbook = textbook;
    }

    // Getters
    public String getCourseName() {
        return courseName;
    }

    public Instructor getInstructor() {
        return instructor;
    }

    public Textbook getTextbook() {
        return textbook;
    }

    // Setters
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void setInstructor(Instructor instructor) {
        this.instructor = instructor;
    }

    public void setTextbook(Textbook textbook) {
        this.textbook = textbook;
    }

    public void print() {
        System.out.println(
                "Course name: " + getCourseName()
                        + ", Instructor: " + getInstructor().getFirstName() + " " + getInstructor().getLastName()
                        + ", Textbook: " + getTextbook().getTitle()
                        + ", Author: " + getTextbook().getAuthor()
                        + ", Publisher: " + getTextbook().getPublisher());
    }
}
