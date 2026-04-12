public class variblesizeslidingwindow {
    public static void main(String[] args) {
        int arr[]={1,5,3,2,9};
        int l=0;
        int temp=0;
        int w=10;
        int ans=0;
        for(int r=0;r<arr.length;r++){

            temp=temp+arr[r];


            while(temp>w){
            temp=temp-arr[l];
            l++;
        }
        ans=Math.max(ans,r-l+1);
    }
    System.out.println(ans);
        
    
    
}
}
