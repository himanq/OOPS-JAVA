public class Polymorphism {
    public static class Dog {
    void speak(){
        System.out.println("bhau bhau");
    }
}
    public static class Cat {
    void speak(){
        System.out.println("meaw meaw");
    }
        
    }
    public static void main(String[] args) {
        Dog d=new Dog();
        Cat c=new Cat();
        d.speak();
        c.speak();

        
    }
}
