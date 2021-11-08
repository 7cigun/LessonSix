package SixLesson;

public class Animal {
    private int canSwim;
    private int canRun;
    private String petName;
    private String animalType;
    private int runDistance;
    private int swinDistance;

    public Animal() {
    }

    public Animal(String animalType, String petName, int runDistance, int swinDistance, int canRun, int canSwim) {
        this.animalType = animalType;
        this.petName = petName;
        this.runDistance = runDistance;
        this.swinDistance = swinDistance;
        this.canRun = canRun;
        this.canSwim = canSwim;
    }

    public boolean run(int runDistance) {
        return (runDistance <= canRun);
    }

    public boolean swim(int swinDistance) {
        return (swinDistance <= canSwim);
    }

    public int getCanSwim() {
        return canSwim;
    }

    public int getCanRun() {
        return canRun;
    }

    public String getPetName() {
        return petName;
    }

    public String getAnimalType() {
        return animalType;
    }

    public int getRunDistance() {
        return runDistance;
    }

    public int getSwinDistance() {
        return swinDistance;
    }
}
