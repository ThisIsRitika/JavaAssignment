//write a program to implement multiple objects of a class by using instance method of a class.
public class NewInstanceObj {
    public static void main(String[] args) {
        try {
            // Creating an obj of the outer class NewInstanceObj
            NewInstanceObj outerClass = new NewInstanceObj();
            Class<?> c = Class.forName("NewInstanceObj$Student");


            Student s = (Student) c.getDeclaredConstructor(NewInstanceObj.class).newInstance(outerClass);

            
            s.name = "Harshita";
            s.roll_no = 14;

           
            System.out.println("Student Details: ");
            s.display();

        } 
        catch (Exception e)
         {
            e.printStackTrace();
        }
    }
    class Student
     {
        String name;
        int roll_no;

        //methodd
        void display() {
            System.out.println("Name: " + name);
            System.out.println("RollNo: " + roll_no);
        }
    }
}
