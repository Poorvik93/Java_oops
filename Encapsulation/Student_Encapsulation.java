// // Demonstrate the Encapsulation in student class which have the data members are Rollnombers,name , Percentage, and age
// // provide security to all the data members and provide appropriate setter and getter methods;
// package java.OOPS.Encapsulation.Student;


//??--In the  below program we create a constructor and Pass the values in constructor--??

public class Student {
    // Private member variables representing student details
    private int rollNumber;     // Roll number of the student
    private String name;        // Name of the student
    private double percentage;  // Percentage achieved by the student
    private int age;            // Age of the student

    // Constructor to initialize a Student object with provided values
    public Student(int rollNumber, String name, double percentage, int age) {
        // Assigning the provided values to the respective member variables
        this.rollNumber = rollNumber;   // Assign provided roll number to the private member
        this.name = name;               // Assign provided name to the private member
        this.percentage = percentage;   // Assign provided percentage to the private member
        this.age = age;                 // Assign provided age to the private member
    }

    // Getter method to retrieve the roll number of the student
    public int getRollNumber() {
        return rollNumber;
    }

    // Getter method to retrieve the name of the student
    public String getName() {
        return name;
    }

    // Getter method to retrieve the percentage achieved by the student
    public double getPercentage() {
        return percentage;
    }

    // Getter method to retrieve the age of the student
    public int getAge() {
        return age;
    }
}


public class StudentApp {
    public static void main(String[] args) {
        Student s1 = new Student(12, "Poorvik", 77.2f, 22);
        System.out.println(s1.getRollNumber()+ "\n" + s1.getName() + "\n" + s1.getPercentage() + "\n" + s1.getAge());
    }
}

//// OutPut :-
//// 12
//// Poorvik
//// 77.19999694824219
//// 22
