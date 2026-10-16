
public class Task8 {

    public static void main(String[] args) {
        int totalSum = computeCumulativeSums(4, 5, 10);
        System.out.println("Grand Total: " + totalSum);
    }

    public static int computeCumulativeSums(int... numbers) {
        int grandTotal = 0;
        
        for (int num : numbers) {
            int cumulativeSum = 0;
            for (int i = 1; i <= num; i++) {
                cumulativeSum += i;
            }
            System.out.println("Cumulative sum for " + num + ": " + cumulativeSum);
            grandTotal += cumulativeSum;
        }
        
        return grandTotal;
    }
}