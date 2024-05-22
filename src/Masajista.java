public class Masajista extends Persona{
    private String titulacion;
    private Integer anioExperiencia;

    
    public Masajista() {
    }


    public Masajista(String titulacion, Integer anioExperiencia) {
        this.titulacion = titulacion;
        this.anioExperiencia = anioExperiencia;
    }


    public String getTitulacion() {
        return titulacion;
    }


    public void setTitulacion(String titulacion) {
        this.titulacion = titulacion;
    }


    public Integer getAnioExperiencia() {
        return anioExperiencia;
    }


    public void setAnioExperiencia(Integer anioExperiencia) {
        this.anioExperiencia = anioExperiencia;
    }

    public void darMasaje(){
        System.out.println("Soy el masajista");
    }

    @Override 
    public void concentrarse(){
        System.out.println("Soy el masajista y voy a concentrarme");
    }

    @Override 
    public void viajar(){
        System.out.println("Soy el masajista y voy a viajar");
    }
}
