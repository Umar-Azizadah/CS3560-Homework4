package part4Aggregation;

public class AggregationDriver {
    public static void main(String[] args) {

        Instructor instructor1 = new Instructor("Nima", "Davarpanah", "3-2636");
        Textbook textbook1 = new Textbook("Clean Code", "Symere Woods", "RocNation");

        Course course = new Course("CS3560", instructor1, textbook1);

        course.print();
    }
}
