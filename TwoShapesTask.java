import java.util.Scanner;
    class Circle {
    double esimatedArea ; 
    double estimatedCircum ;
    void getArea(double redius){
        double area = (redius*redius)*3.14;
        esimatedArea = area;
        
    }
    
    void getCircum (double redius){
    double circum = redius * 2 * 3.14;  
    estimatedCircum = circum ; 
    }
    
    void getData (){
        System.out.println("The Area of Circle is : " + esimatedArea );
        System.out.println("The Circumference of circle is : " + estimatedCircum );
    }
}

    class triangle {
    double esimatedArea ; 
    double estimatedCircum ;
    void getArea(double height , double base){
        double area = .5*base*height;
        esimatedArea = area;
    }
    
    void getCircum (double base, double l2 , double l3){
    double circum = l2+l3+base ;  
    estimatedCircum = circum ; 
    }
    
    void getData (){
        System.out.println("The Area of triangle is : " + esimatedArea );
        System.out.println("The Circumference of circle is : " + estimatedCircum );
    
    }
}
public class TwoShapesTask {
    public static void main(String args[]) {
        Circle c1 = new Circle() ;
        triangle t1= new triangle ();
        Scanner input = new Scanner (System.in);
        System.out.print("for the circle , please enter the circle redius : ");
        double cir1red=input.nextDouble();
        c1.getArea(cir1red);
        c1.getCircum(cir1red);
        c1.getData();
        
        System.out.print("for the triangle , please enter the triangle height : ");
        double trheight=input.nextDouble();
        System.out.print("please enter the triangle base : ");
        double trbase=input.nextDouble();
        System.out.print("please enter the triangle L1 : ");
        double trL1=input.nextDouble();
        System.out.print("please enter the triangle L2 : ");
        double trL2=input.nextDouble();

        t1.getArea(trheight,trbase);
        t1.getCircum(trbase,trL1,trL2);
        t1.getData();
       
        
    }


}

