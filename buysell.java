public class buysell {
    public static void main(String[] args) {
        int arr[] = {7, 1, 5, 3, 6, 4};
        int n = arr.length;
        int profit=0;

        for (int i = 0; i < n-1; i++) {
            for (int j =i+1; j < n; j++) {
                //System.out.println(arr[i]+" "+arr[j];
                int temp=arr[i]-arr[j];
                profit=Math.max(profit,temp);


            }
        }
        System.out.println(profit);
    }
}
