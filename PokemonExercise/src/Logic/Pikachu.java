package Logic;

public class Pikachu extends Pokemon implements IElectric {
    public Pikachu() {
    }

    @Override
    public void impactruenoAttack() {
        System.out.println("I'm Pikachu and I'm using Impactrueno attack");
    }

    @Override
    public void punioTruenoAttack() {
        System.out.println("I'm Pikachu and I'm using punioTrueno attack");
    }

    @Override
    public void rayoAttack() {
        System.out.println("I'm Pikachu and I'm using Rayo attack");
    }

    @Override
    public void rayoCargaAttack() {
        System.out.println("I'm Pikachu and I'm using RayoCarga attack");
    }

    @Override
    protected void placajeAttack() {
        System.out.println("I'm Pikachu and I'm using Placaje attack");
    }

    @Override
    protected void arañazoAttack() {
        System.out.println("I'm Pikachu and I'm using Arañazo attack");
    }

    @Override
    protected void biteAttack() {
        System.out.println("I'm Pikachu and I'm using Bite attack");
    }
}
