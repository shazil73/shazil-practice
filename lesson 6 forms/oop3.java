class Student{
    String name;
    int age;
    int id;
    public Student(String name, int age, int id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }
    public void display(){
        System.out.println("Name: " + name + ", Age: " + age + ", ID: " + id);
    }
}
public class oop3 {
    public static void main(String[] args) {
       Student s1= new Student("kaif",20,10);
       Student s2= new Student("ahmed",21,11);
       s1.display();
       s2.display();
    }
    
}
