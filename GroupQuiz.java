/*Group Quiz
Members: 
Agregado, Shane Erl
Ceneta, John Cezar
Gonowon, Mahalia Desiree
*/
import java.util.Scanner;

public class GroupQuiz{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int [] powerLevel = new int[10];

    // Input the numbers of creatures
    System.out.println("Enter 10 power levels of creatures: ");
    for(int i = 0; i < powerLevel.length; i++){
      powerLevel[i] = input.nextInt();
    }

    // Bubble Sort (Ascending) Display
    int[] BubbleSorted = ascendingBubbleSort(powerLevel.clone());
    System.out.println("\nBubble Sort (Ascending): ");
    displayArray(BubbleSorted);

    // Selection Sort (Descending) Display
    int[] SelectionSorted = descendingSelectionSort(powerLevel.clone());
    System.out.println("\nSelection Sort (Descending): ");
    displayArray(SelectionSorted);


    // The Analysis of whether even or Odd
    int evenSum = sumNumbers(BubbleSorted, true);
    int oddSum = sumNumbers(BubbleSorted, false);

    // Display of the Analysis
    System.out.println("\nAnalysis: ");
    System.out.println("Sum of Even Numbers: " + evenSum);
    System.out.println("Sum of Odd Numbers: " + oddSum);
    System.out.println("Minimum Power Level: " + BubbleSorted[0]);
    System.out.println("Maximum Power Level: " + BubbleSorted[BubbleSorted.length - 1]);

    input.close();
  }

  //Using Bubble Sort Algorithm for Ascending
  public static int[] ascendingBubbleSort(int[] num) {
    //Swapping elements
    for (int i = 0; i < num.length - 1; i++) {
        for (int j = 0; j < num.length - 1 - i; j++) {
            if (num[j] > num[j + 1]) {
                int temp = num[j];
                num[j] = num[j + 1];
                num[j + 1] = temp;
            }
        }
    }
    return num;
}

  //Using Selection Sort Algorithm for Descending
  public static int[] descendingSelectionSort(int[]num){
    //Swapping elements
    for (int i = 0; i < num.length - 1; i++) {
        int max = i;
        for (int j = i + 1; j < num.length; j++) {
            if (num[j] > num[max]) {
                max = j;
            }
        }
        int temp = num[i];
        num[i] = num[max];
        num[max] = temp;
    }
    return num;
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