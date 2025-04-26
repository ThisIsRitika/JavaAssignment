    import java.util.Scanner;
public class MergingIntervals {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number of intervals: ");
        int n = s.nextInt();
        int[][] intervals = new int[n][2];
      
        System.out.println("Enter intervals:");
        for (int i = 0; i < n; i++)
         {
            intervals[i][0] = s.nextInt();
            intervals[i][1] = s.nextInt();
        }
       
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) 
            {
                if (intervals[j][0] > intervals[j + 1][0])
                 {
                    int[] temp = intervals[j];
                    intervals[j] = intervals[j + 1];
                    intervals[j + 1] = temp;
                }
            }
        }
        System.out.println("Merged Intervals:");
        int start = intervals[0][0];
        int end = intervals[0][1];

        for (int i = 1; i < n; i++)
         {
            if (intervals[i][0] <= end) 
            {
                end = Math.max(end, intervals[i][1]);
            }
             else
              {
                System.out.println(start + " " + end);
                start = intervals[i][0];
                end = intervals[i][1];
            }
        }
        System.out.println(start + " " + end);
    }
}
