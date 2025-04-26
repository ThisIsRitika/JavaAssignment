import java.util.Random;

public class SumAvg {
    public static void main(String[] args) {
        int arr[]=new int[1000];
        int sum=0;
        float avg;
        Random r =new Random();
        for(int i=0;i<1000;i++)
        {
            arr[i]=r.nextInt(1000)+1;
            sum=sum+arr[i];
        }
        System.out.println("Sum is: "+sum);
        avg=(float)sum/(float)100;
        System.out.print("Average is: "+avg);
        
    }
}

