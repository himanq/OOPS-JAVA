public class MethodsInClass {
   public static class Students{
    int rno;
    String name;
    double model;
    void print(){
        System.out.print(rno+" "+name+" "+model);
    }
    }
    public static void main(String[] args) {
    Students s2=new Students();
        s2.model=323.4;
        s2.rno=21;
        s2.name="KIA";
        s2.print();
        
    }
}
