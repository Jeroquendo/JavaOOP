package Logic;

public class Squirtle extends Pokemon implements IWater {
    public Squirtle() {}

    @Override
    public void hidroBombaAttack() {
        System.out.println("I'm Squartile and I'm using HidroBomba attack");
    }

    @Override
    public void pistolaAguaAttack() {
        System.out.println("I'm Squartile and I'm using HidroBomba attack");
    }

    @Override
    public void burbujaAttack() {
        System.out.println("I'm Squartile and I'm using burbuja attack");
    }

    @Override
    public void hidroPulsoAttack() {
        System.out.println("I'm Squartile and I'm using hidroPulso attack");
    }

    @Override
    protected void placajeAttack() {
        System.out.println("I'm Squartile and I'm using placaje attack");
    }

    @Override
    protected void arañazoAttack() {
        System.out.println("I'm Squartile and I'm using arañazo attack");
    }

    @Override
    protected void biteAttack() {
        System.out.println("I'm Squartile and I'm using bite attack");
    }
}
