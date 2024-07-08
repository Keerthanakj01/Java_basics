import java.util.Scanner;

public class Assignment{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Number");
        int num = sc.nextInt(); 

        System.out.println("Number:" +num);

        int result = num;
        System.out.println("Result after '=' operator:" +result);

        result += 5;
        System.out.println("Result after '+=' operator:" +result);

        result -= 5;
        System.out.println("Result after '-=' operator:" +result);

        result *= 5;
        System.out.println("Result after '*=' operator:" +result);

        result /= 5;
        System.out.println("Result after '/=' operator:" +result);

        result %= 5;
        System.out.println("Result after '%=' operator:" +result);

    }
}
// assignment operator is  "="
