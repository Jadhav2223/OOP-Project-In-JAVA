class  calculator {
    int add(int a, int b){
        return a+b;
    }
    int add(int a, int b , int c){
        return a+ b+ c;
    }
    double add(double a, double b){
        return a+b;
    }
}
 class Student {  
    String name;
    int age;
    Student(){
    name = "unknow";
    age = 0;
    }
    Student (String n, int a){
        name = n;
        age =a;
    }

    Student(Student s){
        this.name = s.name;
        this.age = s.age;

    }
    void display(){
        System.out.println("name : " + name + ", Age : " + age);
    }
    Student getStudent(){
        return this;
    }
     
}

public class functionDemo {
    public static void main(String[] agrs){

        calculator calc = new calculator();

        System.out.println("Add twp integer : " + calc.add(5, 10));
        System.out.println("Add three integer : " + calc.add(5, 10, 15));
        System.out.println("Add twp Double : " + calc.add(5.5, 4.8));

        Student s1 = new Student();
        Student s2 = new Student("Jadhav", 19);
        Student s3 = new Student(s2);

        s1.display();
        s2.display();
        s3.display();

        Student s4 = s2.getStudent();
        System.out.println("Student S4 details (reference to S2): ");
        s4.display();
    }
}