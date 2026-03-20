public class Fractionques {
public static class Fraction{
    int num;
    int den;
     Fraction(int num,int den){
        this.num=num;
        this.den=den;
        simplify();
     }



    void simplify() {
      boolean isNegative=(num*den<0)?true:false;// mana number negative bna to isNegative ki value true hui fir if(isNegative) bhi true hua to numerator = -numerator hojae ye isliye kiya kyuki denominator mein negative sign not good so take it to the numerator
      num=Math.abs(num);
      den=Math.abs(den); 
      int gcd=hcf(num,den);
        num=num/gcd;
        den=den/gcd;
        if(isNegative)num = -num;
    }
    int hcf(int a,int b){
  if(a==0)return b;
  return hcf(b%a,a);
    }



    void print(){
        System.out.println(num+"/"+den);
        
    }



     void add(Fractionques.Fraction f1) {
       num=num * f1.den + den* f1.num;
       den=den*f1.den;
       simplify();
    }



    void multiply(Fractionques.Fraction f1) {
       num=num*f1.num;
       den=den*f1.den;
       simplify();
     }
   
    
    }
    public static void main(String[] args) {
       Fraction f=new Fraction(-27,3);
       Fraction f1=new Fraction(7,-3);
       f.print(); 
     
       f.add(f1);  //f mein f1 add krna hai
       f.print();
       f.multiply(f1);
       f.print();


    }
}
