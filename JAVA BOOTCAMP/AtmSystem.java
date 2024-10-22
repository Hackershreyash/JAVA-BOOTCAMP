
import java.util.Scanner;

public class AtmSystem
{
    static int pin = 3214;
    static double accountBalance = 10000;
    static double machineRemainingBalance = 5000;

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter Your ATM Pin");
        if (sc.hasNextLine())
        {
            int userPin = sc.nextInt();
            if (userPin == pin)
            {
                System.out.println("Please Enter Amount to Withdraw");
                if (sc.hasNextInt())
                {
                    int amount = sc.nextInt();
                    if (amount <= accountBalance)
                    {
                        double remainingBalance = accountBalance - amount;
                        System.out.println("please collect your money");
                        System.out.println("remaining balance= "+remainingBalance);
                    }
                }
                else
                {
                    System.out.println("please enter a valid amount to withdraw ");
                }
            }
            else
            {
                System.out.println("Your pin is not matched");
            }
        }
    }
}