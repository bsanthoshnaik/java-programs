public class arrayddtionmatrix {
    public static void main(String[] args){
        int[][] A={{1,2},{3,4}};
        int[][] B={{3,4},{5,6}};
        int[][] sum=new int[2][2];
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                sum[i][j]=A[i][j]+B[i][j];
            }
        }
        System.out.println("Addtion=");
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                System.out.println(sum[i][j]+"");
            }
           System.out.println();
        }

    }
    
}
