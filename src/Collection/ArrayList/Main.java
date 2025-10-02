package Collection.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

record GroceryItem(String name,String type, int count){
    public GroceryItem(String name){
        this(name, "DAIRY", 1);
    }
}

public class Main {
    public static void main(String[] args) {
        Object[] groceryArray = new Object[3];
        groceryArray[0] = new GroceryItem("milk");
        groceryArray[1] = new GroceryItem("apples","PRODUCE",6);
        groceryArray[2] = "5 oranges";
        System.out.println(Arrays.toString(groceryArray));

        ArrayList<GroceryItem> objectList = new ArrayList<>();
        objectList.add(new GroceryItem("milk"));

        ArrayList<GroceryItem> objectList1 = new ArrayList<>();
        objectList1.add(new GroceryItem("apples"));
        objectList1.add(new GroceryItem("milk"));
        System.out.println(objectList);
    }
}
