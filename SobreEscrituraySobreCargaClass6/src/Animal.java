public class Animal {
    /**
     * Example how it works "Sobrecarga de metodos"
     */
    private int animal_id;
    private String description;

    public Animal() {
    }

    public int getAnimal_id() {
        return animal_id;
    }

    public void setAnimal_id(int animal_id) {
        this.animal_id = animal_id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void makeSound() {
        System.out.println("The animal makes a sound");
    }

    public void makeSound(String animalName) {
        System.out.println("The animal " + animalName + " makes a sound" );
    }

    public void makeSound(String animalName, String soundType) {
        System.out.println("The animal " + animalName + " makes a sound of type "+ soundType);
    }
}
