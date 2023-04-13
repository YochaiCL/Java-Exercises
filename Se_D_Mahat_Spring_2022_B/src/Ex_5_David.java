import java.util.Scanner;
public class Ex_5_David {


    public static void fillArray(int[] arr) {
        Scanner sc = new Scanner(System.in);
        int i;
        for (i = 0; i < arr.length; i++) {
            System.out.println("Enter amount of interruptions in the month for client " + (i + 1) + ":");
            do {
                arr[i] = sc.nextInt();
            } while (arr[i] < -1);
        }
    }

    public static int totalInterruptions(int[] arr) {
        int i, sum = 0;
        for (i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int i;
        int[] firstMonthInterruptions = new int[100], secondMonthInterruptions = new int[100];
        System.out.println("Interruptions for the first month");
        fillArray(firstMonthInterruptions);
        System.out.println("Interruptions for the second month");
        fillArray(secondMonthInterruptions);
        int increasedAmountInterruptions = 0, totalInterruptionsMonthA, totalInterruptionsMonthB;
        totalInterruptionsMonthA = totalInterruptions(firstMonthInterruptions);
        totalInterruptionsMonthB = totalInterruptions(secondMonthInterruptions);
        for (i = 0; i < firstMonthInterruptions.length; i++) {
            if (firstMonthInterruptions[i] < secondMonthInterruptions[i])
                increasedAmountInterruptions++;
        }
        
//        Clause C
         int min = Math.abs(firstMonthInterruptions[0] - secondMonthInterruptions[0]);
        for (i=1; i<firstMonthInterruptions.length; i++)
            if (Math.abs(firstMonthInterruptions[i] - secondMonthInterruptions[i]) < min)
                min = Math.abs(firstMonthInterruptions[i] - secondMonthInterruptions[i]);
        for (i=0; i<firstMonthInterruptions.length; i++)
        {
            if (firstMonthInterruptions[i] == min)
                System.out.println("Client "+(i+1) + " the lowest amount of of difference in interruptions");
        }

//        Clause A
        if (totalInterruptionsMonthB < totalInterruptionsMonthA)
            System.out.println("There are less interruptions in second month than first month");
        else if (totalInterruptionsMonthB > totalInterruptionsMonthA)
            System.out.println("There are less interruptions in first month than second month");
        else
            System.out.println("There any change in total number of interruptions both months");

//        Clause B
        System.out.println("The amount of clients that had greater amount of interruptions in second month is: " + increasedAmountInterruptions);
    }
}

