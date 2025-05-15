 class mulitilevel {
    public void next(){
        System.out.println("this is multilevel inheritance");  
    }

}
class Cat extends Animal{
    public void sound(){
        System.out.println("cat meows.");  
    }
}
class Lion extends Animal{
    public void sound(){
        System.out.println("cat meows.");  
    }
}
public class Main {
    public static void main(String[] args) {
        Dog dog1= new Dog();
        dog1.eat();
        dog1.bark();
    }
}