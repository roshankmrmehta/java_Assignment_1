import java.util.Scanner;

class ComplexNumbers {
	int real;
    int imaginary;
    
    ComplexNumbers(int real, int imaginary){
        this.real=real;
        this.imaginary=imaginary;
    }
    
    void sum(ComplexNumbers c){
        int real=this.real+c.real;
        int imaginary=this.imaginary+c.imaginary;
        this.real=real;
        this.imaginary=imaginary;

    }
    
    void difference(ComplexNumbers c){
        int real=this.real-c.real;
        int imaginary=this.imaginary-c.imaginary;
        this.real=real;
        this.imaginary=imaginary;

    }
    
    void product(ComplexNumbers c){
        int real=(this.real * c.real)-(this.imaginary * c.imaginary);
        int imaginary=(this.real * c.imaginary)+(this.imaginary * c.real);
		this.real=real;
        this.imaginary=imaginary;
    }
    
    void print(){
        System.out.println(this.real+ "+"+this.imaginary+"i");
    }
    
    public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int real1 = s.nextInt();
		int imaginary1 = s.nextInt();

		int real2 = s.nextInt();
		int imaginary2 = s.nextInt();

		ComplexNumbers c1 = new ComplexNumbers(real1, imaginary1);
		ComplexNumbers c2 = new ComplexNumbers(real2, imaginary2);

		int choice = s.nextInt();
		 
		if(choice == 1) {
			// Add
			c1.sum(c2);
			c1.print();
		}
		else if(choice == 2) {
			// difference
			c1.difference(c2);
			c1.print();
		}
        else if(choice == 3) {
			// Multiply
			c1.product(c2);
			c1.print();
		}
		else {
			return;
		}
	}
	
}

