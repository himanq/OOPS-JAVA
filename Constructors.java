public class Constructors {
    public static class Car {
    int seats;
    String name;

    Car(int x,String s){//Parametrised constructor
     seats=x;
     name=s;
    }
    void print(){
        System.out.println(seats+" "+name+" ");
    }
} 
    public static void main(String[] args) {
        Car c=new Car(5,"kia sonet");
      c.print();

    }
}
