import java.util.Scanner;
public class grade{
    public static void main(String [] args){
                
     System.out.println("enter first second third fourth fifth subject no" + "press                                                                                 enter after one input");
      System.out.println("enter s1 subject no");
      Scanner sc=new Scanner(System.in);
      int s1=sc.nextInt();
      System.out.println("enter s2 subject no");
      int s2=sc.nextInt();
      System.out.println("enter s3 subject no");
      int s3= sc.nextInt();
      System.out.println("enter s4 subject no");
      int s4=sc.nextInt();
      System.out.println("enter s5 subject no");
      int s5=sc.nextInt();
      System.out.println("nombers are" + s1+" "+" " + s2+" " +" "+ s3+" "+ " " + s4+" " + s5	);
      int sum = s1+s2+s3+s4+s5;
      float grade = sum*100/500;
       System.out.println("garde are"+ grade);
       System.out.println("total marks are"+sum);


      //System.out.println("enter second subject no");
      //int second_no = sc.nextInt();
     //System.out.println("enter third subject no");
     //int third_no = sc.nextInt();
     //System.out.println("enter fourth subject no");
    //int fourth_no = sc.nextInt();
    //System.out.println("enter four subject no");
    //int forth_no =  sc.nextInt();
      //System.out.println("enter fifth subject no");
    //int fifth_no = sc.nextInt();
   //int sum= first_no + second_no + third_no + forth_no+ fifth_no;
   //System.out.println(""sum is" +" "+ sum);
}
}