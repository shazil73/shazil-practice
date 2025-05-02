class shape{
    public int area(int l, int b){
        return l*b;
    }
}
class rectangle extends shape{

   public int b;
    public  int l;
    public rectangle(int l, int b) {
        this.l = l;
        this.b = b;
    }

    @Override
    public int area(int l, int b){
        return l * b;
    }
}
class circle extends shape{
    public int radius;

    public circle(int r) {
        this.radius = r;
    }

    public double area(int r){
        return 3.14 * r * r;
    }
}
class oop5{
    public static void main(String[] args) {
        rectangle r = new rectangle(5, 10);
        circle c = new circle(7);
        System.out.println("Area of rectangle: " + r.area(5, 10));
        System.out.println("Area of circle: " + c.area(7));
    }
}