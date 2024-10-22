import java.util.Scanner;

public class JavaScannerTest {
    
    public static void main(String[] args) 
    {
        // System.out.println("This is used to print on console ");
        System.out.println("This is used to print on console");
        Scanner scanner = new Scanner(System.in);
        String readString = scanner.nextLine();
        System.out.println(readString);


        System.out.println("please enter your name ");
        String readLine = scanner.nextLine();
        System.out.println("entered line = "+readLine);

        System.err.println("please enter your city ");
        String readWord = scanner.next();
        System.out.println("entered word = "+readWord);

        System.out.println("please enter your age");
        int readInt = scanner.nextInt();
        System.out.println(" raedInt = "+readInt);
    }
}
