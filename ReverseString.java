import java.util.Scanner;
class R{
    public static void main(String [] args){
        Scanner input= new Scanner(System.in);
        System.out.println("Enter a string: ");
        String a = input.nextLine();
        int i,n=a.length();
        String r="";
        for(i=n-1;i>=0;i--){
            r=r+a.charAt(i);
        }
        System.out.print("Reversed string "+r);
    }
}
