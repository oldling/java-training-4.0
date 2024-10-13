package src;

public class Student {

    private String name;
    static double ratingSum;
    static int count;
    int rating;

    public Student(String name) {
        this.name = name;
        count ++;
    }

    public static double getAvgRating() {
        if(count == 0) {
            return 0;
        } else {
            return ratingSum / count;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
        ratingSum += rating;
    }

    public boolean betterStudent(Student student) {
        return rating >= student.getRating();
    }

    public void changeRating(int rating) {
        ratingSum -= this.getRating();
        this.rating = rating;
        ratingSum += this.getRating();
    }

    public static void removeStudent(Student student) {
        ratingSum -= student.getRating();
        count --;
    }

    @Override
    public String toString() {
        return String.format("Student: %s, Rating: %d", this.name, this.rating);
    }

    // In the method main() create 3 objects of Student type and input information about them.
    public static void main(String[] args) {
        Student studentNum1 = new Student("Sergii");
        studentNum1.setRating(80);

        Student studentNum2 = new Student("Valera");
        studentNum2.setRating(95);

        Student studentNum3 = new Student("Masha");
        studentNum3.setName("Maria");
        studentNum3.setRating(100);

        System.out.println("Average rating of all students: " + Student.getAvgRating()); //Display the average rating of all students.

        studentNum2.changeRating(120); //Change the rating of any student.

        System.out.println("Updated average rating of all students: " + Student.getAvgRating()); //Display the new average rating

    }
}