package co.edureka.except;

public class InvalidAgeException extends RuntimeException {
 public InvalidAgeException() {}
 
 public InvalidAgeException(String msg) {
	 super(msg);
 }
}
