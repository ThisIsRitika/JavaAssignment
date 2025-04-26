 import java.util.Scanner;
public class TwoSum {
   public static void main(String[] args) {
       
            Scanner s = new Scanner(System.in);
            
            System.out.print("Enter the size of the array: ");
            int n = s.nextInt();
            
            int[] arr = new int[n];
    
            System.out.println("Enter array elements:");
            for (int i = 0; i < n; i++) 
            {
                arr[i] = s.nextInt();
            }

          
            System.out.print("Enter target sum: ");
            int target = s.nextInt();
            
            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n; j++) {
                    if (arr[i] + arr[j] == target) {
                        System.out.println("Indices are: " + i + " " + j);
                        return;
                    }
                }
            }
            System.out.println("No pair found");
            
        }
    }
     


   
