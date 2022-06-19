import java.util.Scanner;

class Calculator
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Select any of the following option");
        System.out.println("1.Addtion 2.Subtraction 3.Multiplication 4.Division");
        int n=sc.nextInt();
        System.out.println("Enter the first number");
        int a=sc.nextInt();
        System.out.println("Enter the second number");
        int b=sc.nextInt();
        int c;
        switch (n) {
            case 1:
                System.out.println(c=a+b); 
                break;
            case 2:
            System.out.println(c=a-b); 
                break;
            case 3:
            System.out.println(c=a*b); 
                break;
            case 4:
            System.out.println(c=a/b);  
                break;
            default:
                break;
        }
        
    }
}