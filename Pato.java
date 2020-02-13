package ExercicioVoador;

public class Pato implements Voador {
  private int energia;

    public Pato(){

    }

    @Override
    public void voar() {
       energia -= 5 ;
        System.out.println("Estou voando como um pato");
    }
}
