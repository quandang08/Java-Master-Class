package OOP.OOP_SmartKitchen;

public class Main {
    public static void main(String[] args) {
        SmartKitchen kitchen = new SmartKitchen();

//        kitchen.getDishWasher().setHasWorkToDo(true);
//        kitchen.getIceBox().setHasWorkToDo(true);
//        kitchen.getBrewCoffeeMaker().setHasWorkToDo(true);
//
//        kitchen.getDishWasher().doDishes();
//        kitchen.getIceBox().brewCoffee();
//        kitchen.getDishWasher().doDishes();

        kitchen.setKitchenState(true,true,true);
        kitchen.doKitchenWork();
    }
}
