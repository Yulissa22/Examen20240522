public class App {
    public static void main(String[] args) throws Exception {
        

        Futbolista futbolista = new Futbolista();
        futbolista.jugarPartido();
        futbolista.concentrarse();
        futbolista.viajar();

        System.out.println("--------------");

        Entrenador entrenador = new Entrenador();
        entrenador.dirigirEntrenamiento();
        entrenador.dirigirPartido();
        entrenador.concentrarse();
        entrenador.viajar();

        System.out.println("--------------");

        Masajista masajista = new Masajista();
        masajista.darMasaje();
        masajista.concentrarse();
        masajista.viajar();
        
    }
}
