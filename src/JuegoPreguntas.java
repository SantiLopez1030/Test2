import java.util.Scanner;
 public class JuegoPreguntas {
    public static void main(String[]args){
        System.out.println("¡Bienvenido al juego de preguntas!");
        System.out.println();
        System.out.println("Comencemos:");
        Pregunta[] preguntas = new Pregunta[5];
        preguntas[0] = new Pregunta("¿De que colores es la bandera argentina?",
                "Celeste, blanco y amarillo");
        preguntas[1] = new Pregunta("¿Quién pintó la Mona Lisa?",
                "Leonardo Da Vinci");
        preguntas[2] = new Pregunta("Cuál es la capital de Buenos Aires?,",
                "La Plata");
        preguntas[3] = new Pregunta("¿En que año Argentina declaró la guerra a Gran Bretaña?"
        ,"1982");
        preguntas[4] = new Pregunta("¿Cuantos días tiene un año no bisiesto?",
                "365");
        Scanner scanner = new Scanner(System.in);
        int puntaje= 0;

        for (Pregunta pregunta : preguntas){
            System.out.println(pregunta.obtenerEnunciado());
            String respuestaUsuario = scanner.nextLine();
        if (pregunta.verificarRespuesta(respuestaUsuario)){
            System.out.println("¡Respuesta correcta!");
            puntaje++;}
        else{
            System.out.println("Respuesta incorrecta");}
        }
    System.out.println("¡El juego ha terminado! tu puntaje ha sido de: "+puntaje+" puntos de "
            +preguntas.length+" preguntas");
    System.out.println("¡Gracias por jugar!");
    }
}
