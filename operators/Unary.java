import java.util.Scanner;

public class Unary{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Number");
        int num = sc.nextInt(); 

        System.out.println("Number:" +num);

        System.out.println("Unary Operations");

        System.out.println("++num = " + (++num)); 

        num = sc.nextInt();

        System.out.println("--num = " + (--num)); 

        num = sc.nextInt();

        System.out.println("num++ = " + (num++)); 
        System.out.println("After post increment :" + num);

        num = sc.nextInt();

        System.out.println("num-- = " + (num--)); 
        System.out.println("After post decrement :" + num);

        num = sc.nextInt();

        System.out.println("+num = " + (+num)); 

        num = sc.nextInt();

        System.out.println("-num = " + (-num)); 

        num = sc.nextInt();

        boolean boo1 = (num > 0);
        System.err.println("!" + boo1 + " = " + (!boo1));

    }
    }
// Unary operators are +,-, ++, --, !
