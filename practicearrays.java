import java.util.ArrayList;
public class practicearrays {
   /* public static void main(String args[]){
    String[] cars={ "Book", "Pencil", "Eraser", "Color", "Pen" };
    int index=0;
    boolean found=false;
    String search="Color";
    for(int i=0;i<cars.length;i++){
        if(search==cars[i]){
            index=i;
            found=true;
        break;
        }
    }
    if(found){
        System.out.println("String found at index"+index);
    
    }else{System.out.println("String not found at index");}
*/

//printing all the elemtents in an arrary
/*public static void main(String args[]){
    int[] cars={ 2,3,4,5,6,7,8 };
    for (int i=0;i<cars.length;i++){
        System.out.println("elements in the array"+cars[i]);
    }

}
}

public static void main(String args[]){
    int[] cars={ 2,3,4,5,600,7,8 };
    int count=0;
    for (int i=0;i<cars.length;i++){
        count=count+cars[i];
    }
    System.out.println("count is "+count);

}}*/
//ArrayList its a dynamic a
public static void main(String[] args){
    ArrayList<String> students=new ArrayList<>();
    students.add("ganesh");

    System.out.println(students);



}  

}
