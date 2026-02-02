public class Plant {
    int numWeeksOld;
    String color;
    boolean isEdible;

    public Plant(int pNumWeeksOld, String pColor, boolean pIsEdible){
        numWeeksOld=pNumWeeksOld;
        color=pColor;
        isEdible=pIsEdible;



    }
    public void printInfo(){
        System.out.println("The plant is "+numWeeksOld+" weeks old, "+ color+" and it is "+isEdible+" that it is edible.");

    }
}
