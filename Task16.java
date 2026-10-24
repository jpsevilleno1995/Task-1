interface Animal {
    boolean feed(boolean timeToEat);
    void groom();
    void pet();
}

class Gorilla implements Animal {

    @Override
    public boolean feed(boolean timeToEat) {
        if (timeToEat) {
            return true;
        }
        return false;
    }

    @Override
    public void groom() {
    }

    @Override
    public void pet() {
    }
}

public class Task16 {
    public static void main(String[] args) {
        Gorilla myGorilla = new Gorilla();
        
        System.out.println("Feeding gorilla: " + myGorilla.feed(true));
        myGorilla.groom();
        myGorilla.pet();
        
        System.out.println("Task 16 executed successfully!");
    }
}