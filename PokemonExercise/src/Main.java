import Logic.Bulbasaur;
import Logic.Charmander;
import Logic.Pikachu;
import Logic.Squirtle;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Pikachu pika = new Pikachu();
        Bulbasaur bulba = new Bulbasaur();
        Squirtle squirtle = new Squirtle();
        Charmander charmander = new Charmander();
        pika.impactruenoAttack();
        pika.punioTruenoAttack();
        pika.rayoAttack();
        pika.rayoCargaAttack();
    }
}