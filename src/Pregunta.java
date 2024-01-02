public class Pregunta {
    private String enunciado;
    private String respuesta;

    public Pregunta(String enunciado, String respuesta) {
        this.enunciado = enunciado;
        this.respuesta = respuesta;
    }

    public boolean verificarRespuesta(String respuestaUsuario) {
        return respuestaUsuario.equalsIgnoreCase(respuesta);
    }
    public String obtenerEnunciado(){
        return enunciado;
    }



}