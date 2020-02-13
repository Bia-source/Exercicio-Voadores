package ExercicioVoador;

public class SuperHomem implements Voador {
    private double experiencia;

    public SuperHomem() {

    }

    @Override
    public void voar() {
        experiencia += 3;
        System.out.println("Estou voando como um campeão");
    }
}
