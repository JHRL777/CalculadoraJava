public class Listas {

    String nombre;

    Integer edad;

    String Ubicacion;


   public Listas(String nombre, Integer edad, String Ubicacion){
        this.edad = edad;
        this.nombre = nombre;
        this.Ubicacion = Ubicacion;
    }

    public Listas() {
    }

    public String getNombre(){
       return this.nombre;
    }

    public void setNombre(String nombre){
       this.nombre = nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getUbicacion() {
        return Ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        Ubicacion = ubicacion;
    }
}
