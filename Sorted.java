public class Sorted{
 
 public static void main(String args[]){
  int arr[]={2,4,8,1,12,25};
  boolean sorted=true;

  for(int i=0;i<arr.length-1;i++){
    if(arr[i]>arr[i+1]){
       sorted=false;
       i++;
    }
  }
  if(sorted){
  System.out.println("sorted");
  }else{
    System.out.println("not sorted");
  }
 }
}