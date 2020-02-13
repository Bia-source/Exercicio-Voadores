package ExercicioVoador;

public class Pato implements Voador {
  private int energia;

    public Pato(){

    }

    @Override
    public void voar() {
        if(energia < 5){
            System.out.println("Não posso voar nao tenho energia -_-");
        }else{
            energia -= 5 ;
        }


        System.out.println("Estou voando como um pato");
        System.out.println("Energia: " + energia );
    }
}
