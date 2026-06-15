public class ReverseArray{
    public static void main(String args[]){

        int arr[]={5, 8, 2, 10, 3};
        int i=0;
        int j=arr.length-1;

        while(i<j){
          int temp=arr[i];
          arr[i]=arr[j];
          arr[j]=temp;
          
          i++;
          j--;
        }

        for(int nums:arr){
          System.out.println(nums);
        }
        
    }
}