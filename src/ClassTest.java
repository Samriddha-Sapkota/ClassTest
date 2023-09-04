import java.util.Random;
import java.util.Scanner;

public class ClassTest {
    public static void main(String[] args) {
        String Username, Password, Input_Username, Input_Password, User_Operation;
        int User_Choice,num1,num2,num3, User_Input1, User_Input2, Random_Number, userGuess;
        double div;
        float   Maths_Marks, Science_Marks, Nepali_Marks, Percentage;
        Scanner sn = new Scanner(System.in);
        Username = "samriddha";
        Password = "qwerty";

        System.out.println("Enter the username. Warning:- Case sensitive ");
        Input_Username = sn.next();
        System.out.println("Enter the password. Warning:- Case sensitive  ");
        Input_Password = sn.next();

        if (Input_Username.equals(Username) & Input_Password.equals(Password)){
            System.out.println("Successful login");
        }else{
            System.out.println("Incorrect Username or password.");
            return;
        }
        System.out.println("\t\t\t\t Programs");
        System.out.println("\t\t 1.\t\tProgram to find the greatest among 3 numbers.");
        System.out.println("\t\t 2.\t\tCalculator.");
        System.out.println("\t\t 1.\t\tProgram to calculator result with 3 grades.");
        System.out.println("\t\t 1.\t\tGuessing Game.");

        System.out.println("Enter the number of program you would like to run. ");
        User_Choice = sn.nextInt();

        switch (User_Choice){
            case 1:
            System.out.println("You have chose the program to find the greatest among 3 numbers");

            System.out.println("Enter the first number. ");
            num1 = sn.nextInt();
            System.out.println("Enter the second number. ");
            num2 = sn.nextInt();
            System.out.println("Enter the third number. ");
            num3 = sn.nextInt();

                if (num1 > num2 && num1 > num3){
                    System.out.println(num1 + " is the greatest");
                }
                else if (num2 > num1 && num2 > num3){
                    System.out.println(num2 + " is the greatest");
                }
                else if (num3 > num1 && num3 > num2){
                    System.out.println(num3 + " is the greatest");
                }
                else{
                    System.out.println("Invalid Input. Please input different numbers");
                }
                break;
            case 2:
                System.out.println("You have chose to run calculator. ");

                System.out.println("\t\t\t Welcome to my calculator.");
                System.out.println("Operations performed by this calculator are (+ , - , /)");

                System.out.println("Enter the operation you would like to do. ");
                User_Operation = sn.next();

                if (!User_Operation.equals("+") && !User_Operation.equals("-") && !User_Operation.equals("/")){
                    System.out.println("Invalid Input");
                    return;
                }
                System.out.println("Enter the first number. ");
                User_Input1 = sn.nextInt();
                System.out.println("Enter the second number. ");
                User_Input2 = sn.nextInt();

                if (User_Operation.equals("+")){
                    System.out.println(User_Input1 + User_Input2);
                }
                else if (User_Operation.equals("-")) {
                    System.out.println(User_Input1 - User_Input2);
                }
                else{
                    div = User_Input1 /User_Input2;
                    System.out.println(div);
                }
                break;

            case 3:
                System.out.println("You have chose result generator.");

                System.out.println("Enter the marks obtained in Maths. ");
                Maths_Marks = sn.nextFloat();

                if (Maths_Marks < 0 || Maths_Marks > 100){
                    System.out.println("The marks cannot be neither negative nor above 100.");
                    return;
                }
                System.out.println("Enter the marks obtained in Science. ");
                Science_Marks = sn.nextFloat();
                if (Science_Marks < 0 || Science_Marks > 100){
                    System.out.println("The marks cannot be neither negative nor above 100.");
                    return;
                }
                System.out.println("Enter the marks obtained in Nepali. ");
                Nepali_Marks = sn.nextFloat();
                if (Nepali_Marks < 0 || Nepali_Marks > 100){
                    System.out.println("The marks cannot be neither negative nor above 100.");
                    return;
                }

                if(Maths_Marks > 30 || Science_Marks > 30 || Nepali_Marks > 30){
                    System.out.println("The student has obtained NG.");
                }

                Percentage = ((Maths_Marks + Science_Marks + Nepali_Marks)/300) * 100;
                if (Percentage > 90 && Percentage < 100){
                    System.out.println("The student has scored an A+.");
                }
                else if (Percentage > 80 && Percentage < 90){
                    System.out.println("The student has scored an A.");
                }
                else if (Percentage > 70 && Percentage < 80){
                System.out.println("The student has scored an B+");
                }
                else if (Percentage > 60 && Percentage < 70){
                System.out.println("The student has scored an B");
                }
                break;
            case 4:
                Random ok = new Random();
                Random_Number = ok.nextInt(1000);
                System.out.println("Enter a number between 0 to 999");
                userGuess = sn.nextInt();
                if (userGuess < 0  || userGuess > 1000){
                    System.out.println("Invalid Input. Please Input a number between 0 and 1000");
                } else if (userGuess == Random_Number) {
                    System.out.println("The random number was " + Random_Number);
                    System.out.println("And Your guess was " + userGuess);
                    System.out.println("Correct Guess!");
                } else{
                    System.out.println("The random number was " + Random_Number);
                    System.out.println("And Your guess was " + userGuess);
                    System.out.println("Try again");
                }
                break;
            default:
                System.out.println("Invalid Input!");
        }
    }
}
