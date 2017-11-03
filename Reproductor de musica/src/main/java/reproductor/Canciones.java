package main.java.reproductor;

public class Canciones {
private String nombre;
private int año;
public Canciones(String nombre, int año) {
	
	this.nombre = nombre;
	this.año = año;
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public int getAño() {
	return año;
}
public void setAño(int año) {
	this.año = año;
}

}
