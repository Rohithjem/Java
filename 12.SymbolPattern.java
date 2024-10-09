import java.util.Scanner;
class P{
    
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a Size: ");
        int l = input.nextInt();
        int b = input.nextInt();
        int j,i;
        char a= input.next().charAt(0);
        for(i=0;i<l;i++){
            for(j=0;j<b;j++){
               System.out.print(a+" ");
               }
                System.out.print("\n");
            }
           
        }
}
