import java.util.Scanner;
class R{
    public static void main(String [] args){
        Scanner input= new Scanner(System.in);
        System.out.println("Enter a integer: ");
        int a = input.nextInt();
        int b=a;
        int rev=0;
        while(a>0){
            int r =a%10;
            rev=rev*10+r;
            a/=10;
        }
        System.out.println("Reversed Number: "+rev);
    }
}
