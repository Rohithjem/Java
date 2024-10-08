import java.util.Scanner;
class R{
    public static void main(String [] args){
        Scanner input= new Scanner(System.in);
        System.out.println("Enter a string: ");
        String a = input.nextLine();
        String b = input.nextLine();
        if(a==b){
            System.out.print("Strings Valid!! ");
        }
        else{
            System.out.print("Strings Not Valid!! ");
        }
        
    }
}
