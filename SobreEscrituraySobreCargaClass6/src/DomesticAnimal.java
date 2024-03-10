public abstract class DomesticAnimal {
    private int animal_id;
    private String description;

    public DomesticAnimal(int animal_id, String description) {
        this.animal_id = animal_id;
        this.description = description;
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

    public abstract void makeSound();
}
