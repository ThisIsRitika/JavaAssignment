
    interface Animal {
        void makeSound();
        void eat();
    }
    
    class Dog implements Animal {
        public void makeSound() {
            System.out.println("Woof! Woof!");
        }
    
        public void eat() {
            System.out.println("The dog is eating.");
        }
    }
    
    class Puppy extends Dog {
        @Override
        public void makeSound() {
            System.out.println("Yip! Yip!");
        }
    }
    
    public class Main {
        public static void main(String[] args) {
            Puppy puppy = new Puppy();
            puppy.makeSound();
            puppy.eat();
        }
    }

