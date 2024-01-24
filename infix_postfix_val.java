import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.*;
public class infix_postfix_val {
   public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String st = br.readLine();
   // System.out.println(st);
    Stack<Integer> vs = new Stack<>();
    Stack<String> is = new Stack<>();
    Stack<String> ps = new Stack<>();

   //  for(int i= st.length()-1; i>=0;i--)
   //  {  char ch = st.charAt(i);
   //    if(ch!='-'|| ch!='*' || ch!='/' || ch!='+')
   //    {
   //     vs.push(ch -'0');
   //     is.push(ch + "");
   //     ps.push(ch+ "");
       
   //    }
   //    System.out.print(vs.pop());
   //     System.out.print(is.pop());
   //     System.out.print(ps.pop());
   
     
    //}
   // for(int i = 0; i<st.length();i++)
   //  { 
   //     vs.push(ch -'0');
   //     is.push(ch + "");
   //     ps.push(ch+"");
      
   
     
   //  }
        for (int i = 0; i < st.length(); i++) {
         char ch = st.charAt(i);
         if (ch == '-' || ch == '*' || ch == '/' || ch == '+') {
             if (vs.size()>=2) {
                 int v2 = vs.pop();
                 int v1 = vs.pop();
                 int val = Operation(v1, v2, ch);
                   vs.push(val);
             }
                 if (vs.size()>=2) {
                     String inv2 = is.pop();
                     String inv1 = is.pop();
                     String inv = "(" + inv1 + ch + inv2 + ")";
                     is.push(inv);
                 }

                 if (vs.size()>=2) {
                     String pv2 = ps.pop();
                     String pv1 = ps.pop();
                     String pv = pv1 + pv2 + ch;
                     ps.push(pv);
                 }
             
         } else {
             vs.push(ch - '0');
             is.push(ch + "");
             ps.push(ch + "");
         }
     }

     System.out.println(vs.pop());
     System.out.println(is.pop());
     System.out.println(ps.pop());
 }
   //       if(vs.size()>=2 && is.size()>=2 && ps.size()>=2){
   //         int v1 = vs.pop();
   //         int v2 = vs.pop();
   //         int val = Operation(v1,v2,ch);
   //         vs.push(val);

            
   //         String inv1 = is.pop();
   //         String inv2 = is.pop();
   //         String inv = "(" + inv1 + ch + inv2+")";

   //         is.push(inv);
   //         String pv1 = is.pop();
   //         String pv2 = is.pop();
   //         String pv = pv1 + pv2 + ch; 
   //         ps.push(pv);
   //      } 
   //    }
   //      else
   //      {
   //          vs.push(ch -'0');
   //          is.push(ch + "");
   //          ps.push(ch +"");

   //      }
   //   }

   //   System.out.println(vs.pop());
   //   System.out.println(is.pop());
   //   System.out.println(ps.pop());
   // } 

   public static int Operation(int v1, int v2 ,char ch)
   {  
       if(ch=='+')
       {
         return  v1+v2;
       }
       else if(ch=='*')
       {
        return v1*v2;
       }
       else if(ch=='-')
       {
        return v1-v2;
       }
       else
       {

        return   v1/v2;
    //     try{
    //         return v1/v2;
    //     }
    //     catch (ArithmeticException e)
    //     {
    //        e.printStackTrace();
    //     }
       }
      

   }
}
