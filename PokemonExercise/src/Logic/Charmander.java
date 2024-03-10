package Logic;

public class Charmander extends Pokemon implements IFire {
    public Charmander() {}

    @Override
    protected void placajeAttack() {
        System.out.println("I'm Charmander and I'm using Placaje attack");
    }

    @Override
    protected void arañazoAttack() {
        System.out.println("I'm Charmander and I'm using Arañazo attack");
    }

    @Override
    protected void biteAttack() {
        System.out.println("I'm Charmander and I'm using Bite attack");
    }

    @Override
    public void ascuasAttack() {
        System.out.println("I'm Charmander and I'm using Ascuas attack");
    }

    @Override
    public void punioFuegoAttack() {
        System.out.println("I'm Charmander and I'm using punioFuego attack");
    }

    @Override
    public void lanzaLlamasAttack() {
        System.out.println("I'm Charmander and I'm using LanzaLlamas attack");
    }
}
