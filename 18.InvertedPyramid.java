import java.util.Scanner;
class P{
    
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a Size: ");
        int n = input.nextInt();
        
        int j,i;
            for(i=n;i>=1;i--){
               for(j=1;j<=n-i;j++){
                   System.out.print(" ");
               }
               for(j=1;j<=2*i-1;j++){
                   System.out.print("*");
               }
               System.out.println("\n");
            }
            
        
        
           
        }
}
