public class Gato extends DomesticAnimal {
    public Gato(int animal_id, String description) {
        super(animal_id, description);
    }

    @Override
    public void makeSound() {
        System.out.println("I'm a cat and miau miau");
    }
}
