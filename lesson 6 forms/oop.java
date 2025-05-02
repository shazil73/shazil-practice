class Abc{
    public String name;
    public int age;
}
class oop{
    public static void main(String[] args) {
        Abc obj = new Abc();
        obj.name = "John";
        obj.age = 30;
       System.out.println("my name is " + obj.name + " and my age is " + obj.age);
    }
}