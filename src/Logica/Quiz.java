package Logica;

import java.util.ArrayList;

public class Quiz {
	private boolean tienePrerequisito;
	private boolean prerequisitoCumplido;
	private int nota;
	private boolean satisfactorio;
	private boolean hecha;
	
	
	public Quiz(int nota, boolean disponible, boolean hecha, boolean calificada, boolean tienePrerequisito, boolean prerequisitoCumplido) {
		this.nota = nota;
		this.satisfactorio = disponible;
		this.hecha = hecha;
		this.prerequisitoCumplido = prerequisitoCumplido;
		this.tienePrerequisito = tienePrerequisito;
	}

	public int getNota() {
		return nota;
	}

	public void setNota(int nota) {
		this.nota = nota;
	}

	public boolean isDisponible() {
		return satisfactorio;
	}

	public void setDisponible(boolean disponible) {
		this.satisfactorio = disponible;
	}
	
	public boolean isHecha() {
		return hecha;
	}

	public void setHecha(boolean hecha) {
		this.hecha = hecha;
	}

	public boolean isTienePrerequisito() {
		return tienePrerequisito;
	}

	public void setTienePrerequisito(boolean tienePrerequisito) {
		this.tienePrerequisito = tienePrerequisito;
	}

	public boolean isPrerequisitoCumplido() {
		return prerequisitoCumplido;
	}

	public void setPrerequisitoCumplido(boolean prerequisitoCumplido) {
		this.prerequisitoCumplido = prerequisitoCumplido;
	}

	public boolean isSatisfactorio() {
		return satisfactorio;
	}

	public void setSatisfactorio(boolean satisfactorio) {
		this.satisfactorio = satisfactorio;
	}

	public void obtenerNota(int nota, boolean disponible, boolean hecha, boolean calificada, boolean tienePrerequisito, boolean prerequisitoCumplido) {
		if (this.tienePrerequisito==true && this.prerequisitoCumplido==false) {
			System.out.println("Revise los prerequisitos de la actiivdad.");
		}else if (this.tienePrerequisito==true && this.prerequisitoCumplido==true && this.hecha==true) {
			System.out.println("Su nota es: " + nota);
			System.out.println("Si su nota es menor a la calificacion minima deberá volver a la lectura del prereqisito");
		}
	}
}

