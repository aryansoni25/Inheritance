public class Fish extends Animal {
    private int fins;
    private int gills;

    public Fish(String type, double weight, int fins, int gills) {
        super(type, "Small", weight);
        this.fins = fins;
        this.gills = gills;
    }
    private void moveMuscles(){
        System.out.println("Moving muscles");
    }
    private void moveBackFin(){
        System.out.println("Moving back fin");
    }
    public void move(String Speed){
        moveMuscles();
        if(Speed=="fast"){
            moveBackFin();
        }
        System.out.println();
    }

    @Override
    public String toString() {
        return "Fish{" +
                "fins=" + fins +
                ", gills=" + gills +
                "} " + super.toString();
    }
}
