import java.util.Scanner;

public class firstclass {
    public static void main(String[] args) {
//        String name = "gago";
//        System.out.print(name + '\n');
//        System.out.print("gago");
//         ctrl+alt+L corrects code
        Scanner scanner = new Scanner(System.in);

//        System.out.println("Enter you name ");
//        String name = scanner.next();
//
//        System.out.println("Enter you surname ");
//        String surname = scanner.nextLine();
//
//        System.out.println("Enter you age ");
//        int age = scanner.nextInt();
//
//        System.out.println("Enter you gender ");
//        String gender = scanner.next();
//
//        System.out.println("Your name is " + name + "," + "\n");
//        System.out.print("Your surname is " + surname + "," + "\n");
//        System.out.print("Your age is " + age + "," + "\n");
//        System.out.print("Your gender is " + gender + ":");
        //input
        System.out.println("Enter 1st number: ");
        int x = scanner.nextInt();
        System.out.println("Enter 2nd number: ");
        int y = scanner.nextInt();

        //calculations
        int sum = x + y;
        int substruct = x - y;
        int divide = x / y;
        int z = x % y;
        int multiply = x * y;

        //output
        System.out.println(x + " plus " + y + " is " + sum);
        System.out.println(z);
////
        System.out.println(x + " minus " + y + " is "  + substruct) ;
        System.out.println(x + " divided by " + y + " is "  + divide) ;
        System.out.println(x + " multiplied by " + y + " is "  + multiply) ;




    }
}
