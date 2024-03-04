class mergeTwosortArray{

  public static int[] mtsa(int[] arr1, int[] arr2)
  {
    int m = arr1.length;
    int n= arr2.length;
    int [] arr3 = new int[m+n];
    int k=0;
    int i=0;
    int j=0;
    while( i<arr1.length && j<arr2.length){
    if(arr1[i]<arr2[j])
    {
        arr3[k] = arr1[i];
        i++;
        k++;
    }
    else 
    {
        arr3[k]= arr2[j];
        j++;
        k++;
    }
}
  while(i<arr1.length){
  
    arr3[k]=arr1[i];
    i++;
    k++;
  }
  while(j<arr1.length){
  
    arr3[k]=arr1[j];
    j++;
    k++;
  }
  return arr3;
  }
  public static void main(String[] args) {
    int [] arr1 = {20,30,40,50,60};
    int [] arr2 = {5,50,60,70,80,90};
    System.out.println("hello");
    int [] res =  mtsa(arr1, arr2);
     
    for(int i=0;i<res.length;i++)
    {
        System.out.println(res[i]);
    }
  }
}