public class bubble {
    public static void main(String []args){
        int arr []={9,0,6,8,3};
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }

            for(int k=0;k<n;k++){
                System.out.print  (arr[k]+ " ");

            }
                //System.out.println(arr[i]+ " ");
        
        
    }
}
    
