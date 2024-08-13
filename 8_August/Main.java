class Student{
    int id;
    String name;
    int marks;

    void add_info(int id,String name,int marks){
        this.id=id;
        this.name=name;
        this.marks=marks;
    }
    void display(){
        System.out.println("Student Id : "+id);
        System.out.println("Student name : "+name);
        System.out.println("Student marks : "+marks);
    }
}
public class Main{
    public static void main(String []args){
        Student S1 = new Student();
        Student S2 = new Student();

        S1.add_info(24,"Gaurang",100);
        S2.add_info(24,"Chaitanya",100);

        S1.display();
        S2.display();

    }
}