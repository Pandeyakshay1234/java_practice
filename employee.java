import java.security.Timestamp;
import java.util.List;
import java.util.*;
  public class employee
{
  String name;
  List<shifts> shift;
  String Position_status;
}
shifts
{
   start date;
   end date;
}
//for conscative 7 day 

List<employee> emp = new employee<>()
  shift = new shift

for( List <employee> emps : emp)
{  int count=1;
    for(int i =0; i<shifts.size() ;i++
{
    int n = shift.enddate() - shift.startdate();

   // it gives output in miliseconds so first convert milisecond to days and return n as a day and check
    if(n==1)
{
    count++
}
 else  continue;

}

  if(count ==7)
{
   print(emp.name);
   print(emp.Position_status)
   
}
} 
// for duration 

same logic will be there differece is that convert milisecond to hours and check
if(duration> 1 && duration <=10)
{
 print (emp.name)
 print(emp.Position_status)
}





   
 

