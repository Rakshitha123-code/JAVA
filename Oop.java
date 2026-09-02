
/*class Student{
    int age;
    String name;
    float marks;
}
public class Oop {
    public static void main(String[] args) {
        Student s1=new Student();
        s1.name="Rakshitha";
        s1.age=15;
        s1.marks=5.6f;
        System.out.println(s1.name);
        System.out.println(s1.age);
        System.out.println(s1.marks);

    }
    
}*/
/*class Car{
    String brand;
    int  model;
    long price;
}
public class Oop{
    public static void main(String[] args) {
        Car c1=new Car();
        c1.brand="suzuki";
        c1.model=2016;
        c1.price=100000;
        System.out.println(c1.brand);
        System.out.println(c1.model);
        System.out.println(c1.price);
    }
}*/
/*class Employee{
    int id;
    String name;
    long salary;
}
public class Oop{
    public static void main(String[] args) {
        Employee e1=new Employee();
        Employee e2=new Employee();
        e1.id=102;
        e1.name="RAJ";
        e1.salary=50000;
        e2.id=103;
        e2.name="RAM";
        e2.salary=16000;
        System.out.println("EMPLOYEE E1 DETAILS ARE:");
        System.out.println(e1.id);
         System.out.println(e1.name);
          System.out.println(e1.salary);
          System.out.println("EMPLOYEE E2 DETAILS ARE:");
        System.out.println(e2.id);
         System.out.println(e2.name);
          System.out.println(e2.salary);

    }
}*/
/*class Mobile{
    String brand;
    int  RAM;
    String storage;
    long price;
}
public class Oop{
    public static void main(String[] args) {
        Mobile m1=new Mobile();
        Mobile m2=new Mobile();
        m1.brand="samsung";
        m1.RAM=521;
        m1.storage="124gb";
        m1.price=10000;
        m2.brand="samsung";
        m2.RAM=521;
        m2.storage="124gb";
        m2.price=10000;
        System.out.println("MOBILE 1 DETAILS ARE:");
        System.out.println(m1.brand);
        System.out.println(m1.RAM);
        System.out.println(m1.storage);
        System.out.println(m1.price);
        System.out.println("MOBILE 2 DETAILS ARE:");
        System.out.println(m2.brand);
        System.out.println(m2.RAM);
        System.out.println(m2.storage);
        System.out.println(m2.price);
        if(m1==m2)
        {
            System.out.println("OBJECTS ARE THE SAME");
        }
        else
        {
            System.out.println("OBJECTS ARE NOT  THE SAME");
        }

    }
}*/
// METHOD INSIDE A CLASS 
/*class Car{
    String brand;
    int price;
    void start()
    {
        System.out.println("CAR STARTED");
    }

}
public class Oop{
    public static void main(String[] args) {
        Car c1=new Car();
        c1.start();
    }
}*/
/*class Fan{
    String brand;
    int speed;
    void turnon()
    {
        System.out.println("TURNED ON");
    }
    void turnoff()
    {
        System.out.println("TURNED OFF");
    }
}
public class Oop{
    public static void main(String[] args) {
        Fan f1=new Fan();
        f1.turnon();
        f1.turnoff();
    }
}*/
/*class Mobiles{
    String brand;
    int Storage;
    void call()
    {
        System.out.println("Calling");
    }
}
public class Oop{
    public static void main(String[] args) {
        Mobiles m1=new Mobiles();
        Mobiles m2=new Mobiles();
        m1.call();
        m2.call();
    }
}*/
// METHODS WITH OBJECT DATA
/*class Car{
    String brand;
    int model;
    int price;
    void display()
    {
        System.out.println(brand);
        System.out.println(model);
        System.out.println(price);
    }
}
public class Oop{
    public static void main(String[] args) {
        Car c1=new Car();
        Car c2=new Car();
        c1.brand="Maruthi";
        c1.model=2016;
        c1.price=50000;
        c2.brand="Swift";
        c2.model=2017;
        c2.price=20000;
        c1.display();
        c2.display();
    }
}*/  
/*class Employee{
    int id;
    int salary;
    String name;
    void display()
    {
        System.out.println(id);
        System.out.println(salary);
        System.out.println(name);
    }
}
public class Oop{
    public static void main(String[] args){
        Employee e1=new Employee();
        Employee e2=new Employee();
        e1.id=101;
        e1.salary=45000;
        e1.name="RAJ";
        e2.id=106;
        e2.salary=25000;
        e2.name="RAM";
        e1.display();
        e2.display();
    }
}*/ 
/*class Bankaccount{
    long accountno;
    String name;
    int balance;
    void showbalance()
    {
        System.out.println(accountno);
        System.out.println(name);
        System.out.println(balance);
    }
}
public class Oop{
    public static void main(String[] args){
        Bankaccount b1=new Bankaccount();
        Bankaccount b2=new Bankaccount();
        b1.accountno=122222;
        b1.name="RAJ";
        b1.balance=15000;
        b2.accountno=1234567;
        b2.name="RAM";
        b2.balance=2000;
        b1.showbalance();
        b2.showbalance();
    }
}*/
// METHOD WITH PARAMETERS
/*class Student{
    String name;
    int age;
    double marks;
    void setDetails(String n,int a,double m)
    {
        name=n;
        age=a;
        marks=m;
    }
    void display()
    {
        System.out.println("NAME IS:"+name);
        System.out.println("AGE IS:"+age);
        System.out.println("MARKS IS:"+marks);
    }
}
public class Oop{
    public static void main(String[] args) {
        Student s1=new Student();
        Student s2=new Student();
        s1.setDetails("RAM",15,86.75);
        s2.setDetails("RAJ",14,96.75);
        s1.display();
        s2.display();
    }
}*/
/*class Mobile{
    String brand;
    int ram;
    int price;
    void setDetails(String b,int r,int p)
    {
        brand=b;
        ram=r;
        price=p;
    }
    void showDetails()
    {
        System.out.println("BRAND IS:"+brand);
        System.out.println("RAM IS:"+ram);
        System.out.println("PRICE IS:"+price);
    }

}
public class Oop{
    public static void main(String[] args) {
        Mobile m1=new Mobile();
         Mobile m2=new Mobile();
         m1.setDetails("SAMSUNG",12,50000);
         m2.setDetails("Apple",8,45000);
         m1.showDetails();
         m2.showDetails();

    }
}*/
/*class Bank{
    int accountno;
    String name;
    int balance;
    void createaccount(int a,String n,int b)
    {
        accountno=a;
        name=n;
        balance=b;
    }
    void showaccount()
    {
        System.out.println("ACCOUNT NO IS:"+accountno);
        System.out.println("NAME IS:"+name);
        System.err.println("BALANCE IS:"+balance);
    }
}
public class Oop{
    public static void main(String[] args) {
        Bank b1=new Bank();
        Bank b2=new Bank();
        b1.createaccount(123456, "RAM", 25000);
        b2.createaccount(123123456, "RAJ", 21220);
        b1.showaccount();
        b2.showaccount();
    }
}*/
// METHODS WITH RETURN TYPE
/*class Bank{
    String name;
    double balance;
    void setDetails(String n,double b){
        name=n;
        balance=b;
    }
    boolean hasminimumBalance()
    {
        if(balance>5000)
            return true;
        else
            return false;
    }
}
public class Oop{
    public static void main(String[] args) {
        Bank b1=new Bank();
        Bank b2=new Bank();
        b1.setDetails("RAM", 20000);
        b2.setDetails("RAJ", 2000);
        System.out.println(b1.hasminimumBalance());
         System.out.println(b2.hasminimumBalance());
    }
}*/
/*class Circle{
    int radius;
    void setRadius(int r)
    {
        radius=r;
    }
    double area()
    {
        double Area=3.14*radius*radius;
       return Area; 
    }
}
public class Oop{
    public static void main(String[] args) {
        Circle c1=new Circle();
        c1.setRadius(2);
        System.out.println(c1.area());
    }
}*/
/*class Employee{
    int salary;
    int bonus;
    void setDetails(int s,int b){
        salary=s;
        bonus=b;
    }
    int total()
    {
       int totalsalary=salary+bonus;
       return totalsalary;    
    }
}
public class Oop{
    public static void main(String[] args) {
        Employee e1=new Employee();
        e1.setDetails(50000, 12000);
        System.out.println(e1.total());
    }
}*/
//<<<<+============================METHOD OVERLOADING==================================+>>>>>>
/*class Calculator{
    int add(int a ,int b)
    {
        return a+b;
    }
    int add(int a,int b,int c)
    {
        return a+b+c;
    }
    double add(double a,double b)
    {
        return a+b;
    }

}
public class Oop{
    public static void main(String[] args) {
        Calculator c1=new Calculator();
        int a=c1.add(10,20);
        int b=c1.add(10,20,30);
        double d=c1.add(3.14,3.14);
        System.out.println(a);
        System.out.println(b);
        System.out.println(d);
    }
}*/
/*class Calculator{
    int area(int side)
    {
        return side*side;
    }
    int area(int length,int width)
    {
        return length*width;
    }
}
public class Oop{
    public static void main(String[] args) {
        Calculator c1=new Calculator();
        System.out.println(c1.area(15));
        System.out.println(c1.area(15,10));
    }
}*/
/*class Calculator{
    void show(int id)
    {
        System.out.println("ID IS:"+id);
    }
    void show(String x)
    {
        System.out.println("NAME IS:"+x);
    }
    void  show(int id,String x)
    {
        System.out.println("NAME IS:"+x+" AND"+" ID IS:"+id);
    }
}
public class Oop{
    public static void main(String[] args) {
        Calculator c1=new Calculator();
       c1.show(101);
       c1.show("RAM");
       c1.show(102,"RAJ");
    }
}*/
//<=============CONSTRUCTORS===============>
    /*class Car{
        Car()
        {
            System.out.println(" CAR OBJECT CREATED");
        }
    }
    public class Oop{
        public static void main(String[] args) {
            Car c1=new Car();
            Car c2=new Car();
        }
    }*/
   /*class Student{
    Student()
    {
        System.out.println("STUDENT OBJECT CREATED");
    }
   }
   public class Oop{
    public static void main(String[] args) {
        Student s1=new Student();
        Student s2=new Student();
        Student s3=new Student();
    }
   }*/
  /*class Mobile{
    String brand;
    int price; 
    Mobile()
    {
        System.out.println("MOBILES  object CREATED");
    }
  }
public class Oop{
    public static void main(String[] args) {
        Mobile m1=new Mobile();
        Mobile m2=new Mobile();

    }
}*/
//<============CONSTRUCTOR ASSIGN VALUES AND WHY NOT DEFALUT VALUIES==================>
/*class Student{
    String name;
    int age;
    void display()
    {
        System.out.println(name);
        System.out.println(age);
    }
}
public class Oop{
    public static void main(String[] args) {
        Student s1=new Student();
        s1.display();
    }
}*/
/*class Employee{
    int id;
    String name;
    int salary;
    Employee()
    {
        id=101;
        name="RAJ";
        salary=50000;
    }
    void display()
    {
        System.out.println(id);
        System.out.println(name);
        System.out.println(salary);
    }

}
public class Oop{
    public static void main(String[] args) {
        Employee e1=new Employee();
        e1.display();
    }
}*/
/*class Mobile{
    String brand;
    int price;
    Mobile()
    {
        brand="samsung";
        price=20000;
    }
    void display()
    {
        System.out.println(brand);
        System.out.println(price);
    }
}
public class Oop{
    public static void main(String[] args) {
        Mobile m1=new Mobile();
        Mobile m2=new Mobile();
        m1.display();
        m2.display();
    }
}*/
//<<<<<<================CONSTRUCTOR WITH PARAMETER VALUES==============>>>>>>>

/*class Student{
    String name;
    int age;
    double marks;
    Student(String n,int a,double m)
    {
        name=n;
        age=a;
        marks=m;
    }
    void display()
    {
        System.out.println("NAME IS:"+name);
        System.out.println("AGE IS:"+age);
        System.out.println("MARKS IS:"+marks);
    }
}
public class Oop{
    public static void main(String[] args) {
        Student s1=new Student("Sagar",14,78.99);
         Student s2=new Student("Raj",10,40.99);
         s1.display();
         s2.display();
    }
}*/
/*class Car{
    String brand;
    int model;
    long price;
    Car( String b,int m,long p)
    {
        brand=b;
        model=m;
        price=p;
    }
    void display()
    {
        System.out.println("BRAND IS:"+brand);
        System.out.println("MODEL IS:"+model);
        System.out.println("PRICE IS:"+price);
    }
}
public class Oop{
    public static void main(String[] args) {
        Car c1=new Car("SWIFT",2018,890000);
        Car c2=new Car("SUZUKI",2000,908000);
        c1.display();
        c2.display();
    }
}*/
/*class Bank{
    long accountnumber;
    String holdername;
    double balance;
    Bank(long n,String na,double b)
    {
        accountnumber=n;
        holdername=na;
        balance=b;
    }
    void display()
    {
        System.out.println("BANK NO. IS:"+accountnumber);
        System.out.println("HOLDER NAME is:"+holdername);
        System.out.println("BALANCE IS:"+balance);
    }
}
public class Oop{
    public static void main(String[] args) {
        Bank b1=new Bank(12345678,"RAJ",56745);
        Bank b2=new Bank(2345611,"RAJ",123.54);
        b1.display();
        b2.display();
    }
}*/
//<<<<<<<<<<<<<<=================CONSTRUCTOR OVERLOADING====================>>>>>>>>>>>>>>>>>>
/*class Mobile{
    Mobile()
    {
        System.out.println("NO DATA");
    }
    Mobile(String name){
        System.out.println(name);
    }
    Mobile(String name,int age)
    {
        System.out.print(name);
        System.out.println(" "+age);
    }
}
public class Oop{
    public static void main(String[] args) {
        Mobile m1=new Mobile();
        Mobile m2=new Mobile("RAJ");
        Mobile m3=new Mobile("RAJ",16);
    }
}*/
/*class Student{
    Student()
    {
        System.out.println("Student created");
    }
    Student(String name)
    {
        System.out.println("NAME IS:"+name);
    }
}
public class Oop{
    public static void main(String[] args) {
        Student s1=new Student();
        Student s2=new Student("RAJ");
    }
}*/
/*class Book{
    Book()
    {
        System.out.println("BOOK CREATED");
    }
    Book(String title)
    {
        System.out.println("TITLE IS:"+title);
    }
    Book(String title,int price)
    {
         System.out.println("TITLE IS:"+title);
         System.out.println("PRICE IS:"+price);
    }
}
public class Oop{
    public static void main(String[] args) {
        Book b1=new Book();
        Book b2=new Book("GOOD DEEDS");
        Book b3=new Book("TIMES OF INDIA",5600);
    }
}*/
/*class Employee{
    Employee()
    {
        System.out.println("EMPLOYEE CREATED");
    }
    Employee(int id)
    {
        System.out.println("ID IS:"+id);
    }
    Employee(int id,String name)
    {
        System.out.println("ID IS:"+id);
        System.out.println("NAME IS:"+name);
    }
}
public class Oop{
    public static void main(String[] args) {
        Employee e1=new Employee();
        Employee e2=new Employee(101);
        Employee e3=new Employee(1010,"RAM");
    }
}*/
//<<<<<<<<<<<<<<<<<<<<<<<<<=================THIS KEYWORD===============>>>>>>>>>>>>>>>>>>>>>>>>>>
/*class Employee{
    int id;
    String name;
    double salary;
    Employee(int id,String name,double salary)
    {
        this.id=id;
        this.name=name;
        this.salary=salary;
    }
    void display()
    {
        System.out.println(id);
        System.out.println(name);
        System.out.println(salary);
    }
}
public class Oop{
    public static void main(String[] args) {
        Employee e1=new Employee(101,"RAM",5000);
        Employee e2=new Employee(202,"RAMU",23000);
        e1.display();
        e2.display();
    }
}*/
//<<<<<<<<<<<<<<<<<<==================ENCAPSULATION=====================>>>>>>>>>>>>>>>>>>>>>>>>
/*class Student{
    private String name;
    private int age;
    void setName(String n)
    {
        name=n;
    }
      String  getName()
    {
        return name;
    }
    void setAge(int a)
    {
        if(a>0)
        {
            age=a;
        }
        else{
            System.out.println("INVALID AGE");
        }
    }
    int  getAge()
    {
       return age;
    }
}
public class Oop{
    public static void main(String[] args) {
        Student s1=new Student();
        s1.setName("RAJ");
        System.out.println(s1.getName());
        s1.setAge(-1);
        System.out.println(s1.getAge());
    }
}*/
//<<<<<<<<<<<<<<<<<<<<<<================INHERITANCE========================>>>>>>>>>>>>>>>>>>>>>>
/*class Vehicle{
    String brand="SUZUKI";
    void start()
    {
        System.out.println("VEHICLE CREATED");
    }
}
class Car extends Vehicle{

}
public class Oop{
    public static void main(String[] args) {
        Car c1=new Car();
        System.out.println(c1.brand);
        c1.start();
    }
}*/
/*class Person{
    String name;
    void displayName()
    {
        System.out.println(name);
    }
}
class Student extends Person{
    int marks;
    void displayMarks()

    {
        System.out.println(marks);
    }
}
public class Oop{
    public static void main(String[] args) {
        Student s1=new Student();
        s1.name="RAJ";
        s1.marks=95;
        s1.displayName();
        s1.displayMarks();
    }
}*/
/*class Animal{
    Animal()
    {
        System.out.println("ANIMAL CREATED");
    }
}
class Dog extends Animal{
    Dog()
    {
        System.out.println("DOG CREATED");
    }
}
public class Oop{
    public static void main(String[] args) {
        Dog d1=new Dog();

    }
}*/
/*class Vehicle{
    Vehicle()
    {
        System.out.println("VEHICLE CONSTRUCTOR");
    }
}
class Car extends Vehicle{
    Car()
    {
        System.out.println("CAR CREATED");
    }
}
public class Oop{
    public static void main(String[] args) {
        Car c1=new Car();
        Car c2=new  Car();
    }
}*/
/*class Person{
    String name;
    Person(String n)
    { 
        name=n;
    }
}
class Student extends Person{
    int marks;
    Student(String n,int m)
    {
        super(n);
        marks=m;
    }
    void display()
    {
        System.out.println(name);
        System.out.println(marks);
    }
}
public class Oop{
    public static void main(String[] args) {
        Student s1=new Student("RAJ",56);
        s1.display();

    }
}*/
/*class Person{
    void display()
    {
        System.out.println("PERSON METHOD");
    }
}
class Student extends Person{
    void display()
    {
        System.out.println("Student method");
    }
    void show()
    {
        display();
        super.display();
    }

}
public class Oop{
    public static void main(String[] args) {
        Student s1=new Student();
        s1.show();
    }
}*/
//<<<<<<<<<<<<<==============METHOD OVERRIDING=============>>>>>>>>>>>>
/*class Vehicle{
    void start()
    {
        System.out.println("VEHICLE STARTED");
    }
}
class Car extends Vehicle{
    void start()
    {
        System.out.println("CAR STARTED");
    }
}
public class Oop{
    public static void main(String[] args) {
        Car c1=new Car();
        c1.start();
    }
}*/
/*class Employee{
    void work()
    {
        System.out.println("EMPLOYEE WORKING");
    }
}
class Developer extends Employee{
    void work()
    {
        System.out.println("WRITING CODE");
    }
}
public class Oop{
    public static void main(String[] args) {
        Developer d1=new Developer();
        d1.work();
    }
}*/
/*class Animal{
    void eat()
    {
        System.out.println("ANIMAL EATING ");
    }
}
class Dog extends Animal{
    void eat(){
        super.eat();
        System.out.println("DOG EATING ");
    }
}
public class Oop{
    public static void main(String[] args) {
        Dog d1=new Dog();
        d1.eat();
    }
}*/
/*class Bank{
    void interest()
    {
        System.out.println("GENERAL INTEREST");
    }
}
class SavingsAccount extends Bank{
    void interest()
    {
        System.out.println("SAVINGS INTEREST=7%");
    }
}
public class Oop{
    public static void main(String[] args) {
        SavingsAccount s1=new SavingsAccount();
        s1.interest();
    }
}*/
/*class Person{
    void interest()
    {
        System.out.println("I AM A PERSON");
    }
 }
 class Student extends Person{
    void interest()
    {
        //super.interest();
        System.err.println("I AM STUDENT");
    }
 }
 class Teacher extends Person{
    void interest()
    {
        //super.interest();
        System.err.println("I AM TEACHER");
    }
 }
 public class Oop{
    public static void main(String[] args) {
        Teacher t1=new Teacher();
        t1.interest();
        Student s1=new Student();
        s1.interest();
    }
 }*/
/*class Animal{
    void sound()
    {
        System.out.println("ANIMAL SOUND");
    }
}
class Dog extends Animal{
    void sound()
    {
        System.out.println("DOG BARKING");
    }
}
public  class Oop{
    public static void main(String[] args) {
        Animal a=new Dog();
        a.sound();
    }
}*/
/*class Employee{
    void work()
    {
        System.out.println("EMPLOYEE WORKING");
    }
}
class Developer extends Employee{
    void work()
    {
        System.out.println("WRITING CODE");
    }
}
public class Oop{
    public static void main(String[] args) {
        Employee e=new Developer();
        e.work();
    }
}*/
/*class A{
    void show()
    {
        System.out.println("A");
    }
}
class B extends A{
    void show()
    {
          System.out.println("B");
    }
}
class C extends B{
    void show()
    {
        System.out.println("C");
    }
}
public class Oop{
    public static void main(String[]args)
    {
        A obj=new C();
        obj.show();
    }
}*/
//<<<<<<<<<<<<<<<<<<============PRACTICE IN OOPS==========>>>>>>>>>>>>>>>>>>>>..
/*class Student{
    String name;
    int marks;
    int roll ;
    void setDetails(String n,int m,int r)
    {
        name=n;
        marks=m;
        roll=r;
    }
    void display()
    {
        System.out.println("NAME IS:"+name);
        System.out.println("MARKS IS:"+marks);
        System.out.println("ROLL NO IS:"+roll);
    }
    boolean ispass()
    {
        if (marks>=35)
            return true;
        else
            return false;
    }
}
public class Oop{
    public static void main(String[] args) {
        Student s1=new Student();
        s1.setDetails("RAJ",45,1);
        s1.display();
        System.out.println(s1.ispass());
    }
}*/
/*class Data{
    long accountno=1223407879;
    String holdername="RAJ";
    int balance=12300;
    void deposit(int deposit)
    { 
        
        this.balance=balance+deposit;
    }
    void withdraw(int a)
    {
         if(a<=balance)
         {
            balance=balance-a;
         }
         else
         {
            System.out.println("INSUFFICIENT BALANCE");
         }
    }
    void showBalance()
    {
        System.out.println("BALANCE IS:"+balance);
    }
}
public class Oop{
    public static void main(String[] args) {
        Data d1=new Data();
        d1.deposit(5000);
        d1.withdraw(6000);
        d1.showBalance();
    }
}*/
/*class Employee{
    int id;
    String name;
    int salary;
    int bonus;
    void setDetails(int i,String n,int s,int b)
    {
        id=i;
        name=n;
        salary=s;
        bonus=b;
    }
    int  CalculateTotalSalary()
    {
        int totalsalary=salary+bonus;
        return totalsalary;
    }
}
public class Oop{
    public static void main(String[] args) {
        Employee e1=new Employee();
        e1.setDetails(101,"RAM",120000,12000);
        System.out.println(e1.CalculateTotalSalary());

    }
}*/
/*class Rectangle{
    int length;
    int width;
    void Calculatearea(int l,int w)
    {
        length=l;
        width=w;
        int area=length*width;
        System.out.println("AREA IS:"+area);
    }
    void CalculatePerimeter(int l,int w)
    {
         length=l;
        width=w;
        int perimeter=2*(length+width);
        System.out.println("PERIMETER IS:"+perimeter);

    }
}
public class Oop{
    public static void main(String[] args) {
        Rectangle r1=new Rectangle();
       r1.Calculatearea(12,13);
       r1.CalculatePerimeter(12,13);
    }
}*/
/*class Circle{
    int radius;
    void area(int r)
    {
        radius=r;
        double area= 3.14*radius*radius;
        System.out.println("AREA IS:"+area);
    }
    void circumference(int r)
    {
        radius=r;
        double circumference=2*3.14*radius;
        System.out.println("CIRCUMFERENCE IS:"+circumference);
    }
}
public class Oop{
    public static void main(String[] args) {
        Circle c1=new Circle();
        c1.area(12);
        c1.circumference(12);
    }
}*/
/*class Mobile{
    String brand;
    int ram;
    int price;
    Mobile(String b,int r,int p)
    {
        this.brand=b;
        this.ram=r;
        this.price=p;
    }
    void display()
    {
        System.out.println(brand);
        System.out.println(ram);
        System.out.println(price);
    }
}
public class Oop{
    public static void main(String[] args) {
        Mobile m1=new Mobile("redmi",128,12000);
        m1.display();
    }
}*/
/*class Book{
    String title;
    int price;
    Book()
    {
        System.out.println("BOOK DONE");
    }
    Book(String t)
    {
        title=t;
        System.out.println(title);
    }
    Book(String t,int p)
    {
        title=t;
        price=p;
        System.out.println(title);
        System.out.println(price );
    }
}
public class Oop{
    public static void main(String[] args) {
        Book b1=new Book();
        Book b2=new Book("good times");
        Book b3=new Book("times of India",1240);

    }
}*/
/*class Car{
    String brand;
    int price;
    Car(String brand,int price)
    {
        this.brand=brand;
        this.price=price;
    }
    void display()
    {
        System.out.println("BRAND IS:"+brand);
        System.out.println("PRICE IS:"+price);
    }
}
public class Oop{
    public static void main(String[] args) {
        Car c1=new Car("SUZUKI",982211);
        c1.display();
    }
}*/
/*class Student{
    Student()
    {
        System.out.println("STUDENT CREATED");
    }
    Student(String name)
    {
        this();
        System.out.println("NAME IS:"+name);
    }
    Student(String name,int age)
    {
        this(name);
        System.out.println("AGE IS:"+age);
    }
}
public class Oop{
    public static void main(String[] args) {
        Student s1=new Student("RAJ",12);
    }
}*/
/*class BankAccount{
    private int balance;
    void setbalance(int b)
    {
          balance=b;
        System.out.println("BALANCE IS:"+balance);
    }
    void  getbalance() 
    {
            System.out.println("BALANCE IS:"+balance);
        
    }
}
public class Oop{
    public static void main(String[] args) {
        BankAccount b1=new BankAccount();
        b1.setbalance(5000);
        b1.getbalance();
        
    }
}*/
/*class Employee{
    private int salary;
    void setsalary(int s)
    {
        if(s<=0)
        {
            System.out.println("INSUFFICIENT BALANCE");
        }
        else
        {
            salary=s;
            System.out.println("SALARY IS:"+salary);
        }
    }
}
public class Oop{
    public static void main(String[] args) {
        Employee e1=new Employee();
        e1.setsalary(120000);
    }
}*/
/*class Student{
    private int marks;
    void setmarks(int m)
    {
        if(m<0 ||  m>100)
        {
            System.out.println("ERROR");
        }
        else
        {
            marks=m;
            System.out.println("MARKS IS:"+marks);
        }
    }
}
public class Oop{
    public static void main(String[] args) {
        Student s1=new Student();
        s1.setmarks(99);
    }
}*/
/*class Person{
    String name;
    void displayname()
    {
        System.out.println("NAME IS:"+name);
    }
}
class Student extends Person{
    int marks;
    void displaymarks()
    {
        System.out.println("MARKS IS:"+marks);
    }
}
public class Oop{
    public static void main(String[] args) {
        Student s1=new Student();
        s1.name="RAJ";
        s1.marks=98;
        s1.displayname();
        s1.displaymarks();
    }
}*/
/*class Vehicle{
    void start()
    {
        System.out.println("VEHICLE STARTED");
    }
}
class Car extends Vehicle{
    void opensunproof()
    {
        System.out.println("CAR MOVING");
    }
}
public class Oop{
    public static void main(String[] args) {
        Car c1=new Car();
        c1.opensunproof();
        c1.start();
    }
}*/
/*class Animal{
    void eat()
    {
        System.out.println("ANIMAL EATING");
    }
}
class Dog extends Animal{
    void bark()
    {
        System.out.println("BARKING");
    }
}
public class Oop{
    public static void main(String[] args) {
        Dog d1=new Dog();
        d1.bark();
        d1.eat();

    }
}*/
/*class Animal{
    void eat()
    {
        System.out.println("ANIMAL EATING");
    }
}
class Dog extends Animal{
    void bark()
    {
        System.out.println("BARKING");
    }
} 
class Puppy extends Dog{
    void weep()
    {
        System.out.println("WEEPING");
    }
}
public class Oop{
    public static void main(String[] args) {
        Puppy p1=new Puppy();
        p1.weep();
        p1.bark();
        p1.eat();
    }
}*/
/*class Person{
    String name;
    Person(String name)
    {
        this.name=name;
    }
}
class Student extends Person{
    int marks;
    Student (String name,int marks)
    {
        super(name);
        this.marks=marks;
    }
    void display()
    {
        System.out.println("NAME IS:"+name);
        System.out.println("MARKS IS:"+marks);
    }
}
public class Oop{
    public static void main(String[] args) {
        Student s1=new Student("RAJ",123);
        s1.display();
        
    }
}*/
/*class Person{
    String name;
    Person(String name)
    {
        this.name=name;
    }
}
class Student extends Person{
    String name;
    Student(String name)
    {
        super("RAM");
        this.name=name;
    } 
    void display()
    {
        System.out.println(name);
        System.out.println(super.name);
    }
}
public class Oop{
    public static void main(String[] args) {
        Student s1=new Student("RAJ");
        s1.display();

    }
}*/
/*class Person{
    String name;
    Person(String name)
    {
        this.name=name;
    }
    void display(){
        System.out.println(name);
    }
}
class Student extends Person{
    String name;
    Student(String name)
    {
        super("RAM");
        this.name=name;
    }
    void display()
    {
        super.display();
        System.out.println(name);
    }
}
public class Oop{
    public static void main(String[] args) {
        Student s1=new Student("RAJ");
        s1.display();

    }
}*/
/*abstract class Shape{
    abstract void area();
}
class Circle extends Shape{
        double radius;
        Circle(double radius)
        {
            this.radius=radius;
        }
        void area()
        {
            double area=Math.PI*radius*radius;
            System.out.println("AREA IS:"+area);
        }
}*/
//<<<<<<<<<<<<<<<<<<<<<<<<JAVA OOPS REVISION PRACTICE>>>>>>>>>>>>>>>>>>>>>>>>>>
/*class Student{
    String name;
    int age;
     void display()
    {
        System.out.println("NAME IS:"+name);
        System.out.println("AGE IS:"+age);
    }
}
public class Oop{
    public static void main(String[] args) {
        Student s1=new Student();
        Student s2=new Student();
        s1.name="RAJ";
        s1.age=15;
        s1.display();
        s2.name="RAM";
        s2.age=54;
        s2.display();
    }
}*/
/*class Mobile{
    String brand;
    int  model;
    int price;
    void displaydetails()
    {
        System.out.println("BRAND IS:"+brand);
        System.out.println("MODEL IS:"+model);
        System.out.println("PRICE IS:"+price);
    }
}
public class Oop{
    public static void main(String[] args) {
        Mobile m1=new Mobile();
        m1.brand="APPLE";
        m1.model=2016;
        m1.price=12000;
        m1.displaydetails();
        Mobile m2=new Mobile();
        m2.brand="SAMSUNG";
        m2.model=2032;
        m2.price=190000;
        m2.displaydetails();    
    }
}*/
/*class BankAccount{
    long accountno;
    String accountholdername;
    int balance;
    void deposit(int amount)
    {
     balance=balance+amount;
     System.out.println("NEW BALANCE IS:"+balance);
    }
    void withdraw(int amount)
    {
        balance=balance-amount;
        System.out.println("NEW BALANCE IS:"+balance);
    }
    void displaybalance()
    {
        System.out.println("BALANCE IS:"+balance);
    }
}
public class Oop{
    public static void main(String[] args) {
        BankAccount b1=new BankAccount();
        b1.accountno=1234567;
        b1.accountholdername="RAJ";
        b1.balance=120000;
        b1.deposit(12000);
        b1.withdraw(12000);
        b1.displaybalance();    
    }
}*/
/*class Employee{
    String name;
    int salary;
    Employee()
    {
        System.out.println("OBJECT CREATED");
    }
}
public class Oop{
    public static void main(String[] args) {
        Employee e1=new Employee();
    }
}*/
/*class Laptop{
    String brand;
    int ram;
    Laptop()
    {
    }
    void display()
    {
        System.out.println("BRAND IS:"+brand);
        System.out.println("RAM IS:"+ram);
    }
}
public class Oop{
    public static void main(String[] args) {
        Laptop l1=new Laptop();
        l1.brand="DELL";
        l1.ram=12;
        l1.display();
    }
}*/
/*class Book{
    String title;
    String author;
    int price;
    Book (String t,String a,int p)
    {
        title=t;
        author=a;
        price=p;
    }
    void display()
    {
        System.out.println("TTILE IS:"+title);
        System.out.println("AUTHOR IS:"+author);
        System.out.println("PRICE IS:"+price);
    }
}
public class Oop{
    public static void main(String[] args) {
        Book b1=new Book("GOOD TIMES","SUDHA MURTHY",1200);
        b1.display();
    }
}*/
/*class Employee{
    String name;
    int salary;
    Employee(String n,int s)
    {
        name=n;
        salary=s;
    }
    void display()
    {
        System.out.println(name);
        System.out.println(salary);
    }
}
public class Oop{
    public static void main(String[] args) {
        Employee e1=new Employee("RAJ",120000);
        Employee e2=new Employee("RAM",10000);
        Employee e3=new Employee("RAJU",190000);
        e1.display();
        e2.display();
        e3.display();

    }
}*/
/*class Car{
    String brand;
    int price;
    int  model;
    Car(String b,int p,int  m)
    {
        brand=b;
        price=p;
        model=m;
    }
    void display()
    {
        System.out.println(brand);
        System.out.println(price);
        System.out.println(model);
    }
}
public class Oop{
    public static void main(String[] args) {
        Car c1=new Car("SUZUKI",12000,2016);
        Car c2=new Car("SWIFT",120000,2020);
        Car c3=new Car("MARUTHI",23000,2116);
        Car c4=new Car("ACCESS",190000,1016);
        c1.display();
        c2.display();
        c3.display();
        c4.display();
    }
}*/
/*class Book{
    String title;
    String author;
    int price;
    Book()
    {
        System.out.println("DEFAULT CONSTRUCTOR");
    }
    Book(String t)
    {
        title=t;
    }
    Book(String t,String a)
    {
        title=t;
        author=a;
    }
    Book(String t,String a,int p)
    {
        title=t;
        author=a;
        price=p;
    }
    void display()
    {
        System.out.println("TITLE IS:"+title);
        System.out.println("AUTHOR IS:"+author);
        System.out.println("PRICE IS:"+price);
    }
}
public class Oop{
    public static void main(String[] args) {
        Book b1=new Book();
        Book b2=new Book("GOOD TIMES");
        Book b3=new Book("GOOD DEEDS","SUDHA MURTHY");
        Book b4=new Book("GOOD DAYS","NARAYAN MURTHY",1200);
        b1.display();
        b2.display();;
        b3.display();
        b4.display();

    }
}*/
/*class Mobiles{
    String brand;
    int price;
    int model;
    Mobiles()
    {
        System.out.println("DEFAULT CONSTRUCTOR");
    }
    Mobiles(String b)
    {
         brand=b;
    }
    Mobiles(String b,int p)
    {
        brand=b;
        price=p;
    }
    Mobiles(String b,int p,int m)
    {
         brand=b;
        price=p;
        model=m;
    }
    void display()
    {
        System.out.println(brand);
        System.out.println(price);
        System.out.println(model);
    }
}
public class Oop{
    public static void main(String[] args) {
        Mobiles m1=new Mobiles();
        Mobiles m2=new Mobiles("APPLE");
        Mobiles m3=new Mobiles("SAMSUNG",23000);
        Mobiles m4=new Mobiles("REDMI",19000,2020);
        m1.display();
        m2.display();
        m3.display();
        m4.display();
    }
}*/
/*class Employee{
    private String name;
    private int salary;
    void setname(String n)
    {
        name=n;
    }
    void setsalary(int s)
    {
        salary=s;
    }
    String getname()
    {
        return name;
    }
    int getsalary()
    {
        return salary;
    }
}
public class Oop{
    public static void main(String[] args) {
        Employee e1=new Employee();
        e1.setname("RAJ");
        e1.setsalary(40000);
        System.out.println(e1.getname());
        System.out.println(e1.getsalary());
    }
}*/
/*class BankAccount{
    private int balance;
    void setbalance(int b)
    {
        if(b<0)
        {
            System.out.println("INVALID BALANCE");
        }
        else
        {
          balance+=b;
        }
    }
    int getbalance()
    {
        return balance;
    }
}
public class Oop{
    public static void main(String[] args) {
        BankAccount b1=new BankAccount();
        b1.setbalance(-1000);
        System.out.println("BALANCE IS:"+b1.getbalance());
    }
}*/
/*class Vehicle{
    String brand;
    int price;
     void displayVehicle()
    {
        System.out.println("VEHICLE CREATED ");
    }
}
class Car extends Vehicle{
    int model;
    void displayCar()
    {
        System.out.println("CAR CREATED ");
    }
}
public class Oop{
    public static void main(String[] args) {
        Car c1=new Car();
        c1.brand="SUZUKI";
        c1.price=1000000;
        c1.model=2016;
        System.out.println(c1.brand);
        System.out.println(c1.price);
        System.out.println(c1.model);
        c1.displayCar();
        c1.displayVehicle();
    }
}*/
/*class Person{
    String name;
    int age;
    void displayperson()
    {
        System.out.println("PERSON CREATED");
    }
}
class Student extends Person{
    int roll;
    String branch;
    void displaystudent()
    {
        System.out.println("STUDENT CREATED");
    }
}
public class Oop{
    public static void main(String[] args) {
        Student s1=new Student();
        Student s2=new Student();
        s1.name="raj";
        s1.age=12;
        s1.roll=40;
        s1.branch="CSE";
        s2.name="ram";
        s2.age=16;
        s2.roll=44;
        s2.branch="ECE";
        System.out.println(s1.name);
        System.out.println(s1.age);
        System.out.println(s1.roll);
        System.out.println(s1.branch);
        System.out.println(s2.name);
        System.out.println(s2.age);
        System.out.println(s2.roll);
        System.out.println(s2.branch);
        s1.displayperson();
        s1.displaystudent();
        s2.displayperson();
        s2.displaystudent();


    
}}*/
/*class Animal {

    void eat() {
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal {

    void eat() {
        System.out.println("Dog is eating");
    }
    void display()
    {
        super.eat();

    }
}
public class Oop{
    public static void main(String[] args) {
        Dog d1=new Dog();
        d1.eat();
        d1.display();
        

    }
}*/
/*class  Vehicle{
    void start()
    {
        System.out.println("VEHICLE STARTED");
    }
}
class Car extends Vehicle{
    void start()
    {
        super.start();
        System.out.println("CAR STARTED");
    }

}
public class Oop{
    public static void main(String[] args) {
        Car c1=new Car();
        c1.start();
    }
}*/  
/*class Book{
    String title;
    Book()
    {
        System.out.println("BOOK DONE....");
    }
    Book(String title)
    {
        this.title=title;
        System.out.println(title);
    }
}
public class Oop{
    public static void main(String[] args) {
        Book b1=new Book();
        Book b2=new Book("HAPPY");
    }
}*/
/*class BankAccount{
    private  int balance=1000;
     void deposit(int a)
     {
          balance+=a;
     }
     void withdraw(int m)
     {
        if(m<00)
        {
           System.out.println("INSUFFICIENT BALANCE")
        }
           else
           {
            balance=balance-m;
            }
     }
     int  getbalance()
     {
        return balance;
     }
}
public class Oop{
    public static void main(String[] args) {
        BankAccount b1=new BankAccount();
        b1.deposit(10000);
        b1.withdraw(1000);
        System.out.println(b1.getbalance());
    }
}*/
/*class Person{
    int age;
    String name;
}
class Student extends Person{
    int roll;
}
public class Oop{
    public static void main(String[] args) {
        Student s1=new Student();
        s1.age=12;
        s1.name="raj";
        s1.roll=11;
        System.out.println(s1.age);
        System.out.println(s1.name);
        System.out.println(s1.roll);

    }
}*/
/*class Animal{
    void sound()
    {
        System.out.println("ANIMAL SOUND");
    }
}
class Dog extends Animal{
    void sound()
    {
        System.out.println("DOG SOUND");
    }
}
public class Oop{
    public static void main(String[] args) {
        Animal a1=new Dog();
        a1.sound();
    }
}*/
/*class Animal{
    void sound()
    {
        System.out.println("ANIMAL SOUND");
    }
}
class Dog extends Animal{
    void sound()
    {
        System.out.println("DOG SOUND");
    }
}
class Cat extends Animal{
    void sound()
    {
        System.out.println("CAT SOUND ");
    }
}
public class Oop{
    public static void main(String[] args) {
        Animal a=new Animal();
        a.sound();
        a=new Dog();
        a.sound();
        a=new Cat();
        a.sound();
    }
}
*/

// CONSTRUCTOR OVERLOADING
/*class Student{
    String name;
    int age;
    Student()
    {
        name="UNKNOWN";
        age=0;
    }
    Student(String name)
    {
        this.name=name;
        age=0;
    }
    Student(String name,int age)
    {
        this.name=name;
        this.age=age;    
    }
    void display()
    {
        System.out.println(name);
        System.out.println(age);
    }

}
public class Oop{
    public static void main(String[] args)        
    {
        Student s1=new Student();
        Student s2=new Student("RAJ");
        Student s3=new Student("RAM",20);
        s1.display();
        s2.display();
        s3.display();
    }
}*/
/*class Student{
    int age;
    String name;
    float marks;
}
public class Oop {
    public static void main(String[] args) {
        Student s1=new Student();
        s1.name="Rakshitha";
        s1.age=15;
        s1.marks=5.6f;
        System.out.println(s1.name);
        System.out.println(s1.age);
        System.out.println(s1.marks);

    }
    
}*/
/*class Car{
    String brand;
    int  model;
    long price;
}
public class Oop{
    public static void main(String[] args) {
        Car c1=new Car();
        c1.brand="suzuki";
        c1.model=2016;
        c1.price=100000;
        System.out.println(c1.brand);
        System.out.println(c1.model);
        System.out.println(c1.price);
    }
}*/
/*class Employee{
    int id;
    String name;
    long salary;
}
public class Oop{
    public static void main(String[] args) {
        Employee e1=new Employee();
        Employee e2=new Employee();
        e1.id=102;
        e1.name="RAJ";
        e1.salary=50000;
        e2.id=103;
        e2.name="RAM";
        e2.salary=16000;
        System.out.println("EMPLOYEE E1 DETAILS ARE:");
        System.out.println(e1.id);
         System.out.println(e1.name);
          System.out.println(e1.salary);
          System.out.println("EMPLOYEE E2 DETAILS ARE:");
        System.out.println(e2.id);
         System.out.println(e2.name);
          System.out.println(e2.salary);

    }
}*/
/*class Mobile{
    String brand;
    int  RAM;
    String storage;
    long price;
}
public class Oop{
    public static void main(String[] args) {
        Mobile m1=new Mobile();
        Mobile m2=new Mobile();
        m1.brand="samsung";
        m1.RAM=521;
        m1.storage="124gb";
        m1.price=10000;
        m2.brand="samsung";
        m2.RAM=521;
        m2.storage="124gb";
        m2.price=10000;
        System.out.println("MOBILE 1 DETAILS ARE:");
        System.out.println(m1.brand);
        System.out.println(m1.RAM);
        System.out.println(m1.storage);
        System.out.println(m1.price);
        System.out.println("MOBILE 2 DETAILS ARE:");
        System.out.println(m2.brand);
        System.out.println(m2.RAM);
        System.out.println(m2.storage);
        System.out.println(m2.price);
        if(m1==m2)
        {
            System.out.println("OBJECTS ARE THE SAME");
        }
        else
        {
            System.out.println("OBJECTS ARE NOT  THE SAME");
        }

    }
}*/
// METHOD INSIDE A CLASS 
/*class Car{
    String brand;
    int price;
    void start()
    {
        System.out.println("CAR STARTED");
    }

}
public class Oop{
    public static void main(String[] args) {
        Car c1=new Car();
        c1.start();
    }
}*/
/*class Fan{
    String brand;
    int speed;
    void turnon()
    {
        System.out.println("TURNED ON");
    }
    void turnoff()
    {
        System.out.println("TURNED OFF");
    }
}
public class Oop{
    public static void main(String[] args) {
        Fan f1=new Fan();
        f1.turnon();
        f1.turnoff();
    }
}*/
/*class Mobiles{
    String brand;
    int Storage;
    void call()
    {
        System.out.println("Calling");
    }
}
public class Oop{
    public static void main(String[] args) {
        Mobiles m1=new Mobiles();
        Mobiles m2=new Mobiles();
        m1.call();
        m2.call();
    }
}*/
// METHODS WITH OBJECT DATA
/*class Car{
    String brand;
    int model;
    int price;
    void display()
    {
        System.out.println(brand);
        System.out.println(model);
        System.out.println(price);
    }
}
public class Oop{
    public static void main(String[] args) {
        Car c1=new Car();
        Car c2=new Car();
        c1.brand="Maruthi";
        c1.model=2016;
        c1.price=50000;
        c2.brand="Swift";
        c2.model=2017;
        c2.price=20000;
        c1.display();
        c2.display();
    }
}*/  
/*class Employee{
    int id;
    int salary;
    String name;
    void display()
    {
        System.out.println(id);
        System.out.println(salary);
        System.out.println(name);
    }
}
public class Oop{
    public static void main(String[] args){
        Employee e1=new Employee();
        Employee e2=new Employee();
        e1.id=101;
        e1.salary=45000;
        e1.name="RAJ";
        e2.id=106;
        e2.salary=25000;
        e2.name="RAM";
        e1.display();
        e2.display();
    }
}*/ 
/*class Bankaccount{
    long accountno;
    String name;
    int balance;
    void showbalance()
    {
        System.out.println(accountno);
        System.out.println(name);
        System.out.println(balance);
    }
}
public class Oop{
    public static void main(String[] args){
        Bankaccount b1=new Bankaccount();
        Bankaccount b2=new Bankaccount();
        b1.accountno=122222;
        b1.name="RAJ";
        b1.balance=15000;
        b2.accountno=1234567;
        b2.name="RAM";
        b2.balance=2000;
        b1.showbalance();
        b2.showbalance();
    }
}*/
// METHOD WITH PARAMETERS
/*class Student{
    String name;
    int age;
    double marks;
    void setDetails(String n,int a,double m)
    {
        name=n;
        age=a;
        marks=m;
    }
    void display()
    {
        System.out.println("NAME IS:"+name);
        System.out.println("AGE IS:"+age);
        System.out.println("MARKS IS:"+marks);
    }
}
public class Oop{
    public static void main(String[] args) {
        Student s1=new Student();
        Student s2=new Student();
        s1.setDetails("RAM",15,86.75);
        s2.setDetails("RAJ",14,96.75);
        s1.display();
        s2.display();
    }
}*/
/*class Mobile{
    String brand;
    int ram;
    int price;
    void setDetails(String b,int r,int p)
    {
        brand=b;
        ram=r;
        price=p;
    }
    void showDetails()
    {
        System.out.println("BRAND IS:"+brand);
        System.out.println("RAM IS:"+ram);
        System.out.println("PRICE IS:"+price);
    }

}
public class Oop{
    public static void main(String[] args) {
        Mobile m1=new Mobile();
         Mobile m2=new Mobile();
         m1.setDetails("SAMSUNG",12,50000);
         m2.setDetails("Apple",8,45000);
         m1.showDetails();
         m2.showDetails();

    }
}*/
/*class Bank{
    int accountno;
    String name;
    int balance;
    void createaccount(int a,String n,int b)
    {
        accountno=a;
        name=n;
        balance=b;
    }
    void showaccount()
    {
        System.out.println("ACCOUNT NO IS:"+accountno);
        System.out.println("NAME IS:"+name);
        System.err.println("BALANCE IS:"+balance);
    }
}
public class Oop{
    public static void main(String[] args) {
        Bank b1=new Bank();
        Bank b2=new Bank();
        b1.createaccount(123456, "RAM", 25000);
        b2.createaccount(123123456, "RAJ", 21220);
        b1.showaccount();
        b2.showaccount();
    }
}*/
// METHODS WITH RETURN TYPE
/*class Bank{
    String name;
    double balance;
    void setDetails(String n,double b){
        name=n;
        balance=b;
    }
    boolean hasminimumBalance()
    {
        if(balance>5000)
            return true;
        else
            return false;
    }
}
public class Oop{
    public static void main(String[] args) {
        Bank b1=new Bank();
        Bank b2=new Bank();
        b1.setDetails("RAM", 20000);
        b2.setDetails("RAJ", 2000);
        System.out.println(b1.hasminimumBalance());
         System.out.println(b2.hasminimumBalance());
    }
}*/
/*class Circle{
    int radius;
    void setRadius(int r)
    {
        radius=r;
    }
    double area()
    {
        double Area=3.14*radius*radius;
       return Area; 
    }
}
public class Oop{
    public static void main(String[] args) {
        Circle c1=new Circle();
        c1.setRadius(2);
        System.out.println(c1.area());
    }
}*/
/*class Employee{
    int salary;
    int bonus;
    void setDetails(int s,int b){
        salary=s;
        bonus=b;
    }
    int total()
    {
       int totalsalary=salary+bonus;
       return totalsalary;    
    }
}
public class Oop{
    public static void main(String[] args) {
        Employee e1=new Employee();
        e1.setDetails(50000, 12000);
        System.out.println(e1.total());
    }
}*/
//<<<<+============================METHOD OVERLOADING==================================+>>>>>>
/*class Calculator{
    int add(int a ,int b)
    {
        return a+b;
    }
    int add(int a,int b,int c)
    {
        return a+b+c;
    }
    double add(double a,double b)
    {
        return a+b;
    }

}
public class Oop{
    public static void main(String[] args) {
        Calculator c1=new Calculator();
        int a=c1.add(10,20);
        int b=c1.add(10,20,30);
        double d=c1.add(3.14,3.14);
        System.out.println(a);
        System.out.println(b);
        System.out.println(d);
    }
}*/
/*class Calculator{
    int area(int side)
    {
        return side*side;
    }
    int area(int length,int width)
    {
        return length*width;
    }
}
public class Oop{
    public static void main(String[] args) {
        Calculator c1=new Calculator();
        System.out.println(c1.area(15));
        System.out.println(c1.area(15,10));
    }
}*/
/*class Calculator{
    void show(int id)
    {
        System.out.println("ID IS:"+id);
    }
    void show(String x)
    {
        System.out.println("NAME IS:"+x);
    }
    void  show(int id,String x)
    {
        System.out.println("NAME IS:"+x+" AND"+" ID IS:"+id);
    }
}
public class Oop{
    public static void main(String[] args) {
        Calculator c1=new Calculator();
       c1.show(101);
       c1.show("RAM");
       c1.show(102,"RAJ");
    }
}*/
//<=============CONSTRUCTORS===============>
    /*class Car{
        Car()
        {
            System.out.println(" CAR OBJECT CREATED");
        }
    }
    public class Oop{
        public static void main(String[] args) {
            Car c1=new Car();
            Car c2=new Car();
        }
    }*/
   /*class Student{
    Student()
    {
        System.out.println("STUDENT OBJECT CREATED");
    }
   }
   public class Oop{
    public static void main(String[] args) {
        Student s1=new Student();
        Student s2=new Student();
        Student s3=new Student();
    }
   }*/
  /*class Mobile{
    String brand;
    int price; 
    Mobile()
    {
        System.out.println("MOBILES  object CREATED");
    }
  }
public class Oop{
    public static void main(String[] args) {
        Mobile m1=new Mobile();
        Mobile m2=new Mobile();

    }
}*/
//<============CONSTRUCTOR ASSIGN VALUES AND WHY NOT DEFALUT VALUIES==================>
/*class Student{
    String name;
    int age;
    void display()
    {
        System.out.println(name);
        System.out.println(age);
    }
}
public class Oop{
    public static void main(String[] args) {
        Student s1=new Student();
        s1.display();
    }
}*/
/*class Employee{
    int id;
    String name;
    int salary;
    Employee()
    {
        id=101;
        name="RAJ";
        salary=50000;
    }
    void display()
    {
        System.out.println(id);
        System.out.println(name);
        System.out.println(salary);
    }

}
public class Oop{
    public static void main(String[] args) {
        Employee e1=new Employee();
        e1.display();
    }
}*/
/*class Mobile{
    String brand;
    int price;
    Mobile()
    {
        brand="samsung";
        price=20000;
    }
    void display()
    {
        System.out.println(brand);
        System.out.println(price);
    }
}
public class Oop{
    public static void main(String[] args) {
        Mobile m1=new Mobile();
        Mobile m2=new Mobile();
        m1.display();
        m2.display();
    }
}*/
//<<<<<<================CONSTRUCTOR WITH PARAMETER VALUES==============>>>>>>>

/*class Student{
    String name;
    int age;
    double marks;
    Student(String n,int a,double m)
    {
        name=n;
        age=a;
        marks=m;
    }
    void display()
    {
        System.out.println("NAME IS:"+name);
        System.out.println("AGE IS:"+age);
        System.out.println("MARKS IS:"+marks);
    }
}
public class Oop{
    public static void main(String[] args) {
        Student s1=new Student("Sagar",14,78.99);
         Student s2=new Student("Raj",10,40.99);
         s1.display();
         s2.display();
    }
}*/
/*class Car{
    String brand;
    int model;
    long price;
    Car( String b,int m,long p)
    {
        brand=b;
        model=m;
        price=p;
    }
    void display()
    {
        System.out.println("BRAND IS:"+brand);
        System.out.println("MODEL IS:"+model);
        System.out.println("PRICE IS:"+price);
    }
}
public class Oop{
    public static void main(String[] args) {
        Car c1=new Car("SWIFT",2018,890000);
        Car c2=new Car("SUZUKI",2000,908000);
        c1.display();
        c2.display();
    }
}*/
/*class Bank{
    long accountnumber;
    String holdername;
    double balance;
    Bank(long n,String na,double b)
    {
        accountnumber=n;
        holdername=na;
        balance=b;
    }
    void display()
    {
        System.out.println("BANK NO. IS:"+accountnumber);
        System.out.println("HOLDER NAME is:"+holdername);
        System.out.println("BALANCE IS:"+balance);
    }
}
public class Oop{
    public static void main(String[] args) {
        Bank b1=new Bank(12345678,"RAJ",56745);
        Bank b2=new Bank(2345611,"RAJ",123.54);
        b1.display();
        b2.display();
    }
}*/
//<<<<<<<<<<<<<<=================CONSTRUCTOR OVERLOADING====================>>>>>>>>>>>>>>>>>>
/*class Mobile{
    Mobile()
    {
        System.out.println("NO DATA");
    }
    Mobile(String name){
        System.out.println(name);
    }
    Mobile(String name,int age)
    {
        System.out.print(name);
        System.out.println(" "+age);
    }
}
public class Oop{
    public static void main(String[] args) {
        Mobile m1=new Mobile();
        Mobile m2=new Mobile("RAJ");
        Mobile m3=new Mobile("RAJ",16);
    }
}*/
/*class Student{
    Student()
    {
        System.out.println("Student created");
    }
    Student(String name)
    {
        System.out.println("NAME IS:"+name);
    }
}
public class Oop{
    public static void main(String[] args) {
        Student s1=new Student();
        Student s2=new Student("RAJ");
    }
}*/
/*class Book{
    Book()
    {
        System.out.println("BOOK CREATED");
    }
    Book(String title)
    {
        System.out.println("TITLE IS:"+title);
    }
    Book(String title,int price)
    {
         System.out.println("TITLE IS:"+title);
         System.out.println("PRICE IS:"+price);
    }
}
public class Oop{
    public static void main(String[] args) {
        Book b1=new Book();
        Book b2=new Book("GOOD DEEDS");
        Book b3=new Book("TIMES OF INDIA",5600);
    }
}*/
/*class Employee{
    Employee()
    {
        System.out.println("EMPLOYEE CREATED");
    }
    Employee(int id)
    {
        System.out.println("ID IS:"+id);
    }
    Employee(int id,String name)
    {
        System.out.println("ID IS:"+id);
        System.out.println("NAME IS:"+name);
    }
}
public class Oop{
    public static void main(String[] args) {
        Employee e1=new Employee();
        Employee e2=new Employee(101);
        Employee e3=new Employee(1010,"RAM");
    }
}*/
//<<<<<<<<<<<<<<<<<<<<<<<<<=================THIS KEYWORD===============>>>>>>>>>>>>>>>>>>>>>>>>>>
/*class Employee{
    int id;
    String name;
    double salary;
    Employee(int id,String name,double salary)
    {
        this.id=id;
        this.name=name;
        this.salary=salary;
    }
    void display()
    {
        System.out.println(id);
        System.out.println(name);
        System.out.println(salary);
    }
}
public class Oop{
    public static void main(String[] args) {
        Employee e1=new Employee(101,"RAM",5000);
        Employee e2=new Employee(202,"RAMU",23000);
        e1.display();
        e2.display();
    }
}*/
//<<<<<<<<<<<<<<<<<<==================ENCAPSULATION=====================>>>>>>>>>>>>>>>>>>>>>>>>
/*class Student{
    private String name;
    private int age;
    void setName(String n)
    {
        name=n;
    }
      String  getName()
    {
        return name;
    }
    void setAge(int a)
    {
        if(a>0)
        {
            age=a;
        }
        else{
            System.out.println("INVALID AGE");
        }
    }
    int  getAge()
    {
       return age;
    }
}
public class Oop{
    public static void main(String[] args) {
        Student s1=new Student();
        s1.setName("RAJ");
        System.out.println(s1.getName());
        s1.setAge(-1);
        System.out.println(s1.getAge());
    }
}*/
//<<<<<<<<<<<<<<<<<<<<<<================INHERITANCE========================>>>>>>>>>>>>>>>>>>>>>>
/*class Vehicle{
    String brand="SUZUKI";
    void start()
    {
        System.out.println("VEHICLE CREATED");
    }
}
class Car extends Vehicle{

}
public class Oop{
    public static void main(String[] args) {
        Car c1=new Car();
        System.out.println(c1.brand);
        c1.start();
    }
}*/
/*class Person{
    String name;
    void displayName()
    {
        System.out.println(name);
    }
}
class Student extends Person{
    int marks;
    void displayMarks()

    {
        System.out.println(marks);
    }
}
public class Oop{
    public static void main(String[] args) {
        Student s1=new Student();
        s1.name="RAJ";
        s1.marks=95;
        s1.displayName();
        s1.displayMarks();
    }
}*/
/*class Animal{
    Animal()
    {
        System.out.println("ANIMAL CREATED");
    }
}
class Dog extends Animal{
    Dog()
    {
        System.out.println("DOG CREATED");
    }
}
public class Oop{
    public static void main(String[] args) {
        Dog d1=new Dog();

    }
}*/
/*class Vehicle{
    Vehicle()
    {
        System.out.println("VEHICLE CONSTRUCTOR");
    }
}
class Car extends Vehicle{
    Car()
    {
        System.out.println("CAR CREATED");
    }
}
public class Oop{
    public static void main(String[] args) {
        Car c1=new Car();
        Car c2=new  Car();
    }
}*/
/*class Person{
    String name;
    Person(String n)
    { 
        name=n;
    }
}
class Student extends Person{
    int marks;
    Student(String n,int m)
    {
        super(n);
        marks=m;
    }
    void display()
    {
        System.out.println(name);
        System.out.println(marks);
    }
}
public class Oop{
    public static void main(String[] args) {
        Student s1=new Student("RAJ",56);
        s1.display();

    }
}*/
/*class Person{
    void display()
    {
        System.out.println("PERSON METHOD");
    }
}
class Student extends Person{
    void display()
    {
        System.out.println("Student method");
    }
    void show()
    {
        display();
        super.display();
    }

}
public class Oop{
    public static void main(String[] args) {
        Student s1=new Student();
        s1.show();
    }
}*/
//<<<<<<<<<<<<<==============METHOD OVERRIDING=============>>>>>>>>>>>>
/*class Vehicle{
    void start()
    {
        System.out.println("VEHICLE STARTED");
    }
}
class Car extends Vehicle{
    void start()
    {
        System.out.println("CAR STARTED");
    }
}
public class Oop{
    public static void main(String[] args) {
        Car c1=new Car();
        c1.start();
    }
}*/
/*class Employee{
    void work()
    {
        System.out.println("EMPLOYEE WORKING");
    }
}
class Developer extends Employee{
    void work()
    {
        System.out.println("WRITING CODE");
    }
}
public class Oop{
    public static void main(String[] args) {
        Developer d1=new Developer();
        d1.work();
    }
}*/
/*class Animal{
    void eat()
    {
        System.out.println("ANIMAL EATING ");
    }
}
class Dog extends Animal{
    void eat(){
        super.eat();
        System.out.println("DOG EATING ");
    }
}
public class Oop{
    public static void main(String[] args) {
        Dog d1=new Dog();
        d1.eat();
    }
}*/
/*class Bank{
    void interest()
    {
        System.out.println("GENERAL INTEREST");
    }
}
class SavingsAccount extends Bank{
    void interest()
    {
        System.out.println("SAVINGS INTEREST=7%");
    }
}
public class Oop{
    public static void main(String[] args) {
        SavingsAccount s1=new SavingsAccount();
        s1.interest();
    }
}*/
/*class Person{
    void interest()
    {
        System.out.println("I AM A PERSON");
    }
 }
 class Student extends Person{
    void interest()
    {
        //super.interest();
        System.err.println("I AM STUDENT");
    }
 }
 class Teacher extends Person{
    void interest()
    {
        //super.interest();
        System.err.println("I AM TEACHER");
    }
 }
 public class Oop{
    public static void main(String[] args) {
        Teacher t1=new Teacher();
        t1.interest();
        Student s1=new Student();
        s1.interest();
    }
 }*/
/*class Animal{
    void sound()
    {
        System.out.println("ANIMAL SOUND");
    }
}
class Dog extends Animal{
    void sound()
    {
        System.out.println("DOG BARKING");
    }
}
public  class Oop{
    public static void main(String[] args) {
        Animal a=new Dog();
        a.sound();
    }
}*/
/*class Employee{
    void work()
    {
        System.out.println("EMPLOYEE WORKING");
    }
}
class Developer extends Employee{
    void work()
    {
        System.out.println("WRITING CODE");
    }
}
public class Oop{
    public static void main(String[] args) {
        Employee e=new Developer();
        e.work();
    }
}*/
/*class A{
    void show()
    {
        System.out.println("A");
    }
}
class B extends A{
    void show()
    {
          System.out.println("B");
    }
}
class C extends B{
    void show()
    {
        System.out.println("C");
    }
}
public class Oop{
    public static void main(String[]args)
    {
        A obj=new C();
        obj.show();
    }
}*/
//<<<<<<<<<<<<<<<<<<============PRACTICE IN OOPS==========>>>>>>>>>>>>>>>>>>>>..
/*class Student{
    String name;
    int marks;
    int roll ;
    void setDetails(String n,int m,int r)
    {
        name=n;
        marks=m;
        roll=r;
    }
    void display()
    {
        System.out.println("NAME IS:"+name);
        System.out.println("MARKS IS:"+marks);
        System.out.println("ROLL NO IS:"+roll);
    }
    boolean ispass()
    {
        if (marks>=35)
            return true;
        else
            return false;
    }
}
public class Oop{
    public static void main(String[] args) {
        Student s1=new Student();
        s1.setDetails("RAJ",45,1);
        s1.display();
        System.out.println(s1.ispass());
    }
}*/
/*class Data{
    long accountno=1223407879;
    String holdername="RAJ";
    int balance=12300;
    void deposit(int deposit)
    { 
        
        this.balance=balance+deposit;
    }
    void withdraw(int a)
    {
         if(a<=balance)
         {
            balance=balance-a;
         }
         else
         {
            System.out.println("INSUFFICIENT BALANCE");
         }
    }
    void showBalance()
    {
        System.out.println("BALANCE IS:"+balance);
    }
}
public class Oop{
    public static void main(String[] args) {
        Data d1=new Data();
        d1.deposit(5000);
        d1.withdraw(6000);
        d1.showBalance();
    }
}*/
/*class Employee{
    int id;
    String name;
    int salary;
    int bonus;
    void setDetails(int i,String n,int s,int b)
    {
        id=i;
        name=n;
        salary=s;
        bonus=b;
    }
    int  CalculateTotalSalary()
    {
        int totalsalary=salary+bonus;
        return totalsalary;
    }
}
public class Oop{
    public static void main(String[] args) {
        Employee e1=new Employee();
        e1.setDetails(101,"RAM",120000,12000);
        System.out.println(e1.CalculateTotalSalary());

    }
}*/
/*class Rectangle{
    int length;
    int width;
    void Calculatearea(int l,int w)
    {
        length=l;
        width=w;
        int area=length*width;
        System.out.println("AREA IS:"+area);
    }
    void CalculatePerimeter(int l,int w)
    {
         length=l;
        width=w;
        int perimeter=2*(length+width);
        System.out.println("PERIMETER IS:"+perimeter);

    }
}
public class Oop{
    public static void main(String[] args) {
        Rectangle r1=new Rectangle();
       r1.Calculatearea(12,13);
       r1.CalculatePerimeter(12,13);
    }
}*/
/*class Circle{
    int radius;
    void area(int r)
    {
        radius=r;
        double area= 3.14*radius*radius;
        System.out.println("AREA IS:"+area);
    }
    void circumference(int r)
    {
        radius=r;
        double circumference=2*3.14*radius;
        System.out.println("CIRCUMFERENCE IS:"+circumference);
    }
}
public class Oop{
    public static void main(String[] args) {
        Circle c1=new Circle();
        c1.area(12);
        c1.circumference(12);
    }
}*/
/*class Mobile{
    String brand;
    int ram;
    int price;
    Mobile(String b,int r,int p)
    {
        this.brand=b;
        this.ram=r;
        this.price=p;
    }
    void display()
    {
        System.out.println(brand);
        System.out.println(ram);
        System.out.println(price);
    }
}
public class Oop{
    public static void main(String[] args) {
        Mobile m1=new Mobile("redmi",128,12000);
        m1.display();
    }
}*/
/*class Book{
    String title;
    int price;
    Book()
    {
        System.out.println("BOOK DONE");
    }
    Book(String t)
    {
        title=t;
        System.out.println(title);
    }
    Book(String t,int p)
    {
        title=t;
        price=p;
        System.out.println(title);
        System.out.println(price );
    }
}
public class Oop{
    public static void main(String[] args) {
        Book b1=new Book();
        Book b2=new Book("good times");
        Book b3=new Book("times of India",1240);

    }
}*/
/*class Car{
    String brand;
    int price;
    Car(String brand,int price)
    {
        this.brand=brand;
        this.price=price;
    }
    void display()
    {
        System.out.println("BRAND IS:"+brand);
        System.out.println("PRICE IS:"+price);
    }
}
public class Oop{
    public static void main(String[] args) {
        Car c1=new Car("SUZUKI",982211);
        c1.display();
    }
}*/
/*class Student{
    Student()
    {
        System.out.println("STUDENT CREATED");
    }
    Student(String name)
    {
        this();
        System.out.println("NAME IS:"+name);
    }
    Student(String name,int age)
    {
        this(name);
        System.out.println("AGE IS:"+age);
    }
}
public class Oop{
    public static void main(String[] args) {
        Student s1=new Student("RAJ",12);
    }
}*/
/*class BankAccount{
    private int balance;
    void setbalance(int b)
    {
          balance=b;
        System.out.println("BALANCE IS:"+balance);
    }
    void  getbalance() 
    {
            System.out.println("BALANCE IS:"+balance);
        
    }
}
public class Oop{
    public static void main(String[] args) {
        BankAccount b1=new BankAccount();
        b1.setbalance(5000);
        b1.getbalance();
        
    }
}*/
/*class Employee{
    private int salary;
    void setsalary(int s)
    {
        if(s<=0)
        {
            System.out.println("INSUFFICIENT BALANCE");
        }
        else
        {
            salary=s;
            System.out.println("SALARY IS:"+salary);
        }
    }
}
public class Oop{
    public static void main(String[] args) {
        Employee e1=new Employee();
        e1.setsalary(120000);
    }
}*/
/*class Student{
    private int marks;
    void setmarks(int m)
    {
        if(m<0 ||  m>100)
        {
            System.out.println("ERROR");
        }
        else
        {
            marks=m;
            System.out.println("MARKS IS:"+marks);
        }
    }
}
public class Oop{
    public static void main(String[] args) {
        Student s1=new Student();
        s1.setmarks(99);
    }
}*/
/*class Person{
    String name;
    void displayname()
    {
        System.out.println("NAME IS:"+name);
    }
}
class Student extends Person{
    int marks;
    void displaymarks()
    {
        System.out.println("MARKS IS:"+marks);
    }
}
public class Oop{
    public static void main(String[] args) {
        Student s1=new Student();
        s1.name="RAJ";
        s1.marks=98;
        s1.displayname();
        s1.displaymarks();
    }
}*/
/*class Vehicle{
    void start()
    {
        System.out.println("VEHICLE STARTED");
    }
}
class Car extends Vehicle{
    void opensunproof()
    {
        System.out.println("CAR MOVING");
    }
}
public class Oop{
    public static void main(String[] args) {
        Car c1=new Car();
        c1.opensunproof();
        c1.start();
    }
}*/
/*class Animal{
    void eat()
    {
        System.out.println("ANIMAL EATING");
    }
}
class Dog extends Animal{
    void bark()
    {
        System.out.println("BARKING");
    }
}
public class Oop{
    public static void main(String[] args) {
        Dog d1=new Dog();
        d1.bark();
        d1.eat();

    }
}*/
/*class Animal{
    void eat()
    {
        System.out.println("ANIMAL EATING");
    }
}
class Dog extends Animal{
    void bark()
    {
        System.out.println("BARKING");
    }
} 
class Puppy extends Dog{
    void weep()
    {
        System.out.println("WEEPING");
    }
}
public class Oop{
    public static void main(String[] args) {
        Puppy p1=new Puppy();
        p1.weep();
        p1.bark();
        p1.eat();
    }
}*/
/*class Person{
    String name;
    Person(String name)
    {
        this.name=name;
    }
}
class Student extends Person{
    int marks;
    Student (String name,int marks)
    {
        super(name);
        this.marks=marks;
    }
    void display()
    {
        System.out.println("NAME IS:"+name);
        System.out.println("MARKS IS:"+marks);
    }
}
public class Oop{
    public static void main(String[] args) {
        Student s1=new Student("RAJ",123);
        s1.display();
        
    }
}*/
/*class Person{
    String name;
    Person(String name)
    {
        this.name=name;
    }
}
class Student extends Person{
    String name;
    Student(String name)
    {
        super("RAM");
        this.name=name;
    } 
    void display()
    {
        System.out.println(name);
        System.out.println(super.name);
    }
}
public class Oop{
    public static void main(String[] args) {
        Student s1=new Student("RAJ");
        s1.display();

    }
}*/
/*class Person{
    String name;
    Person(String name)
    {
        this.name=name;
    }
    void display(){
        System.out.println(name);
    }
}
class Student extends Person{
    String name;
    Student(String name)
    {
        super("RAM");
        this.name=name;
    }
    void display()
    {
        super.display();
        System.out.println(name);
    }
}
public class Oop{
    public static void main(String[] args) {
        Student s1=new Student("RAJ");
        s1.display();

    }
}*/
/*abstract class Shape{
    abstract void area();
}
class Circle extends Shape{
        double radius;
        Circle(double radius)
        {
            this.radius=radius;
        }
        void area()
        {
            double area=Math.PI*radius*radius;
            System.out.println("AREA IS:"+area);
        }
}*/
//<<<<<<<<<<<<<<<<<<<<<<<<JAVA OOPS REVISION PRACTICE>>>>>>>>>>>>>>>>>>>>>>>>>>
/*class Student{
    String name;
    int age;
     void display()
    {
        System.out.println("NAME IS:"+name);
        System.out.println("AGE IS:"+age);
    }
}
public class Oop{
    public static void main(String[] args) {
        Student s1=new Student();
        Student s2=new Student();
        s1.name="RAJ";
        s1.age=15;
        s1.display();
        s2.name="RAM";
        s2.age=54;
        s2.display();
    }
}*/
/*class Mobile{
    String brand;
    int  model;
    int price;
    void displaydetails()
    {
        System.out.println("BRAND IS:"+brand);
        System.out.println("MODEL IS:"+model);
        System.out.println("PRICE IS:"+price);
    }
}
public class Oop{
    public static void main(String[] args) {
        Mobile m1=new Mobile();
        m1.brand="APPLE";
        m1.model=2016;
        m1.price=12000;
        m1.displaydetails();
        Mobile m2=new Mobile();
        m2.brand="SAMSUNG";
        m2.model=2032;
        m2.price=190000;
        m2.displaydetails();    
    }
}*/
/*class BankAccount{
    long accountno;
    String accountholdername;
    int balance;
    void deposit(int amount)
    {
     balance=balance+amount;
     System.out.println("NEW BALANCE IS:"+balance);
    }
    void withdraw(int amount)
    {
        balance=balance-amount;
        System.out.println("NEW BALANCE IS:"+balance);
    }
    void displaybalance()
    {
        System.out.println("BALANCE IS:"+balance);
    }
}
public class Oop{
    public static void main(String[] args) {
        BankAccount b1=new BankAccount();
        b1.accountno=1234567;
        b1.accountholdername="RAJ";
        b1.balance=120000;
        b1.deposit(12000);
        b1.withdraw(12000);
        b1.displaybalance();    
    }
}*/
/*class Employee{
    String name;
    int salary;
    Employee()
    {
        System.out.println("OBJECT CREATED");
    }
}
public class Oop{
    public static void main(String[] args) {
        Employee e1=new Employee();
    }
}*/
/*class Laptop{
    String brand;
    int ram;
    Laptop()
    {
    }
    void display()
    {
        System.out.println("BRAND IS:"+brand);
        System.out.println("RAM IS:"+ram);
    }
}
public class Oop{
    public static void main(String[] args) {
        Laptop l1=new Laptop();
        l1.brand="DELL";
        l1.ram=12;
        l1.display();
    }
}*/
/*class Book{
    String title;
    String author;
    int price;
    Book (String t,String a,int p)
    {
        title=t;
        author=a;
        price=p;
    }
    void display()
    {
        System.out.println("TTILE IS:"+title);
        System.out.println("AUTHOR IS:"+author);
        System.out.println("PRICE IS:"+price);
    }
}
public class Oop{
    public static void main(String[] args) {
        Book b1=new Book("GOOD TIMES","SUDHA MURTHY",1200);
        b1.display();
    }
}*/
/*class Employee{
    String name;
    int salary;
    Employee(String n,int s)
    {
        name=n;
        salary=s;
    }
    void display()
    {
        System.out.println(name);
        System.out.println(salary);
    }
}
public class Oop{
    public static void main(String[] args) {
        Employee e1=new Employee("RAJ",120000);
        Employee e2=new Employee("RAM",10000);
        Employee e3=new Employee("RAJU",190000);
        e1.display();
        e2.display();
        e3.display();

    }
}*/
/*class Car{
    String brand;
    int price;
    int  model;
    Car(String b,int p,int  m)
    {
        brand=b;
        price=p;
        model=m;
    }
    void display()
    {
        System.out.println(brand);
        System.out.println(price);
        System.out.println(model);
    }
}
public class Oop{
    public static void main(String[] args) {
        Car c1=new Car("SUZUKI",12000,2016);
        Car c2=new Car("SWIFT",120000,2020);
        Car c3=new Car("MARUTHI",23000,2116);
        Car c4=new Car("ACCESS",190000,1016);
        c1.display();
        c2.display();
        c3.display();
        c4.display();
    }
}*/
/*class Book{
    String title;
    String author;
    int price;
    Book()
    {
        System.out.println("DEFAULT CONSTRUCTOR");
    }
    Book(String t)
    {
        title=t;
    }
    Book(String t,String a)
    {
        title=t;
        author=a;
    }
    Book(String t,String a,int p)
    {
        title=t;
        author=a;
        price=p;
    }
    void display()
    {
        System.out.println("TITLE IS:"+title);
        System.out.println("AUTHOR IS:"+author);
        System.out.println("PRICE IS:"+price);
    }
}
public class Oop{
    public static void main(String[] args) {
        Book b1=new Book();
        Book b2=new Book("GOOD TIMES");
        Book b3=new Book("GOOD DEEDS","SUDHA MURTHY");
        Book b4=new Book("GOOD DAYS","NARAYAN MURTHY",1200);
        b1.display();
        b2.display();;
        b3.display();
        b4.display();

    }
}*/
/*class Mobiles{
    String brand;
    int price;
    int model;
    Mobiles()
    {
        System.out.println("DEFAULT CONSTRUCTOR");
    }
    Mobiles(String b)
    {
         brand=b;
    }
    Mobiles(String b,int p)
    {
        brand=b;
        price=p;
    }
    Mobiles(String b,int p,int m)
    {
         brand=b;
        price=p;
        model=m;
    }
    void display()
    {
        System.out.println(brand);
        System.out.println(price);
        System.out.println(model);
    }
}
public class Oop{
    public static void main(String[] args) {
        Mobiles m1=new Mobiles();
        Mobiles m2=new Mobiles("APPLE");
        Mobiles m3=new Mobiles("SAMSUNG",23000);
        Mobiles m4=new Mobiles("REDMI",19000,2020);
        m1.display();
        m2.display();
        m3.display();
        m4.display();
    }
}*/
/*class Employee{
    private String name;
    private int salary;
    void setname(String n)
    {
        name=n;
    }
    void setsalary(int s)
    {
        salary=s;
    }
    String getname()
    {
        return name;
    }
    int getsalary()
    {
        return salary;
    }
}
public class Oop{
    public static void main(String[] args) {
        Employee e1=new Employee();
        e1.setname("RAJ");
        e1.setsalary(40000);
        System.out.println(e1.getname());
        System.out.println(e1.getsalary());
    }
}*/
/*class BankAccount{
    private int balance;
    void setbalance(int b)
    {
        if(b<0)
        {
            System.out.println("INVALID BALANCE");
        }
        else
        {
          balance+=b;
        }
    }
    int getbalance()
    {
        return balance;
    }
}
public class Oop{
    public static void main(String[] args) {
        BankAccount b1=new BankAccount();
        b1.setbalance(-1000);
        System.out.println("BALANCE IS:"+b1.getbalance());
    }
}*/
/*class Vehicle{
    String brand;
    int price;
     void displayVehicle()
    {
        System.out.println("VEHICLE CREATED ");
    }
}
class Car extends Vehicle{
    int model;
    void displayCar()
    {
        System.out.println("CAR CREATED ");
    }
}
public class Oop{
    public static void main(String[] args) {
        Car c1=new Car();
        c1.brand="SUZUKI";
        c1.price=1000000;
        c1.model=2016;
        System.out.println(c1.brand);
        System.out.println(c1.price);
        System.out.println(c1.model);
        c1.displayCar();
        c1.displayVehicle();
    }
}*/
/*class Person{
    String name;
    int age;
    void displayperson()
    {
        System.out.println("PERSON CREATED");
    }
}
class Student extends Person{
    int roll;
    String branch;
    void displaystudent()
    {
        System.out.println("STUDENT CREATED");
    }
}
public class Oop{
    public static void main(String[] args) {
        Student s1=new Student();
        Student s2=new Student();
        s1.name="raj";
        s1.age=12;
        s1.roll=40;
        s1.branch="CSE";
        s2.name="ram";
        s2.age=16;
        s2.roll=44;
        s2.branch="ECE";
        System.out.println(s1.name);
        System.out.println(s1.age);
        System.out.println(s1.roll);
        System.out.println(s1.branch);
        System.out.println(s2.name);
        System.out.println(s2.age);
        System.out.println(s2.roll);
        System.out.println(s2.branch);
        s1.displayperson();
        s1.displaystudent();
        s2.displayperson();
        s2.displaystudent();


    
}}*/
/*class Animal {

    void eat() {
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal {

    void eat() {
        System.out.println("Dog is eating");
    }
    void display()
    {
        super.eat();

    }
}
public class Oop{
    public static void main(String[] args) {
        Dog d1=new Dog();
        d1.eat();
        d1.display();
        

    }
}*/
/*class  Vehicle{
    void start()
    {
        System.out.println("VEHICLE STARTED");
    }
}
class Car extends Vehicle{
    void start()
    {
        super.start();
        System.out.println("CAR STARTED");
    }

}
public class Oop{
    public static void main(String[] args) {
        Car c1=new Car();
        c1.start();
    }
}*/  
/*class Book{
    String title;
    Book()
    {
        System.out.println("BOOK DONE....");
    }
    Book(String title)
    {
        this.title=title;
        System.out.println(title);
    }
}
public class Oop{
    public static void main(String[] args) {
        Book b1=new Book();
        Book b2=new Book("HAPPY");
    }
}*/
/*class BankAccount{
    private  int balance=1000;
     void deposit(int a)
     {
          balance+=a;
     }
     void withdraw(int m)
     {
        if(m<00)
        {
           System.out.println("INSUFFICIENT BALANCE")
        }
           else
           {
            balance=balance-m;
            }
     }
     int  getbalance()
     {
        return balance;
     }
}
public class Oop{
    public static void main(String[] args) {
        BankAccount b1=new BankAccount();
        b1.deposit(10000);
        b1.withdraw(1000);
        System.out.println(b1.getbalance());
    }
}*/
/*class Person{
    int age;
    String name;
}
class Student extends Person{
    int roll;
}
public class Oop{
    public static void main(String[] args) {
        Student s1=new Student();
        s1.age=12;
        s1.name="raj";
        s1.roll=11;
        System.out.println(s1.age);
        System.out.println(s1.name);
        System.out.println(s1.roll);

    }
}*/
/*class Animal{
    void sound()
    {
        System.out.println("ANIMAL SOUND");
    }
}
class Dog extends Animal{
    void sound()
    {
        System.out.println("DOG SOUND");
    }
}
public class Oop{
    public static void main(String[] args) {
        Animal a1=new Dog();
        a1.sound();
    }
}*/
/*class Animal{
    void sound()
    {
        System.out.println("ANIMAL SOUND");
    }
}
class Dog extends Animal{
    void sound()
    {
        System.out.println("DOG SOUND");
    }
}
class Cat extends Animal{
    void sound()
    {
        System.out.println("CAT SOUND ");
    }
}
public class Oop{
    public static void main(String[] args) {
        Animal a=new Animal();
        a.sound();
        a=new Dog();
        a.sound();
        a=new Cat();
        a.sound();
    }
}*/
// ACCESS MODIFIERS
/*class Employee{
        private int salary = 10000;
        int age = 20;
        protected String department = "CSE";
        public String name = "Raj";
    
}
public class Oop{
    public static void main(String[] args) {
        Employee e1 = new Employee();
        System.out.println(e1.name);
        System.out.println(e1.age);
        System.out.println(e1.department);
        System.out.println(e1.salary);
    }
}*/
// INHERITANCE
/*class Person  {   
           String name;
           int age;
        void displayPerson()
         {
           System.out.println(name);
           System.out.println(age);
         }

    }
    class Student extends Person{
        int rollno;
        void displayStudent()
        {
            System.out.println(rollno);
        }
    }
    public class Oop{
        public static void main(String[] args) {
            Student s1=new Student();
            s1.name="RAJ";
            s1.age=19;
            s1.rollno=12;
            s1.displayPerson();
            s1.displayStudent();
    
    }
}*/
 //INHERITANCE WITH ENCAPSULATION
/*class Person  {   
          private String name;
          private int age;
        void displayPerson()
         {
           System.out.println(name);
           System.out.println(age);
         }

    }
    class Student extends Person{
        int rollno;
        void displayStudent()
        {
            System.out.println(rollno);
        }
    }
    public class Oop{
        public static void main(String[] args) {
            Student s1=new Student();
            s1.name="RAJ";
            s1.age=19;
            s1.rollno=12;
            s1.displayPerson();
            s1.displayStudent();
    
    }
}*/
/*  In This code,the name and int are marked private as private members are accessed only within the same class and not outside it so the code will give error as we are trying to access the private members of the class Person in the main method of the class Oop. To fix this issue, we can use public getter and setter methods in the Person class to access and modify the private members. Here's the corrected code:
*/
// INHERITANCE WITH ENCAPSULATION CORRECT VERSION WITH GETTERS AND SETTERS
/*class Person{
    private String name;
    private int age;
    void setname(String name)
    {
        this.name=name;
    }
    void setage(int age)
    {
        this.age=age;
    }
    String getname()
    {
        return name;
    }
    int getage()
    {
        return age;
    }

}
class Student extends Person{
    void displayStudent()
    {
        System.out.println(getname());
        System.out.println(getage());
    }
}
public class Oop{
    public static void main(String[] args) {
        Student s1=new Student();
        s1.setname("RAJ");
        s1.setage(15);
        s1.getname();
        s1.getage();
        s1.displayStudent();
    }
}*/
// INHERITANCE WITH PROTECTED
/*class Person{
    protected String name;
}
class Student extends Person{
    void display()
    {
        System.out.println(name);
    }
}
public class Oop{
    public static void main(String[] args) {
        Student s1=new Student();
        s1.name="RAJ";
        s1.display();
    }
}*/
// SINGLE INHERITANCE
/*class Vehicle{
    String brnad;
    void start()
    {
        System.out.println("Vehicle Starting");
    }
}
class Car extends Vehicle{
    int speed;
    void displaySpeed()
    {
        System.out.println("Car speed");
    }
}
public class Oop{
    public static void main(String[] args) {
        Car c1=new Car();
        c1.start();
        c1.displaySpeed();
    }
}*/
// MULTILEVEL INHERITANCE
/*class Vehicle{
    String brand;
    void start()
    {
        System.out.println("Vehicle Starting");
    }
}
class Car extends Vehicle{
    int speed;
    void drive()
    {
        System.out.println("Car Starting");
    }
}
class SportsCar extends Car{
    boolean  turbo;
    void boost()
    {
        System.out.println("SportsCar Starting");
    }
}
public class Oop{
    public static void main(String[] args) {
        SportsCar s1=new SportsCar();
        s1.brand="SUZUKI";
        s1.start();
        s1.speed=150;
        s1.drive();
        s1.turbo=false;
        s1.boost();
    }
}*/
// HEIRARCHIAL INHERITANCE
/*class Animal{
    String name;
    void eat()
    {
        System.out.println("Animal eating");
    }
}
class Dog extends Animal{
    void bark()
    {
        System.out.println("Dog barking");
    }
}
class Cat extends Animal{
    void meow()
    {
        System.out.println("Cat sound ");
    }
}
public class Oop{
    public static void main(String[] args) {
        Cat c1=new Cat();
        c1.meow();
        c1.eat();
        c1.name="Shadow";
        Dog d1=new Dog();
        d1.bark();
        d1.name="Rocky";

    }
} */
 /*MULTIPLE INHERITANCE isnot executed by java  because  when we see:
 class A{
void show()
{
System.out.println("A");
}
}
class B
{ 
void show()
{
System.out.println("B");
}
}
IN MAIN
c obj=new C();
c.show() 
means compiler doesnot know which show to execute ie whether A's or B's 
 */
//METHOD OVERRIDING
/*class Animal{
    void sound()
    {
        System.out.println("Animal makes a Sound");
    }
}
class Dog extends Animal{
    void sound()
    {
        System.out.println("Dog Barks");
    }
}
public class Oop{
    public static void main(String[] args) {
        Dog d1=new Dog();
        d1.sound();
    }
}*/
// USING @Override 
/*class Animal{
    void sound()
    {
        System.out.println("Animal Sound");
    }
}
class Dog extends Animal{
    @Override
    void sound()
    {
        System.out.println("Dog Sound");
    }
}
public class Oop{
    public static void main(String[] args) {
        Dog d1=new Dog();
        d1.sound();

    }
}*/
// ACCESSING PARENT CLASS METHODS
/*class Animal{
    void sound()
    {
        System.out.println("ANIMAL SOUND");
    }
}
class Dog extends Animal{
    void sound()
    {   super.sound();
        System.out.println("DOG SOUND");
    }
}
public class Oop{
    public static void main(String[] args) {
        Dog d1=new Dog();
        d1.sound();
       
    }
}*/
// ACCESSING PARENT CLASS VARIABLES
/*class Person{
    String name="RAJ";
}
class Student extends Person{
    String name="RAM";
    void show()
    {
        System.out.println(name);
        System.out.println(super.name);
    }
}
public class Oop{
    public static void main(String[]args)    
    {
        Student s1=new Student();
        s1.show();
    }
}*/
// ACCESSING CONSTRUCTOR VIA SUPER KEYWORD
/*class Vehicle{
    Vehicle()
    {
        System.out.println("VEHICLE CREATED");
    }
}
class Bike  extends  Vehicle{
    Bike()
    {
        super();
        System.out.println("BIKE CREATED");
    }
}
public class Oop{
    public static void main(String[] args) {
        Bike b1=new Bike();
    }   
}*/
// 
/*class Person {
    String name = "Person";

    void show() {
        System.out.println("I am a Person");
    }
}

class Student extends Person {
    String name = "Student";

    @Override
    void show() {
        System.out.println("I am a Student");
    }

    void display() {
        
        System.out.println(name);
        System.out.println(super.name);
        show();
        super.show();
    }
}
public class Oop{
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.display();
    }   
}*/
// CONSTRUCTOR EXECUTION ORDER
/*class A{
    A()
    {
        System.out.println("A CREATED");
    }
}
class B extends A{
    B()
    {
        System.out.println("B CREATED");
    }
}
class C extends B{
    C()
    {
        System.out.println("C CREATED");
    }
}
public class Oop
{
    public static void main(String[] args) {
        C obj=new C();

    }
}*/
// the  constructor execution order is tht first parent constructor is executed bcoz when we call C()  java automatically creates a super() constructor
//  inside C tht will call B() so B() does the same thing and calls A() so first A () is executed then B() and then C() is executed
//but this works only when a() has no argument constructor if it has thn it has to be called by creating object itself
// PROTECTED ACCESS MODIFIER-will allow child class to access the parent class members but not outside the package
/*class Person{
    protected int age=19;
}
class Student extends Person{
    void display()
    {
        System.out.println(age);
    }
}
public class Oop{
    public static void main(String[] args) {
        Student s1=new Student();
        s1.display();
    }
}*/
// UPCASTING
/*class Animal{
    Animal()
    {
        System.out.println("Animal");
    }
    void sound()
    {
        System.out.println("Animal Sound");
    }
}
class Dog extends Animal{
    Dog()
    {
        System.out.println("Dog");
    }
    void bark()
    {
        System.out.println("Dog Sound");
    }
}
public class Oop{
    
    public static void main(String[] args) {
        Dog d1=new Dog();
        Animal a1=new Dog();
        a1.sound();
        d1.sound();// this works bcoz child class object can access parent class methods but not vice versa
       d1.bark();
        //a1.bark();// this will give error as a1 is of type Animal and Animal class doesnot have bark() method so we cannot call it using a1 reference
}
}*/
// Animal a holds the reference of Dog class object and this is called upcasting as we are converting a child class object into parent class reference
// DOWNCASTING
/*class Animal{
    void sound()
    {
        System.out.println("Animal Sound");
    }
}
class Dog extends Animal{
    void bark()
    {
        System.out.println("Dog Sound");
    }
}
public class Oop{
    public static void main(String[] args) {
        Animal a1=new Dog();
        a1.sound();
        Dog d1=(Dog)a1;
        d1.bark();
        a1.sound();
       // a1.bark();// this will give error as a1 is of type Animal and Animal class doesnot have bark() method so we cannot call it using a1 reference
    }
}*/
// FINAL 
class Parent {
    final int x = 10;

    final void show() {
        System.out.println("Parent show");
    }
}

class Child extends Parent {
    void display() {
        System.out.println(x);
        show();
    }
}

public class Oop {
    public static void main(String[] args) {
        Child c = new Child();
        c.display();
    }
}





















