class Employee{
    
    private String name;
    private int Yearofjoining;
    private int salary;
    private String address;
    
    public Employee(String name,int Yearofjoining,int salary,String address){
        this.name=name;
        this.Yearofjoining=Yearofjoining;
        this.salary=salary;
        this.address=address;
    }
    
    public String getName(){
        return name;
    }
    
    public int getYearOfJoining(){
        return Yearofjoining;
    }
    
    public int getSalary(){
        return salary;
    }
    
    public String getAddress(){
        return address;
    }
}

class Question6{
    
    public static void main(String args[]){
        Employee emp1=new Employee("Robert",1994,50000,"64C-WallStreet");
        Employee emp2=new Employee("Sam",2000,35000,"68D-WallStreet");
        Employee emp3=new Employee("John",1999,67000,"26B-WallStreet");
        
        System.out.println("Name"+"        "+"Year of joining"+"           "+"Address");
        System.out.println(emp1.getName()+"      "+emp1.getYearOfJoining()+"                  "+emp1.getAddress());
        System.out.println(emp2.getName()+"          "+emp2.getYearOfJoining()+"                     "+emp2.getAddress());
        System.out.println(emp3.getName()+"        "+emp3.getYearOfJoining()+"                    "+emp3.getAddress());
    }
}