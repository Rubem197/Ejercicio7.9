package principal;

public class PersonaC implements Cloneable {
    private String nombre;
    private int edad;
    private String DNI;
    PesoAlturaC pesoAltura;

    public PersonaC(int edad) {
        this.edad = edad;
    }

    public PersonaC clone() {

        PersonaC obj = null;
        try {
            obj = (PersonaC) super.clone();
        } catch (CloneNotSupportedException ex) {
            System.out.println(" no se puede duplicar");
        }
        return obj;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public PesoAlturaC getPesoAltura() {
        return pesoAltura;
    }

    public void setPesoAltura(PesoAlturaC pesoAltura) {
        this.pesoAltura = pesoAltura;
    }
}
