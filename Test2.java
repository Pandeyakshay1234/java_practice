class Animal {
    
}
class Monkey extends Animal
{

}
class Test2
{
    public static  void m1(Animal a) {
        System.out.println("Animal version");
    }
    public static  void m1(Monkey m)
    {
        System.out.println("Monkey version");
    }

    public static void main(String[] args) {
        Test2 t = new Test2();
         Animal a = new Animal();
           t.m1(a);
        Monkey m = new Monkey();
        t.m1(m);
        t.m1(a);
        
        Animal a1 = new Monkey();
        t.m1(a1);

    }
}

