package s2fundamentosjavavariables;

public class S24ConcatenacionEnJava {

    public static void main(String[] args) {
        var usuario = "yo";
        var titulo = "Ingeniero";
        var union = titulo + ":" + usuario;
        System.out.println("union = " + union);

        var i = 3;
        var j = 4;
        System.out.println(i + j);//primero reliza la suma: 7
        System.out.println(i + j + usuario);// 7yo Evaluacion de izq a der
        System.out.println(usuario + i + j);// yo34 solo concatena - todo es cadena
        System.out.println(usuario + (i + j));// yo7 primero realiza la operacion en parentesis
    }
}
