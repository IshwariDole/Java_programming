public class BinarySearch {

    public int binarySearch(int arr[], int key){
        int low=0;
        int high=arr.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==key){
                return mid; 
            }
           else if(arr[mid]<key){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
           }
        return -1;
     }
    public static void main(String args[]){
        int arr[]={10,20,30,40,50};
        int key=40;
        System.out.println("Key found at index: "+new BinarySearch().binarySearch(arr,key));

    }
}