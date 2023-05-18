public class Main {
    public static void main(String[] args) {
        Lion stan = new Lion("Stanley", 8, "Male");
        stan.displayInfo();
        stan.speak();
        System.out.println ("");
        
        Elephant joe = new Elephant("Joey", 15, "Male");
        joe.displayInfo();
        joe.speak();
        System.out.println ("");

        Snake kevs = new Snake("Kevs", 19, "Male");
        kevs.displayInfo();
        kevs.speak();
        System.out.println ("");

        Lizard Gina = new Lizard("Gina", 18, "Female");
        Gina.displayInfo();
        Gina.speak();
        System.out.println ("");

        Eagle fidel = new Eagle("Fidel", 20, "Male");
        fidel.displayInfo();
        fidel.speak();
        System.out.println ("");

        Parrot joy = new Parrot("Joy", 21, "Female");
        joy.displayInfo();
        joy.speak();

    }
}