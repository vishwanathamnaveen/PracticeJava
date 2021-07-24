package PracticeJava;

public class averagearray {
    public static void main(String args[]){
        int[] arr={7,9,4,2,9};
        int count=0;
        for(int i=0;i<arr.length;i++){
            count+=arr[i];

           

        }
        System.out.println("count of array "+count);
        System.out.println("average_of _array "+count/arr.length);
        
    }
    
}
