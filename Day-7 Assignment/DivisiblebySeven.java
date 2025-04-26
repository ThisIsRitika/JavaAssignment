public class DivisiblebySeven {
    public static int countDivision(int[] arr) {
        int count = 0;
        for (int num : arr) {  // Enhanced for-loop for better readability
            if (num % 7 == 0) { 
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] num = {28, 21, 36, 40, 49, 50, 70}; 
        int result = countDivision(num);
        System.out.println("Number of elements divisible by 7: " + result);
    }
}
