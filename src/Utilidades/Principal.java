package Utilidades;


import java.lang.reflect.Field;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Persona p = new Persona();
		List<Field> atributos = UBean.obtenerAtributos(p);

		for(Field f : atributos) 
		{
			System.out.println(f.getName());
		}
		
		UBean.ejecutarSet(p,"nombre","Jose");
		UBean.ejecutarSet(p,"apellido","JuanFrancoGomildez");
		UBean.ejecutarSet(p,"dni",32489789);
		UBean.ejecutarSet(p,"edad",34);
		System.out.println(UBean.ejecutarGet(p, "nombre"));
		System.out.println(UBean.ejecutarGet(p, "apellido"));
		System.out.println(UBean.ejecutarGet(p, "dni"));
		System.out.println(UBean.ejecutarGet(p, "edad"));

	}

}
