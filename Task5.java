public class Task5 {
    public static void main(String[] args) {
        int num1=1;
        int num2=2;
        int num3=3; 
    
    System.out.println("Inputs: " + num1 + ", " + num2 + ", " + num3);
    
    if (num1 == num2 && num2 == num3) {
            System.out.println("All numbers are equal");
        } 
        else {
            int largest = num1;

            if (num2 > largest) {
                largest = num2; 
            }
            if (num3 > largest) {
                largest = num3; 
            }

            System.out.println("The largest number is: " + largest);
        }
    }
}
