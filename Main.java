import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the first number: ");
        int x1 = sc.nextInt();
        System.out.print("Please enter the second number: ");
        int x2 = sc.nextInt();
        System.out.print("Please enter the third number: ");
        int x3 = sc.nextInt();


        int max = Math.max(x1,x2);
        int maxNew = Math.max(max,x3);
        System.out.println("The biggest number is: "+maxNew);


        //______________________________________________________





        Scanner one = new Scanner(System.in);
        System.out.print("Please enter the year: ");
        int year = sc.nextInt();

        if ((year%4==0 && year%100!=0)|| year%400==0) System.out.println("It's a leap year");
        else System.out.println("It's not a leap year");
    }





        }








