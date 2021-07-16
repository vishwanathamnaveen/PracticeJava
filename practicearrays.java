
public class practicearrays {
    public static void main(String args[]){
    String[] cars={ "Book", "Pencil", "Eraser", "Color", "Pen" };
    int index=0;
    boolean found=false;
    String search="Book";
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




}
}



