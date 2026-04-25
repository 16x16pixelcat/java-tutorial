import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        //EP3---------------scanner-----------------------
        Scanner scanner = new Scanner(System.in);

        System.out.print("enter your name: ");
        String name = scanner.nextLine();

        System.out.println("hello " + name);

        System.out.print("Enter Your age: ");
        int age = scanner.nextInt();

        System.out.println("your age is " + age);

        System.out.print("how much money do you have: ");
        double money = scanner.nextDouble();

        System.out.println("you have " + money + "JOD");

        System.out.print("are you a student (true/false): ");
        boolean isStudent = scanner.nextBoolean();
        System.out.println(isStudent);
        //------------common-Issue--------------------
        System.out.print("enter favourite number: ");
        int favNumb = scanner.nextInt();
        scanner.nextLine();
        System.out.print("enter favourite colour: ");
        String favColour = scanner.nextLine();

        System.out.println(favNumb);
        System.out.println(favColour);

        scanner.close();
        //EP2---------------integers----------------------
        //int age = 18;
        //int year = 2026;
        //int quantity = 5;
        //
        //System.out.println(quantity);
        //
        //System.out.println("the year is " + year);
        //
        //System.out.println(age);
        //---------------double------------------------
        //double price = 29.99;
        //double temperature = -12;
        //
        //System.out.println(temperature);
        //
        //System.out.println("JOD " + price);
        //---------------char--------------------------
        //char grade = 'f';
        //
        //char symbol = '!';
        //
        //char currency = '$';
        //
        //System.out.println(currency);
        //
        //System.out.println(symbol);
        //
        //System.out.println(grade);
        //----------------boolean----------------------
        //boolean cat = true;
        //
        //boolean likeDogs = false;
        //
        //boolean catsAreBetter = true;
        //
        //System.out.println(catsAreBetter);
        //
        //System.out.println(likeDogs);
        //
        //System.out.println(cat);
        //----------------string-----------------------
        //String name = "Pixel";
        //
        //String food = "Mansaf";
        //
        //String email = "cat123@catmail.com";
        //
        //System.out.println(name + " " + food + " " + email);
        //
        //System.out.println(email);
        //
        //System.out.println("my favorite food is " + food);
        //
        //System.out.println("Hi my name is " + name);
        //EP1----------------print------------------------
        //System.out.print("cats are cool\n");
        // the \n adds a line after the print
        //System.out.println("Me Loff Catzz");
        // println adds a line after prints
        //System.out.print("me need catzz");
        // Prints what's in the quotes
        //System.out.println();
        // sout quickly add a Print line
    }
}
