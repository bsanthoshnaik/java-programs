public class febonacciseries  {
    public static void main(String[] args) {
        int n=10;
        int first=0,second=1;
        System.out.println("febo"+n+"term:");
        for(int i=1;i<=n;i++){
        System.out.println(first+"");
        int next=first+second;
        first=second;
        second=next;

        }
    }
    
}



