public class multlevelinheritenceproblem {
    public static void main(String[] args) {
        class data{
            int s=10;
            int l=20;
            int b=30;
        }
        class squre extends data{
            void calarea(){
            int area;
                area=s*s;
                System.out.println(area);
            }
        }
        class rectangle extends data{
            int p,area;
            void calculate(){
                p=2*(l+b);
                area=l*b;
                System.out.println(p);
                System.out.println(area);
            }
        }
        squre s=new squre();
        s.calarea();
        rectangle r=new rectangle();
        r.calculate();
        
    }
    
}
