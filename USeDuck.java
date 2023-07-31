class  Duck{

     int Size;
public Duck(int Ducksize){

   System.out.println("quieck");
   Size=Ducksize;
   System.out.println("size"+ Size);
}
}
public class USeDuck{

   public static void main(String[] args){

    Duck d= new Duck(42);

}

}