package SixLesson;

public class Main {
    public static void main(String[] args) {
        //У каждого животного есть ограничения: бег: кот 200, собака 500; плавание: кот не умеет плавать, собака 10

        //public Animal(int canRun, int canSwim, String animalType, String petName, int runDistance, int swinDistance)

        //Cat(String petName, int runDistance, int swimDistance)
        //Cat(String petName, int runDistance, int swinDistance, int canRun)

        int count = 0;
        int countCat = 0;
        int countDog = 0;

        //Cat cat1 = new Cat();
        Cat cat1 = new Cat("Барсик", 201, 10);
        Cat cat2 = new Cat("Тузик", 10, 1);
        Cat cat3 = new Cat("Турбо", 400, 10, 450);

        //Dog(String petName, int runDistance, int swinDistance)
        //Dog(String petName, int runDistance, int swinDistance, int canRun, int canSwim)
        //Dog dog1 = new Dog();
        Dog dog1 = new Dog("Дружок", 501, 11);
        Dog dog2 = new Dog("Шарик", 20, 5);
        Dog dog3 = new Dog("Халк", 1000, 50, 2000, 100);

        Animal[] animals = {cat1, cat2, cat3, dog1, dog2, dog3};

        for (Animal animal : animals) {
            if (animal.run(animal.getRunDistance())) {
                System.out.println(animal.getAnimalType() + " " + animal.getPetName() + " вернулся из путешествия в " + animal.getRunDistance() + " км, т.к. он может пробежать " + animal.getCanRun());
            } else {
                System.out.println(animal.getAnimalType() + " " + animal.getPetName() + " не вернулся из путешествия в " + animal.getRunDistance() + " км, т.к. он может пробежать " + animal.getCanRun());
            }


            if (animal.swim(animal.getSwinDistance())) {
                System.out.println(animal.getAnimalType() + " " + animal.getPetName() + " переплыл озеро шириной в " + animal.getSwinDistance() + " км, т.к. он может проплыть " + animal.getCanSwim());
            } else {
                System.out.println(animal.getAnimalType() + " " + animal.getPetName() + " утонул в озере шириной в " + animal.getSwinDistance() + " км, т.к. он может проплыть " + animal.getCanSwim());
            }

            count++;
            if (animal instanceof Cat) {
                countCat++;
            } else {
                countDog++;
            }
        }
        System.out.println();
        System.out.println("Всего животных: " + count);
        System.out.println("Из них котов: " + countCat);
        System.out.println("А собак: " + countDog);
    }
}
