public class Main {

    public static void main(String[] args) {
        Dog dog = new Dog("Rex", "German Shepherd", 5);
        String barked = dog.bark();
        System.out.println(barked);
    }
}
