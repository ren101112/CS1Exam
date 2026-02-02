public class Greenhouse {
    String name;
    boolean sprinklersOn;
    int numberOfFlowers;

    public static void main(String[] args) {
        Greenhouse greenhouse = new Greenhouse();

    }

    public Greenhouse() {
        System.out.println("Hello World! Good luck on your exams!");
        name = "Planting Parameters at the CSG";
        sprinklersOn = true;
        numberOfFlowers = 31;
        System.out.println("Welcome to " + name + "! It is " + sprinklersOn + " that we are watering plants right now. We have " + numberOfFlowers + " flowers!");
        numberOfFlowers = 12;
        System.out.println("Welcome to " + name + "! It is " + sprinklersOn + " that we are watering plants right now. We have " + numberOfFlowers + " flowers!");
        randomReplant();
        veggieOfTheDay("tomato");
        countFlowers();
        changeTemperature();
        Plant kimPlant = new Plant(3, "orange", true);
        kimPlant.printInfo();
        Plant myPLant = new Plant(100, "purple", false);
        myPLant.printInfo();
        starTriangle(7);
        perimeterTriangle(5);


    }

    public void randomReplant() {
        int randomInt = (int) (Math.random() * 16);
        System.out.println("We are replanting " + randomInt + " vegetables today");

    }

    public void veggieOfTheDay(String veggie) {
        System.out.println("Today's chosen veggie is " + veggie);


    }

    public void countFlowers() {
        for (int x = 2; x < 7; x++) {

            System.out.println(x);
        }

        System.out.println("\n");
        for (int y = 20; y < 111; y = y + 30) {

            System.out.println(y);
        }
        System.out.println("\n");

        for (int z = 8; z > -1; z = z - 1) {
            System.out.print(z + ", ");

        }
        System.out.println("\n");

    }

    public void changeTemperature() {
        double randomNum = Math.random();
        if (randomNum < .25) {
            System.out.println("The temperature has decreased by 2 degrees");

        }
        if (randomNum >= .25 && randomNum < .5) {
            System.out.println("The temperature has decreased by 1 degree");

        }
        if (randomNum >= .5 && randomNum < .75) {
            System.out.println("The temperature has increased by 1 degree");

        }
        if (randomNum >= .75) {

            System.out.println("The temperature has increased by 2 degrees");
        }


    }

    public void starTriangle(int size) {
        for (int x = 2; x < size + 2; x++) {
            System.out.println();
            for (int y = 1; y < x; y++) {
                System.out.print("*");

            }

        }


    }

    public void perimeterTriangle(int size) {
        for (int x = 2; x < size + 2; x++) {
            System.out.println();
            for (int y = 1; y < x; y++) {
                if (y==1) {
                    System.out.print("-");
                } else if (y<x-1) {
                    System.out.print("*");

                }else {
                    System.out.print("-");

                }








            }


        }
    }}
