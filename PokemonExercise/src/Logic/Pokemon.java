package Logic;

public abstract class Pokemon {
    protected int num_pokedex;
    protected String pokemonName;
    protected double pokemonWeigh;
    protected String sex;
    protected int temporade;
    protected String pokemonType;

    protected abstract void placajeAttack();
    protected abstract void arañazoAttack();
    protected abstract void biteAttack();
}
