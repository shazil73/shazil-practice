class Car{

    Car(String toyota, int par) {
    }
    String Brand;
    int year;
    public void display(){
        System.out.println("Brand: " + Brand + ", Year: " + year);
    }
}
class oop2{
    public static void main(String[] args) {
        Car car1 = new Car("toyota", 2020);
        car1.display();
    }
}