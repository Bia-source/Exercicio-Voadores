package ExercicioVoador;

public class MainVoador {
    public static void main(String[] args) {
        Pato patoVoador = new Pato();
        Aviao aviaoVoador = new Aviao();
        SuperHomem superHVoador = new SuperHomem();
        TorreDeControle torre = new TorreDeControle();

        torre.adicionarVoador(patoVoador);
        torre.adicionarVoador(aviaoVoador);
        torre.adicionarVoador(superHVoador);

        torre.voemTodos();

    }
}
