import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("PROBLEM 1");
        System.out.println("Enter the number of elements in your array:");
        int n = scanner.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements of an array:");

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int sol1 = Problem_1.findMinimum(arr, n);
        System.out.println("The minimum element of your array is: " + sol1);

        System.out.println("PROBLEM 2");
        System.out.print("Enter the number of elements: ");
        int n1 = scanner.nextInt();

        int[] arr1 = new int[n1];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n1; i++) {
            arr1[i] = scanner.nextInt();
        }

        Problem_2 arrayAvg = new Problem_2();
        double sol2 = arrayAvg.getAverage(arr1);
        System.out.println("The average of the array is: " + sol2);

        System.out.println("PROBLEM 3");
        System.out.println("Enter your number:");
        int n2 = scanner.nextInt();

        if (Problem_3.isPrime(n2)) {
            System.out.println(n2 + " is prime.");
        } else {
            System.out.println(n2 + " is not prime.");
        }

        System.out.println("PROBLEM 4");
        System.out.println("Enter your number:");
        int n3 = scanner.nextInt();
        int sol4 = Problem_4.factorial(n3);

        System.out.println(n3 + "! = " + sol4);

        System.out.println("PROBLEM 5");
        System.out.println("Enter your number:");
        int n4 = scanner.nextInt();

        System.out.println("The " + n + "th Fibonacci number is " + Problem_5.fib(n4));

        System.out.println("PROBLEM 6");
        System.out.println("Enter your a number:");
        int a = scanner.nextInt();
        System.out.println("Enter your n number:");
        int n5 = scanner.nextInt();

        int sol5 = Problem_6.pow(a, n5);
        System.out.println(sol5);

        System.out.println("PROBLEM 7");
        System.out.print("Enter a string: ");
        String str = scanner.next();

        System.out.println("All permutations of " + str + ":");
        Problem_7.permutations("", str);

        System.out.println("PROBLEM 8");
        System.out.print("Enter a string: ");
        String str1 = scanner.next();

        System.out.println(str1 + " is all digits? " + Problem_8.isAllDigits(str1));

        System.out.println("PROBLEM 9");
        System.out.println("Enter your n number: ");
        int n6 = scanner.nextInt();
        System.out.println("Enter your k number: ");
        int k = scanner.nextInt();

        int sol9 = Problem_9.findCn(n6, k);
        System.out.println(sol9);

        System.out.println("PROBLEM 10");
        System.out.println("Enter your a number: ");
        int a1 = scanner.nextInt();
        System.out.println("Enter your b number: ");
        int b = scanner.nextInt();

        int sol10 = Problem_10.gcd(a1, b);
        System.out.println("GCD(" + a1 + ", " + b + ") = " + sol10);

        System.out.println("THANK YOU FOR YOUR ATTENTION!");
    }
}