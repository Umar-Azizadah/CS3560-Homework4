package part4Aggregation;

public class AggregationDriver {
    public static void main(String[] args) {

        Instructor instructor1 = new Instructor("Nima", "Davarpanah", "3-2636");
        Instructor instructor2 = new Instructor("John", "Smith", "8-101");

        Textbook textbook1 = new Textbook("Clean Code", "Symere Woods", "RocNation");

        Textbook textbook2 = new Textbook("Effective Java", "Umar Azizadah", "CPP");

        Course course = new Course(
                "CS3560",
                instructor1,
                instructor2,
                textbook1,
                textbook2);

        course.print();
    }
}
