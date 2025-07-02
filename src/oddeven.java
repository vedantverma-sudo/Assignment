public class oddeven {
    public static void main(String[] args) {

        int[] numbers = {42,52,7,9,5,78,45,1};

        int evenCount = 0;
        int oddCount = 0;

        for (int num : numbers) {

            if (num % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
        System.out.println("Total even numbers: " + evenCount);
        System.out.println("Total odd numbers: " + oddCount);
    }
}
