package principal;

public class Main {

    public static void main(String[] args) {

        PesoAlturaC persona1PA = new PesoAlturaC();
        PersonaC persona1 = new PersonaC(53);

        PersonaC personacopia = persona1.clone();


        System.out.println(personacopia.getEdad());


    }
}
