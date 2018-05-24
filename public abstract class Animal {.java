public abstract class Animal {
public abstract void speak();
}
public class Mammal extends Animal {
public void speak() {
System.out.println("Hello!");
}
}
public class Dog extends Mammal {
public void speak() {
System.out.println("Woof, woof!");
}
}
public class Cat extends Mammal {
public void speak() {
System.out.println("Meow!");
}
}
