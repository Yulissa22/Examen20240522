public class Futbolista extends Persona{
    private Integer dorsal;
    private String demarcacion;

    public Futbolista() {
    }

    public Futbolista(Integer dorsal, String demarcacion) {
        this.dorsal = dorsal;
        this.demarcacion = demarcacion;
    }

    public Integer getDorsal() {
        return dorsal;
    }

    public void setDorsal(Integer dorsal) {
        this.dorsal = dorsal;
    }

    public String getDemarcacion() {
        return demarcacion;
    }

    public void setDemarcacion(String demarcacion) {
        this.demarcacion = demarcacion;
    }

    public void jugarPartido(){
        System.out.println("Soy el futbolista y voy a jugar");
    }

    public void entrenar(){
        System.out.println("Soy el futbolista y voy a entrenar");
    }

    @Override 
    public void concentrarse(){
        System.out.println("Soy el futbolista y voy a concentrarme");
    }

    @Override 
    public void viajar(){
        System.out.println("Soy el futbolista y voy a viajar");
    }
}
