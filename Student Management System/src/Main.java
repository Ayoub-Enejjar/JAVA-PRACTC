import java.util.Scanner;
import java.util.ArrayList;


//This is a small program that use ArrayList methods and switch :
public class Main{
    public static  void main(String[] args){

        ArrayList<String> names = new ArrayList<>();
        ArrayList<Integer> ages = new ArrayList<>();
        ArrayList<Float> notes = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        boolean value = true;
        while(value) {

            System.out.print("this is your Student manager, options:(add/show/search/grade/leave/continue): ");
            String choice = sc.nextLine();

            switch(choice){

                case "add":
                    System.out.print("Enter the names of your Student list: ");
                    String name = sc.nextLine();
                    System.out.print("Enter the ages of your Student list: ");
                    int age = sc.nextInt();
                    System.out.print("Enter the notes of your Student list: ");
                    float note = sc.nextFloat();
                    sc.nextLine();

                    names.add(name);
                    ages.add(age);
                    notes.add(note);
                    break;

                case "show":
                    System.out.println(names);
                    System.out.println(ages);
                    System.out.println(notes);
                    break;

                case "search":
                    System.out.print("Enter the name of the student you're searching for: ");
                    String search = sc.nextLine();
                    if (names.contains(search)) {
                        System.out.println("Your student in the list! ");
                    }else{
                        System.out.println("Add this student in the list !!");
                    }
                    break;

                case "grade":
                    if (notes.isEmpty()) {
                        System.out.println("No grades available to calculate.");
                    } else {
                        float sum = 0;
                        for (float n : notes) {
                            sum += n;
                        }
                        float average = sum / notes.size();
                        System.out.println("Average grade of the class: " + average);
                    }
                    break;


                case "continue":
                    System.out.println("Continue the process ! ");
                    break;

                case "leave":
                    value = false;
                    System.out.println("By see you next time ! ");
                    break;

                default:
                    throw new IllegalStateException("Unexpected value: " + choice);
            }
        }
    }
}
