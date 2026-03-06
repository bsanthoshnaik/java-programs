public class pattern3 {
    public static void main(String[] args){
        int n=3;
        int m=9;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print("* ");
                if(j!=m-1){
                    System.out.print("-");
                }
            }
            System.out.println();
        }
    }
    
}
