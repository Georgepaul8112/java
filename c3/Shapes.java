import java.util.Scanner;
public class Shapes{
	
	int area;
}
class Triangle extends Shapes{
	
	int b,h;
}
	class Triangle(int a, int b){
	      area= (1/2)*b*h;	
		
}
class Square extends Shapes{
	int a;
}
	class Square extends Shapes(int a){
		area= a*a;
		
}
class Circle extends Shapes{
	int r;
}
	class Circle extends Shapes(int r){
		area=3.14*r*r;
}
public static void main()
{	
	int choice,r,a,b,shape;
	Scanner s= new Scanner(System.in);
	System.out.println("Enter your choice");
	System.out.println("1:Triangle\n2: Square\n3:Circle\n4:Exit");
	shape=s.nextint();

	
switch (shape) {
    case 1:
        b=s.nextInt();
        h=s.nextInt();
        Shape triangle(b,h) = new Triangle(int a,int b);
        System.out.println("The area of the triangle = "+ Triangle.area);
        System.out.println("Triangle");
        break;
    case 2:
        a=s.nextInt();
        Shape square(a) = new Square(int a);
        System.out.println("The area of the square = "+ Square.area);
        break;
    case 3:
        System.out.println("Circle");
        r=s.nextInt();
        Shape circle(r) = new Circle(int r);
        System.out.println("The area of the circle = "+ Circle.area);
        break;
    case 4:
    	System.out.println("Exiting.....");
    	break;
    default:
        shape = "Invalid shape";
    }
}

