package Chapter9;


    class Animal {
        public void animalSound() {
            System.out.println("The animal makes a sound");
        }
        public String haslegs(){
            System.out.println("This animal has 4 legs");
            return "";
        }
    }

    class Pig extends Animal {
        public void animalSound() {
            System.out.println("The pig says: wee wee");
        }
    }

    class Dog extends Animal {
        public void animalSound() {
            System.out.println("The dog says: bow wow");
        }
    }

    class Main {
        public static void main(String[] args) {
            Animal myAnimal = new Animal();  // Create a Animal object
            Animal myPig = new Pig();  // Create a Pig object
            Pig myP = new Pig();  // Create a Pig object
            Animal myDog = new Dog();  // Create a Dog object
            myAnimal.animalSound();
            myPig.animalSound();
            myP.animalSound();
            myP.haslegs();
            myPig.haslegs();
//            myDog.animalSound();

        }
    }

