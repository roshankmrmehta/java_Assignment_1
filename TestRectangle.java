import java.util.Scanner;

class Rectangle {

int width,height;
	
	public void display() {
		System.out.println(width+" "+height);
	}

}

class RectangleArea extends Rectangle{
	
	public void read_input(int w, int h) {
		width=w;
		height=h;
	}
    
	public void display() {
		System.out.println(width*height);
	}	
}

public class TestRectangle{
    
    public static void main(String args[]){
    
    RectangleArea ra=new RectangleArea();
    
    ra.read_input(3,4);
    ra.display();
        
    }
}