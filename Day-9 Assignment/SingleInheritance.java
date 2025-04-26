import java.util.*;

class Student {
    int Rollno;
    String Name;
    Scanner s = new Scanner(System.in);

    void getdata() {
        try {
            System.out.println("Enter Roll no:");
            Rollno = s.nextInt();
            s.nextLine(); // Consume newline left by nextInt()

            System.out.println("Enter Name:");
            Name = s.nextLine();
        } catch (InputMismatchException e) {
            System.out.println("Invalid input! Please enter a valid roll number.");
            s.next(); // Clear the incorrect input
            getdata(); // Retry input
        }
    }

    void display() {
        System.out.println("Roll no is = " + Rollno);
        System.out.println("Name is = " + Name);
    }
}

class Marks extends Student {
    int s1, s2;

    void data1() {
        getdata();
        try {
            System.out.println("Enter marks of sub1:");
            s1 = s.nextInt();

            System.out.println("Enter marks of sub2:");
            s2 = s.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Invalid input! Please enter valid marks.");
            s.next(); // Clear the incorrect input
            data1(); // Retry input
        }
    }

    void display1() {
        display();
        System.out.println("Marks of sub1 = " + s1);
        System.out.println("Marks of sub2 = " + s2);
    }
}

public class SingleInheritance {
    public static void main(String[] args) {
        Marks m = new Marks();
        m.data1();
        m.display1();
    }
}