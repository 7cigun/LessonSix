package SixLesson;

public class Dog extends Animal {
    public Dog() {
    }

    //public Animal(String animalType, String petName, int runDistance, int swinDistance, int canRun, int canSwim)


    public Dog(String petName, int runDistance, int swinDistance) {
        super("собака", petName, runDistance, swinDistance, 500, 10);
    }

    public Dog(String petName, int runDistance, int swinDistance, int canRun, int canSwim) {
        super("собака", petName, runDistance, swinDistance, canRun, canSwim);
    }

}
