import java.util.Scanner;

public class Q2{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int [] powerLevel = new int[10];

    // Input the numbers of creatures
    System.out.println("Enter 10 power levels of creatures: ");
    for(int i = 0; i < powerLevel.length; i++){
      powerLevel[i] = input.nextInt();
    }

  //Analysing if even or odd
  public static int sumNumbers(int[] array, boolean even) {
    int sum = 0;
    for (int num : array) {
        if (even && num % 2 == 0) {
            sum += num;
        } else if (!even && num % 2 != 0) {
            sum += num;
        }
    }
    return sum;
}

  //Display the Bubble Sorted and Selection Sorted arrays
  public static void displayArray(int[] array){
    for(int num : array){
      System.out.print(num + " ");
    }
    System.out.println();
  }
}
}