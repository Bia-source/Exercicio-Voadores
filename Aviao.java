package ExercicioVoador;

public class Aviao implements Voador {
    private double horasDeVoo;

    public Aviao() {

    }

    @Override
    public void voar() {
        horasDeVoo += 13;
        System.out.println("Estou voando como um avião");
    }
}
