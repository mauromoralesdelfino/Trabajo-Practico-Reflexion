package Anotaciones;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.junit.Test;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface Anotacion1 {

 public	int intentos();
 String nombre() default "Sin Nombre";
 String nombre2();

	
}
