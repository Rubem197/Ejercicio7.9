package principal;

public class Main {

    public static void main(String[] args) {

        PesoAlturaC pesoaltura = new PesoAlturaC(53, 169);
        PersonaC persona1 = new PersonaC(32, "hola", "e", pesoaltura);
        PersonaC personacopia = persona1.clone();

        System.out.println(personacopia.getEdad());


    }
}
