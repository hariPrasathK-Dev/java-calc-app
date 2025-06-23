import java.util.Scanner;

class Operations
{
    private int choice ;
    public Operations(int choice)
    {
        this.choice = choice ;
    }

    public void basicOperations()
    {
        System.out.println("Enter the first number : ");

        Scanner scanner = new Scanner(System.in) ;
        int first_number = scanner.nextInt() ;

        System.out.println("Enter the Second number : ");
        int second_number = scanner.nextInt() ;

        switch(choice)
        {
            case 1 :
            {
                System.out.println("Sum of "+first_number+" and "+second_number+" is : "+(first_number+second_number)) ;
                break ;
            }
            case 2 :
            {
                System.out.println("Subtraction of "+first_number+" and "+second_number+" is : "+(first_number-second_number)) ;
                break ;
            }
            case 3 :
            {
                System.out.println("Multiplication of "+first_number+" and "+second_number+" is : "+(first_number*second_number)) ;
                break ;
            }
            default:
            {
                if(second_number != 0)
                {
                    System.out.println("Division of "+first_number+" by "+second_number+" is : "+(first_number/second_number)) ;
                }
                else
                {
                    System.err.println("Division by zero is not possible") ;
                }
                break ;
            }

        }
    }

}


public class CalculatorApplication_CLI
{
    public static void main(String [] args)
    {
        String continue_choice ;
        Scanner scanner = new Scanner(System.in);
        do
        {
            System.out.println("------------------------------------------");

            System.out.println("            1) Addition ");
            System.out.println("            2) Subtraction ");
            System.out.println("            3) Multiplication ");
            System.out.println("            4) Division ");

            System.out.println("------------------------------------------");

            System.out.print("Enter Your choice : ");
            System.out.println();

            if(scanner.hasNextInt())
            {
                int choice = scanner.nextInt() ;
                scanner.nextLine() ;
                if (choice >= 1 && choice <= 4) {
                    Operations obj = new Operations(choice);
                    obj.basicOperations();
                } else {
                    System.err.println("Invalid Input !");
                }
            }
            else
            {
                System.err.println("Invalid Type of Input(Integer required) !") ;
                scanner.nextLine() ;
            }

            System.out.println("Do you want to continue ?(Y/N)");

            continue_choice = scanner.nextLine().strip();

        }while(continue_choice.equalsIgnoreCase("y")) ;

        scanner.close() ;
    }
}


