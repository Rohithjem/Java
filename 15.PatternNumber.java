import java.util.Scanner;
class P{
    
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a Size: ");
        int n = input.nextInt();
        int a = input.nextInt();
        int j,i;
            for(i=1;i<=n;i++){
               for(j=1;j<=i;j++){
                   System.out.print(a+" ");
               }
               System.out.println("\n");
            }
            for(i=n-1;i>=1;i--){
               for(j=1;j<=i;j++){
                   System.out.print(a+" ");
               }
               System.out.println("\n");
            }
        
        
           
        }
}
