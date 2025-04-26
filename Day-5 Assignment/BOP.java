public class BOP {
    public static void main(String[] args) {
        int a=5;
        int b=7;
        int c=2;
        System.out.println("Is a>b and a<c: " +(a>b && a<c));
        System.out.println("Is a<b and a>c: " +(a<b && a>c));
        System.out.println("Is a==c or b>a: " +(a == c || b>a));
        System.out.println("Is b>15 and c<0 or a>0: "+(b>15 && c<0 || a>0));
        System.out.println("is a/2.0==0.0 and b/2.0!=0.0 or c<0.0: "+((a/2.0 == 0.0 && b/2.0 != 0.0) || c<0.0));
     }
}
