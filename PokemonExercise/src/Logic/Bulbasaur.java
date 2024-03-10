package Logic;

public class Bulbasaur extends Pokemon implements IEarth{
    public Bulbasaur() {}

    @Override
    public void paralizarAttack() {
        System.out.println("I'm Bulbasaur and I'm using Paraliza attack");
    }

    @Override
    public void drenajeAttack() {
        System.out.println("I'm Bulbasaur and I'm using Drenaje attack");
    }

    @Override
    public void hojaAfiladaAttack() {
        System.out.println("I'm Bulbasaur and I'm using HojaAfilada attack");
    }

    @Override
    public void latigoCepaAttack() {
        System.out.println("I'm Bulbasaur and I'm using LatigoCepa attack");
    }

    @Override
    protected void placajeAttack() {
        System.out.println("I'm Bulbasaur and I'm using Placaje attack");
    }

    @Override
    protected void arañazoAttack() {
        System.out.println("I'm Bulbasaur and I'm using Arañazo attack");
    }

    @Override
    protected void biteAttack() {
        System.out.println("I'm Bulbasaur and I'm using Bite attack");
    }
}
