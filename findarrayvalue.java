package PracticeJava;

public class findarrayvalue {
    public static boolean finda(int[] arr,int x){
        for(int n :arr){
            if(n==x){
                return true;
            }
        }
        return false;
    }
    public static void main(String args[]){
        int[] arr={7,9,4,2,9};
        System.out.println(finda(arr,10));

    }
    /* public static void main(String args[]){
        int[] arr={7,9,4,2,9};
        int x=9;
        for(int i=0;i<arr.length;i++){
            if(x==arr[i]){
                System.out.println("element found");

            }
else{System.out.println("element not found");
            }

        }
        
    } */
}



