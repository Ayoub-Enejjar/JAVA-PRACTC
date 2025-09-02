import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        System.out.println("hy this is our first program");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        int result;
        System.out.println("Welcome "+name+" to your calculator :) ");

    //enter your numbers
        System.out.print("Enter your first number: ");
        int a = sc.nextInt();
        System.out.print("Enter your second number: ");
        int b = sc.nextInt();
        boolean valid = true;

    while(valid) {
        sc.nextLine();
        System.out.print("Enter the operation you want to do (+ * / -): ");
        String opr = sc.nextLine();


        switch (opr) {
            case "+":
                result = a + b;
                System.out.println("your addition result is: " + result);
                break;

            case "-":
                result = a - b;
                System.out.println("your minus result is: " + result);
                break;

            case "*":
                result = a * b;
                System.out.println("your multi result is: " + result);
                break;

            case "/":
                if (a != 0 || b != 0){
                    result = a / b;
                    System.out.println("your multi result is: " + result);
                    break;
                }else{
                    System.out.println("your first or second number is equal 0 !!");
                }


            default:
                System.out.println("invalid choice");
        }

        System.out.print("Do you want continue using calculation (y/N): ");
        char choice = sc.next().charAt(0);
        if(choice == 'N' || choice == 'n'){
            valid = false ;
        }
    }
        System.out.println("Calculator is closed");
    }
}
