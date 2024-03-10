public class Dog extends DomesticAnimal {
    private String dogName;
    private double weigh;
    private String raza;
    private String sexo;
    public Dog(int animal_id, String description) {
        super(animal_id, description);
    }

    /**
     * @Override it's an example that how do you need to override (Sobreescritura) a method
     */
    @Override
    public void makeSound() {
        System.out.println("I'm a dog and barf: Guau guau");
    }
}
