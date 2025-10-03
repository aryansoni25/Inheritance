public class Dog extends Animal {
    private String earShape;
    private String tailShape;
    public Dog(){
        super("Mutt","Big",50);
    }

    public Dog(String type, double weight){
        this(type,weight,"Perky","Curled");
    }

    public Dog(String type,  double weight, String earShape, String tailShape) {
        super(type,weight<15?"Small":(weight<35?"Medium":"Large"), weight);
        this.earShape = earShape;
        this.tailShape = tailShape;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "earShape='" + earShape + '\'' +
                ", tailShape='" + tailShape + '\'' +
                "} " + super.toString();
    }

    @Override
    public void makeSound() {
        super.makeSound();
    }

    @Override
    public void move(String speed) {
        super.move(speed);
        if(speed=="slow"){
            walk();
            TailWagging();
        }
        else{
            run();
            bark();
        }
    }
    private void bark(){
        System.out.println("Woof!! Woof");
    }
    private void run(){
        System.out.println("Dog is running");
    }
    private void walk(){
        System.out.println("Dog is walking");
    }
    private void TailWagging(){
        System.out.println("TailWagging");
    }
}
