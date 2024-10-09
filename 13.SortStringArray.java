import java.util.Scanner;
class P{
    
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a Size: ");
        int n = input.nextInt();
        String a[]= new String[n];
        int j,i;
        String t;
        for(i=0;i<n;i++){
            a[i]= input.nextLine();
        }
        System.out.println("enter A or D: ");
        char c= input.next().charAt(0);
        if(c=='A'){
            for(i=0;i<n;i++){
               for(j=i+1;j<n;j++){
                   if(a[i].compareTo(a[j])>0){
                    t=a[i];
                    a[i]=a[j];
                    a[j]=t;
                   }
               }
            }
        }
        for(i=0;i<n;i++){
            System.out.println(a[i]);
        }
        if(c=='D'){
            for(i=0;i<n;i++){
               for(j=i+1;j<n;j++){
                   if(a[i].compareTo(a[j])<0){
                    t=a[i];
                    a[i]=a[j];
                    a[j]=t;
                   }
               }
            }
        }
        for(i=0;i<n;i++){
            System.out.println(a[i]);
        }
           
        }
}
