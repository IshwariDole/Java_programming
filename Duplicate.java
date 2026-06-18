public class Duplicate {

    public static void main(String args[]){
        int ar[]={1, 1, 2, 2, 3, 4, 4 ,5};
        int i=0;
        for(int j=1;j<ar.length;j++){
            if(ar[j]!=ar[i]){
                i++;
                ar[i]=ar[j];
            }

        }
       for(int k=0;k<=i;k++){
        System.out.print(ar[k]);
       }
    }
}