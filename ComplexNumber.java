public class ComplexNumber {
 public static class Complex {
int x;
int y;
void print(){
   if(y>=0) System.out.println(x+"+i"+y);
   else System.out.println(x+"-i"+(-y));
}
Complex(int x,int y){
    this.x=x;
    this.y=y;
}
Complex(){}
 void add(ComplexNumber.Complex z1) {
    x+=z1.x;
    y+=z1.y;
}
  void multiply(ComplexNumber.Complex z1) {
   x=x*z1.x+y*z1.y;
   y=x*z1.y+y*z1.x;

 }

}
    public static void main(String[] args) {
        Complex z=new Complex(2,1);
         Complex z1=new Complex(2,3);
        // z.print();
        // z.add(z1);
        // z.print();
        z.multiply(z1);
        z.print();
    }
}
