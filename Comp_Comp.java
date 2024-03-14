import java.util.*;
class Employee implements Comparable
{
   String Name;
   int eid;
   Employee(String Name , int eid)
   {
      this.Name = Name;
      this.eid = eid; 
   }
   public String toString()
   {
    return Name+""+eid;
   }
   public int compareTo(Object obj)
    {
       int eid1 = this.eid;
       
        Employee e = (Employee)obj;
        int eid2 = e.eid;
     
        if(eid1<eid2)
        {
            return -1;
        }
        else if(eid1>eid2)
        {
            return 1;
        }
        else return 0;     
    }
} 
public class Comp_Comp {
    public static void main(String[] args) 
    {
        Employee e1 = new Employee("Nag", 100);
        Employee e2 = new Employee("Balaich", 200);
        Employee e3 = new Employee("chiru", 50);
        Employee e4 = new Employee("venki", 150);
        Employee e5 = new Employee("Nag", 100);

        TreeSet t1  = new TreeSet();
        t1.add(e1);
        t1.add(e2);
        t1.add(e3);
        t1.add(e4);
        t1.add(e5);
        
        System.out.println(t1);

        TreeSet t2  = new TreeSet( new MyComparator());
        t2.add(e1);
        t2.add(e2);
        t2.add(e3);
        t2.add(e4);
        t2.add(e5);
        
        System.out.println(t2);


    }
}
   class MyComparator implements Comparator
   {
    public int compare(Object obj1 , Object obj2)
      {
       Employee e1 = (Employee) obj1;
       Employee e2 = (Employee) obj2;
       String s1 = (e1.Name).toLowerCase();
       String s2 = (e2.Name).toLowerCase();

        return s1.compareTo(s2);
      }
   }
