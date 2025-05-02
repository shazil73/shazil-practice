class Animal{
    public void makesound(){
        System.out.println("Animal makes sound");
    }
}
class Dog extends Animal{
    @Override
    public void makesound(){
        System.out.println("Dog barks");
    }
}
class Cat extends Animal{
    @Override
    public void makesound(){
        System.out.println("Cat meows");
    }
}
class oop6{
    public static void main(String[] args) {
        Animal a = new Animal();
        Dog d = new Dog();
        Cat c = new Cat();
        a.makesound();
        d.makesound();
        c.makesound();
    }
}