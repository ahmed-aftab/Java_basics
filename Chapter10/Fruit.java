package Chapter10;

public class Fruit {
    protected int calories;

    public void makeJuice() {
        System.out.println("juice is made.");
    }
    Fruit(){
        System.out.println("Welcome to fruit market.");
    }
    static void market(){
        System.out.println("Market.");
    }
}
class Apple extends Fruit {
    public void removeSeeds(){

    }
    public void peel(){

    }
    Apple(){
        System.out.println("Apple is a fruit in market.");
        calories=9;
    }

    @Override
    public void makeJuice() {
        System.out.println(" Apple juice is made.");
    }
}
class Banana extends Fruit {
    public void removeSeeds(){

    }
    public void peel(){

    }


    @Override
    public void makeJuice() {
        System.out.println(" Banana juice is made.");
    }
}
