public class operators {
    public static void main(String args[]){
        int a=10,b=5,c;
        boolean x=true,y=false;
        
        //Arithmetic operators
        System.out.println("\nArithmetic Operators:");
        System.out.println("Addition of a and b is: "+(a+b));
        System.out.println("Subtraction of a and b is: "+(a-b));
        System.out.println("Multiplication of a and b is: "+(a*b));
        System.out.println("Division of a and b is: "+(a/b));
        System.out.println("Modulus of a and b is: "+(a%b));

        //Relational Operators
        System.out.println("\nRelational Operators:");
        System.out.println("a > b: "+(a > b));
        System.out.println("a < b: "+(a < b));
        System.out.println("a == b: "+(a == b));
        System.out.println("a != b: "+(a != b));
        System.out.println("a <= b: "+(a <= b));

        //Logical operators
        System.out.println("\nLogical Operators");
        System.out.println("x && y: "+(x && y));
        System.out.println("x || y: "+(x && y));
        System.out.println("!x: "+(!x));

        //Bitwise operators
        System.out.println("\nBitwise Operators:");
        System.out.println("a & b: "+(a & b));
        System.out.println("a | b: "+(a | b));
        System.out.println("a ^ b: "+(a ^ b));
        System.out.println("~a: "+(~a));
        System.out.println("a << b: "+(a << b));
        System.out.println("a >> b: "+(a >> b));
        System.out.println("a >>> b: "+(a >>> b));

        //Assignment operators
        System.out.println("\nAssignment Operators:");
        c = a;
        System.out.println("c = a : " + c);
        c += b;
        System.out.println("c += b : " + c);
        c -= b;
        System.out.println("c -= b : " + c);
        c *= b;
        System.out.println("c *= b : " + c);
        c /= b;
        System.out.println("c /= b : " + c);
        c %= b;
        System.out.println("c %= b : " + c);
        
        //Conditional/Ternary Operator
         int num=(a < b)? a : b;
         System.out.println("Minimum value: "+num);
    }
}

