import java.util.Scanner;

class Triangle{
    
    public void valueTriangleArea(double a, double b, double c){
        double s=(a+b+c)/2;
        s = s*(s-a)*(s-b)*(s-c);
        System.out.println(Math.sqrt(s));
        }
    
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Triangle t=new Triangle();
        double a=sc.nextDouble();
        double b=sc.nextDouble();
        double c=sc.nextDouble();
        t.valueTriangleArea(a,b,c);
        
    }
    
}