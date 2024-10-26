package Logica;

import java.util.ArrayList;
import java.io.Serializable;

public class LearningPath {

	private String titulo;
	private String descripcionGeneral;
	private String objetivos;
	private String fechaInicio;
	private String fechaFinal;
	private int nivelDificultad;
	private int duracionMinutos;
	private int version;
	private int rating;
	private Actividad actividad;
	private ArrayList<Actividad> listaActividades;
	private int id;
	private boolean profesor;
	private boolean completado;
	
	public void crearLearningPath(boolean profesor, String titulo, String descripcionGeneral, String objetivos, String fechaInicio, String fechaFinal, int nivelDificultad, int duracionMinutos, int version, int rating, Actividad actividad) {
		if (profesor==true) {
			this.titulo = titulo;
			this.descripcionGeneral = descripcionGeneral;
			this.objetivos = objetivos;
			this.fechaInicio = fechaInicio;
			this.fechaFinal = fechaFinal;
			this.nivelDificultad = nivelDificultad;
			this.duracionMinutos = duracionMinutos;
			this.version = version;
			this.rating = rating;
			this.actividad = actividad;
			this.listaActividades = new ArrayList<>();
			this.id= id;
			this.completado = completado;
	}}
	
	
	public boolean isProfesor() {
		return profesor;
	}


	public void setProfesor(boolean profesor) {
		this.profesor = profesor;
	}


	public boolean isCompletado() {
		return completado;
	}


	public void setCompletado(boolean completado) {
		this.completado = completado;
	}


	public String getTitulo() {
		return titulo;
	}



	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}



	public String getDescripcionGeneral() {
		return descripcionGeneral;
	}



	public void setDescripcionGeneral(String descripcionGeneral) {
		this.descripcionGeneral = descripcionGeneral;
	}



	public String getObjetivos() {
		return objetivos;
	}



	public void setObjetivos(String objetivos) {
		this.objetivos = objetivos;
	}



	public String getFechaInicio() {
		return fechaInicio;
	}



	public void setFechaInicio(String fechaInicio) {
		this.fechaInicio = fechaInicio;
	}



	public String getFechaFinal() {
		return fechaFinal;
	}



	public void setFechaFinal(String fechaFinal) {
		this.fechaFinal = fechaFinal;
	}



	public int getNivelDificultad() {
		return nivelDificultad;
	}



	public void setNivelDificultad(int nivelDificultad) {
		this.nivelDificultad = nivelDificultad;
	}



	public int getDuracionMinutos() {
		return duracionMinutos;
	}



	public void setDuracionMinutos(int duracionMinutos) {
		this.duracionMinutos = duracionMinutos;
	}



	public int getVersion() {
		return version;
	}



	public void setVersion(int version) {
		this.version = version;
	}



	public int getRating() {
		return rating;
	}



	public void setRating(int rating) {
		this.rating = rating;
	}



	public Actividad getActividad() {
		return actividad;
	}



	public void setActividad(Actividad actividad) {
		this.actividad = actividad;
	}



	public ArrayList<Actividad> getListaActividades() {
		return listaActividades;
	}



	public void setListaActividades(ArrayList<Actividad> listaActividades) {
		this.listaActividades = listaActividades;
	}

	


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public void addActividad(Actividad actividad) {
		this.listaActividades.add(actividad);
	}
	
	public void eliminarActividad(Actividad actividad) {
		listaActividades.remove(actividad);
	}}
	
	
			
