class Animal {
    public void eat() {
        System.out.println("This animal eats food.");
    }
}
class Dog extends Animal {
   public void bark() {
        System.out.println("The dog barks.");
    }
}public class Main {
    public static void main(String[] args) {
        Dog dog1= new Dog();
        dog1.eat();
        dog1.bark();
    }
}
