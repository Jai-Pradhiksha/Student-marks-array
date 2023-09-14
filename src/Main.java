import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StudentClass studentClass = new StudentClass(5);
    }
}

class StudentClass{
    public StudentClass(int students) {
        int[] studentMarks = new int[students];
        Scanner scanner = new Scanner(System.in);
        try{
            for (int iterator = 0; iterator < students; iterator++)
            {
                int marks = Integer.parseInt(scanner.nextLine());

                if ((marks > 0) && (marks <= 100))
                {
                    studentMarks[iterator] = marks;
                }
                else {
                    throw new InputMismatchException("Mark is out of limit");
                }

            }

            int sum = 0;
            for (int iterator = 0; iterator < studentMarks.length; iterator++)
            {
                sum += studentMarks[iterator];
            }
            float average = sum/studentMarks.length;
            System.out.println("Class Average = " + average);
            System.out.println(Arrays.stream(studentMarks).max());
            System.out.println(Arrays.stream(studentMarks).min());


            System.out.println("Enter Pass Criteria Marks :");
            int passCriteria = Integer.parseInt(scanner.nextLine());
            int passCount = 0;

            for (int iterator = 0; iterator < studentMarks.length; iterator++)
            {
                if (studentMarks[iterator] >= passCriteria)
                {
                    passCount += 1;
                }
            }
            System.out.println("Number of Students got passed = " + passCount);
        }

        catch (InputMismatchException e)
        {
            System.out.println("InputMismatch Exception");
        }

    }
}
