abstract class Animal {
    private String name;
    private int age;
    private String gender;

    public Animal(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public abstract void speak();

    public abstract void displayInfo();
}

abstract class Mammal extends Animal {
    public Mammal(String name, int age, String gender) {
        super(name, age, gender);
    }
}

abstract class Reptile extends Animal {
    public Reptile(String name, int age, String gender) {
        super(name, age, gender);
    }
}

abstract class Bird extends Animal {
    public Bird(String name, int age, String gender) {
        super(name, age, gender);
    }
}

class Lion extends Mammal {
    public Lion(String name, int age, String gender) {
        super(name, age, gender);
    }

    public void speak() {
        System.out.println("Roar!");
    }

    public void displayInfo() {
        System.out.println("Lion - Name: " + getName() + ", Age: " + getAge() + ", Gender: " + getGender());
    }
}

class Elephant extends Mammal {
    public Elephant(String name, int age, String gender) {
        super(name, age, gender);
    }

    public void speak() {
        System.out.println("Trumpet!");
    }

    public void displayInfo() {
        System.out.println("Elephant - Name: " + getName() + ", Age: " + getAge() + ", Gender: " + getGender());
    }
}

class Snake extends Reptile {
    public Snake(String name, int age, String gender) {
        super(name, age, gender);
    }

    public void speak() {
        System.out.println("Hiss!");
    }

    public void displayInfo() {
        System.out.println("Snake - Name: " + getName() + ", Age: " + getAge() + ", Gender: " + getGender());
    }
}

class Lizard extends Reptile {
    public Lizard(String name, int age, String gender) {
        super(name, age, gender);
    }

    public void speak() {
        System.out.println("Squeak!");
    }

    public void displayInfo() {
        System.out.println("Lizard - Name: " + getName() + ", Age: " + getAge() + ", Gender: " + getGender());
    }
}

class Eagle extends Bird {
    public Eagle(String name, int age, String gender) {
        super(name, age, gender);
    }

    public void speak() {
        System.out.println("Screech!");
    }

    public void displayInfo() {
        System.out.println("Eagle - Name: " + getName() + ", Age: " + getAge() + ", Gender: " + getGender());
    }
}

class Parrot extends Bird {
    public Parrot(String name, int age, String gender) {
        super(name, age, gender);
    }

    public void speak() {
        System.out.println("Squawk!");
    }

    public void displayInfo() {
        System.out.println("Parrot - Name: " + getName() + ", Age: " + getAge() + ", Gender: " + getGender());
    }
}

