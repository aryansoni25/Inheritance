public class Animal {
    private String type;
    private String size;
    private double weight;
    public Animal() {}

    @Override
    public String toString() {
        return "Animal{" +
                "size='" + size + '\'' +
                ", type='" + type + '\'' +
                ", weight=" + weight +
                '}';
    }

    public Animal(String type, String size, double weight) {
        this.type = type;
        this.size = size;
        this.weight = weight;
    }
    public void makeSound() {
        System.out.println( type + " " + "Make some kind of noise");
    }
    public void move(String speed) {
        System.out.println (type + " " + "Move so " + speed);
    }
}
