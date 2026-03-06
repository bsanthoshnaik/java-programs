import java.util.*;
public class usingwhilediagonal {
    public static void main(String[]args){
        int [][] mat={{1,2,3,4},{10,1,30,40},{100,200,1,400},{1000,2000,3000,1}};
        int c=mat[0].length;
        int r=mat[0].length;
        int i=0;
        int j=0;
        boolean isvalid=false;
        while (i<c && j<r) {
            if(mat[i][j]==1){
                isvalid=true;
            }
            //System.out.println(mat[i][j]);
            i++;
            j++;
            
        }
        System.out.println(isvalid);
        
    }
    
}
