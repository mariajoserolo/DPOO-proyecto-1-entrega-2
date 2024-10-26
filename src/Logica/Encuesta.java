package Logica;

public class Encuesta {

	private boolean enviado;

	public Encuesta(boolean enviado) {
		this.enviado = enviado;
	}
	public boolean isEnviado() {
		return enviado;
	}

	public void setEnviado(boolean enviado) {
		this.enviado = enviado;
	}
	
	public void obtenerNota(boolean enviado) {
		if (enviado==true) {
			System.out.println("La encuesta se ha completado");
		} else {
			System.out.println("Envie las respuestas a las preguntas para completar la actividad.");
		}
	}
}
