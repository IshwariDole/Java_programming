public class MissingNumber {

    public static void main(String args[]){
        int arr[]={1, 2, 3, 5, 6};
        int n=arr.length+1;
        int array_sum=0;
        int  expectedSum=(n*(n+1)/2);

        for(int i=0;i<arr.length;i++){
            array_sum +=arr[i];
            
        }
         int missing = expectedSum - array_sum;

        System.out.print(missing);
    }
}