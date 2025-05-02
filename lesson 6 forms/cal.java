class ALL{
    int a;
    int b;
    public int foradd(int a, int b){
        return a + b;
}
    public int forsub(int a, int b){
        return a - b;
    }
    public int formul(int a, int b){
        return a * b;
    }
    public int fordiv(int a, int b){
        return a / b;
    }
}
class CAL{
    public static void main(String args[]){
        ALL obj = new ALL();
        int a = 10;
        int b = 5;
        System.out.println("Addition: " + obj.foradd(a, b));
        System.out.println("Subtraction: " + obj.foradd(a, b));
        System.out.println("Multiplication: " + obj.formul(a, b));
        System.out.println("Division: " + obj.fordiv(a, b));
    }
}
