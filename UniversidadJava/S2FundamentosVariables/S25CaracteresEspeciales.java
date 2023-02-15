package s2fundamentosjavavariables;

public class S25CaracteresEspeciales {

    public static void main(String[] args) {
        var nombre = "Karla";
        System.out.println("Nueva linea: \n" + nombre);//Salto de linea
        System.out.println("Tabulador: \t" + nombre);//Tabulador
        System.out.println("Retroceso: \b" + nombre);//Retroceso 1 espacio
        System.out.println("Comilla simle: \'" + nombre + "\'");
        System.out.println("Comilla doble: \"" + nombre + "\"");
    }
}
