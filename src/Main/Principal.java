package Main;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import Logica.Profesor;
import Logica.Usuario;
import Logica.Estudiante;
import Persistencia.ArchivoCSV;
import Persistencia.ArchivoSerializable;



public class Principal {
	public Principal(String[] args) {
		 Scanner scanner = new Scanner(System.in);
		 ArrayList<Profesor> profesores = new ArrayList<>();
		 ArrayList<Estudiante> estudiantes = new ArrayList<>();
		 boolean correrUsuario = true;
		 
		 try {
	            profesores = (ArrayList<Profesor>) ArchivoSerializable.leerObjetoSerializable("profesor.ser");
	            System.out.println("Profesores cargados!");
	        } catch (IOException | ClassNotFoundException e) {
	            System.out.println("No existen profesores. Se crea nueva lista");
	        }
		 try {
	            estudiantes = (ArrayList<Estudiante>) ArchivoSerializable.leerObjetoSerializable("estudiante.ser");
	            System.out.println("Estudiantes cargados!");
	        } catch (IOException | ClassNotFoundException e) {
	            System.out.println("No existen estudiantes. Se crea nueva lista");
	        }
	while (correrUsuario) {


	System.out.println("Bienvenido");
	            System.out.println("1. Crear Usuario");
	            System.out.println("2. Login");
	            System.out.println("3. Salir");
	            System.out.print("Elija una opción: ");
	            int option = scanner.nextInt();
	            scanner.nextLine(); 

		switch(option) {
	  case 1:

		crearUsuario(scanner, profesores, estudiantes);
		break;

	case 2: 
	 if (login(scanner, profesores, estudiantes)) {
		 correrUsuario = false;
	 }
	 
	break;

	case 3: 
		System.out.println("Hasta luego");
	                    return;

	default:
	                    System.out.println("No es una opción: intente de nuevo");

	}
	}
	}

	private static Usuario crearUsuario(Scanner scanner, ArrayList profesores, ArrayList estudiantes){
	System.out.print("Usuario: ");
	        String usuario = scanner.nextLine();
	        System.out.print("Contraseña: ");
	        String contrasena = scanner.nextLine();
	        System.out.print("Nombre: ");
	        String nombre = scanner.nextLine();
	        System.out.print("Apellido: ");
	        String apellido = scanner.nextLine();
	        System.out.print("Email: ");
	        String email = scanner.nextLine();
	        System.out.print("Tipo (Profesor/Estudiante): ");
	        String tipo = scanner.nextLine();
	        String usuarioCompleto = usuario + "," + contrasena + "," + nombre + "," + apellido + "," + email + "," + tipo;

	try{

		ArrayList<String> usuarios = ArchivoCSV.leerArchivoCSV("usuarios.txt");
		usuarios.add(usuarioCompleto);
		ArchivoCSV.guardarTextoCSV(usuarios, "usuarios.txt");
		System.out.println("Usuario creado!");
	} catch (IOException e){
		System.out.println("No se pudo guardar el ususario");
	            e.printStackTrace();
	}
	if ("profesor".equalsIgnoreCase(tipo)) {	
		Profesor prof = new Profesor(usuario, contrasena, email, nombre, apellido);
		profesores.addLast(prof);
		try {
		    ArchivoSerializable.guardarObjetoSerializable(profesores, "profesor.ser");
		    System.out.println("Se ha guardado el profesor.");
		} catch (IOException e) {
		    e.printStackTrace();
		};
	} else if ("estudiante".equalsIgnoreCase(tipo)) {
		Estudiante est = new Estudiante(usuario, contrasena, email, nombre, apellido);
		estudiantes.addLast(est);
		try {
		    ArchivoSerializable.guardarObjetoSerializable(estudiantes, "estudiante.ser");
		    System.out.println("Se ha guardado el profesor.");
		} catch (IOException e) {
		    e.printStackTrace();}
	}
	return null;
	}

	private static boolean login(Scanner scanner, ArrayList<Profesor> profesores, ArrayList<Estudiante> estudiantes){
		System.out.print("Usuario: ");
	        String user = scanner.nextLine();
	        System.out.print("Contraseña: ");
	        String contra = scanner.nextLine();

	try{
	ArrayList<String> usuarios = ArchivoCSV.leerArchivoCSV("usuarios.txt");
	for (String linea : usuarios){
	String[] informacionUsuario = linea.split(",");
	if(informacionUsuario[0].equals(user) && informacionUsuario[1].equals(contra)){
	System.out.println("Login logrado!");
	                    String tipoUsuario = informacionUsuario[5];
	                    if ("profesor".equalsIgnoreCase(tipoUsuario)) {
	                    	for (Profesor profesorCorrecto : profesores) {
	                    		if (profesorCorrecto.getLogin().equals(user)){
	                    			profesorMenu(scanner, profesorCorrecto);
	                    			break;
	                    		}
	                    	}
	                    } else if ("estudiante".equalsIgnoreCase(tipoUsuario)) {
	                    	for (Estudiante estudianteCorrecto : estudiantes) {
	                    		if (estudianteCorrecto.getLogin().equals(user)) {
	                    			estudianteMenu(scanner, estudianteCorrecto);
	                    			break;
	                    		}
	                    	}
	                    } else {
	                        System.out.println("Tipo de usuario desconocido");
	                    }
	                    return true;
	                }
	            }
	            System.out.println("Contraseña o Usuario invialido");
	        } catch (IOException e) {
	            System.out.println("Ocurrio un error leyendo el archivo");
	            e.printStackTrace();
	        }
	return false;
	    }


	public static void profesorMenu( Scanner scanner, Profesor profesor){
		boolean correrProfesor = true;
		while (correrProfesor) {
		System.out.println("Menu profesor:");
		System.out.println("1. Crear Learning Path");
        System.out.println("2. Crear Actividad");
        System.out.println("3. Salir");
        System.out.print("Elija una opción: ");
        int option = scanner.nextInt();
        scanner.nextLine(); 
        
        switch(option) {
        case 1: 
        	String nombre = profesor.getNombre();
        	System.out.println(nombre);
        	System.out.println("Aun no ha sido implementado");
        	break;
        case 2: 
        	System.out.println("Aun no ha sido implementado");
        	break;
        	
        case 3:
        	correrProfesor = false;
        	System.out.println("Chao!");
        	return;
        }
		}
	}
	
	public static void estudianteMenu( Scanner scanner, Estudiante estudiante) {
		boolean correrEstudiante = true;
		while (correrEstudiante) {
		System.out.println("Menu estudiante:");
		System.out.println("1. Registrar Learning Path");
        System.out.println("2. Hacer Actividad");
        System.out.println("3. Salir");
        System.out.print("Elija una opción: ");
        int option = scanner.nextInt();
        scanner.nextLine(); 
        switch(option) {
        case 1: 
        	String nombre = estudiante.getNombre();
        	System.out.println(nombre);
        	System.out.println("Aun no ha sido implementado (ver codigo)");
        	break;
        case 2: 
        	System.out.println("Aun no ha sido implementado (ver codigo)");
        	break;

        	
        case 3:
        	correrEstudiante = false;
        	System.out.println("Chao!");
        	return;
        }
	}
	}
	
	public static void main(String[] args) {
		new Principal(args);
	}
	
}
