import java.util.*;

public class OOPsAccessSpecifiers {

    // Create Class
    static class Person {

        // Create Properties

        // Private Properties
        private int age;
        // Public Properties
        public String name;

        // Method-1 Getter
        int getage() {
            return age;
        }

        // Methode-2 Setter
        void setage(int n) {

            // This Keyword Refers To Current instance Itself
            this.age = n;
            // OR
            // age = n; This Type Can Also Write
        }

        // This Function Use Direct Assecc Not Use Any Getter or Setter Function
        void PersonName() {
            System.out.println(name);
        }

    }

    public static void main(String[] args) {
        
        // Create Object Using New Keyword
        Person FirstPerson = new Person();

        // Setting The Name By Calling Setter Function
        FirstPerson.setage(19);
        // Getting The Name By Calling Getter Function
        System.out.println(FirstPerson.getage());

        FirstPerson.name = "KRUSHI";
        FirstPerson.PersonName();

    }
}