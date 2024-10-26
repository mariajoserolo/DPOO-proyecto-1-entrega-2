package Logica;

import java.util.ArrayList;

public abstract class Actividad {

	private String descripcion;
	private String objetivo;
	private int nivelDificultad;
	private int duracionEsperada;
	private String fechaLimite;
	private ArrayList<Actividad> listaActividadPrevia;
	private boolean actividadCompletada;
	private boolean profesor;
	private LearningPath learningPath;
	private String tipoActividad;
	private int idLP;
	
	
	public Actividad(String descripcion, String objetivo, String fechaLimite, int nivelDificultad, int duracionEsperada, boolean actividadCompletada) {
		this.descripcion = descripcion;
		this.objetivo = objetivo;
		this.fechaLimite = fechaLimite;
		this.nivelDificultad = nivelDificultad;
		this.duracionEsperada = duracionEsperada;
		listaActividadPrevia = new ArrayList<>();
		this.actividadCompletada = actividadCompletada;
		this.profesor = profesor;
		this.tipoActividad = tipoActividad;
		this.idLP = idLP;
	}


	public String getDescripcion() {
		return descripcion;
	}


	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}


	public String getObjetivo() {
		return objetivo;
	}


	public void setObjetivo(String objetivo) {
		this.objetivo = objetivo;
	}


	public int getNivelDificultad() {
		return nivelDificultad;
	}


	public void setNivelDificultad(int nivelDificultad) {
		this.nivelDificultad = nivelDificultad;
	}


	public int getDuracionEsperada() {
		return duracionEsperada;
	}


	public void setDuracionEsperada(int duracionEsperada) {
		this.duracionEsperada = duracionEsperada;
	}


	public String getFechaLimite() {
		return fechaLimite;
	}


	public void setFechaLimite(String fechaLimite) {
		this.fechaLimite = fechaLimite;
	}


	public ArrayList<Actividad> getListaActividadPrevia() {
		return listaActividadPrevia;
	}


	public void setListaActividadPrevia(ArrayList<Actividad> listaActividadPrevia) {
		this.listaActividadPrevia = listaActividadPrevia;
	}


	public boolean isActividadCompletada() {
		return actividadCompletada;
	}


	public void setActividadCompletada(boolean actividadCompletada) {
		this.actividadCompletada = actividadCompletada;
	}
	
	
	public boolean isProfesor() {
		return profesor;
	}


	public void setProfesor(boolean profesor) {
		this.profesor = profesor;
	}

	

	public LearningPath getLearningPath() {
		return learningPath;
	}


	public void setLearningPath(LearningPath learningPath) {
		this.learningPath = learningPath;
	}


	public String getTipoActividad() {
		return tipoActividad;
	}


	public void setTipoActividad(String tipoActividad) {
		this.tipoActividad = tipoActividad;
	}

	
	
	public int getIdLP() {
		return idLP;
	}


	public void setIdLP(int idLP) {
		this.idLP = idLP;
	}


	public void crearActividad(boolean profesor, String tipoActividad, Actividad actividad, LearningPath learningPath, int idLP) {
		if (this.profesor==true) {
			if(learningPath.getId()==idLP) {
				learningPath.addActividad(actividad);
		}}}}





