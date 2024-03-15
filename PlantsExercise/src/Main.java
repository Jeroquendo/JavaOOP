public class Main {
    public static void main(String[] args) {
        Tree tree = new Tree("Lemon",3.4,true,"Template","Fruit","thin",2.5,"Green","nice");
        Flower flower = new Flower();
        Bush bush = new Bush();
        flower.setName("Rose");
        bush.setName("Pine");
        tree.kindOfPlant();
        flower.kindOfPlant();
        bush.kindOfPlant();

    }
}