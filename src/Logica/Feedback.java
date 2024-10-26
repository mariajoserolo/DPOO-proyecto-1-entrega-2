package Logica;


public class Feedback {
	//Se tendrá en ceunta mas adelante
	private int idLP;
    private String comentario;
    private int rating;
    private LearningPath learningPath;

    public Feedback(String comentario, int rating) {
        this.comentario = comentario;
        this.rating = rating;
    }

   
    public void mostrarFeedback() {
        if (learningPath.getId()==idLP) {
        	System.out.println("El feedback para el Learning Path cuyo ID es " + idLP + "es: " + comentario + ", Rating: " + rating);
    }
}}


