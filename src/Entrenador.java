public class Entrenador extends Persona{
    private String idFederacion;

    public Entrenador() {
    }

    public Entrenador(String idFederacion) {
        this.idFederacion = idFederacion;
    }

    public String getIdFederacion() {
        return idFederacion;
    }

    public void setIdFederacion(String idFederacion) {
        this.idFederacion = idFederacion;
    }

    public void dirigirEntrenamiento(){
        System.out.println("Soy el entrenador y voy a dirigir el entrenamiento");
    }

    public void dirigirPartido(){
        System.out.println("Soy el entrenador y voy dirigir el partido");
    }

    @Override 
    public void concentrarse(){
        System.out.println("Soy el entrenador y voy a concentrarme");
    }

    @Override 
    public void viajar(){
        System.out.println("Soy el entrenador y voy a viajar");
    }

}
