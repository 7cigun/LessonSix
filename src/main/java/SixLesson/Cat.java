package SixLesson;

public class Cat extends Animal {
    private static final int canSwim = 0;

    public Cat() {
    }

    //public Animal(String animalType, String petName, int runDistance, int swinDistance, int canRun, int canSwim)

    public Cat(String petName, int runDistance, int swimDistance) {
        super("кот", petName, runDistance, swimDistance, 200, canSwim);
    }

    public Cat(String petName, int runDistance, int swinDistance, int canRun) {
        super("кот", petName, runDistance, swinDistance, canRun, canSwim);
    }

}
