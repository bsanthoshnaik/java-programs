public class patterns8 {
    public static void main(String[] args) {
        int n=2;
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i;j++){
                System.out.print(" ");
            }
            for(int k=0;k<n+i;k++){
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
    
}
