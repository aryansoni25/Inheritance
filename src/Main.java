public class Main {
    public static void main(String[] args) {
        Animal animal=new Animal("Generic Animal","Huge",400);
        doAnimalStuff(animal,"Very Slow");
        Dog dog=new Dog();
        doAnimalStuff(dog,"Fast");
        Dog yorkie=new Dog("Yorkie",15);
        doAnimalStuff(yorkie,"slow");
        Dog retriver=new Dog("Labrador retriver",65,"Floppy","Swimmer");
        doAnimalStuff(retriver,"Fast");
        Fish fish=new Fish("Goldie",0.25,3,2);
        doAnimalStuff(fish,"fast");

    }
    public static void doAnimalStuff(Animal animal,String speed){
        animal.makeSound();
        animal.move(speed);
        System.out.println(animal);
    }
}