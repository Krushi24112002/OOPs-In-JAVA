
// Refer To a Current Class Instance Variable Using This Keyword

// Creating Class
class Student {

    // Creating Class Properties
    String Name;
    int RollNumber;
    String College;

    // Creating Parameterizes Constructor
    Student(String Name, int RollNumber, String College) {
        this.Name = Name;
        this.RollNumber = RollNumber;
        this.College = College;
    }

    // Creating Class Print Function
    void StudentDeatil() {
        System.out.println("Your Name Is " + Name);
        System.out.println("Your College Name Is " + College);
        System.out.println("Your Roll Number Is " + RollNumber);
    }
}

public class OOPsreferToaCurrentClassInstanceVariableUsingThisKeyword {

    public static void main(String[] args) {

        // Creating Object
        Student s1 = new Student("KRUSHI", 37, "SPB PATEL ENGINEERIN COLLEGE");
        s1.StudentDeatil();
    }
}