package Utilidades;


import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;

import Anotaciones.Anotacion1;

public class Principal {

	public static void main(String[] args) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, InstantiationException {
		// TODO Auto-generated method stub
		
		/*Persona p = new Persona();
		List<Field> atributos = UBean.obtenerAtributos(p);

		for(Field f : atributos) 
		{
			System.out.println(f.getName());
		}
		
		UBean.ejecutarSet(p,"nombre","Jose");
		UBean.ejecutarSet(p,"apellido","JuanFrancoGomildez");
		UBean.ejecutarSet(p,"dni","32489789");
		UBean.ejecutarSet(p,"edad",34);
		System.out.println(UBean.ejecutarGet(p, "nombre"));
		System.out.println(UBean.ejecutarGet(p, "apellido"));
		System.out.println(UBean.ejecutarGet(p, "dni"));
		System.out.println(UBean.ejecutarGet(p, "edad"));*/
		
		try{
		/*Class c = Persona.class;
		Method[] m = c.getDeclaredMethods();

			for(Method mt : m)
			{
				if(mt.getAnnotation(Anotacion1.class)!=null)
				{
					//System.out.println(mt.getName());
					mt.invoke(c.newInstance(), null);
				} 
			}*/
			
			Class c = Persona.class;
			Method[] metodos = c.getDeclaredMethods();
			for(Method mt : metodos)
			{
				if(mt.getAnnotation(Anotacion1.class)!=null)
				 {
					
					Anotacion1 miAnotacion = mt.getAnnotation(Anotacion1.class);
					System.out.println(miAnotacion.nombre2());
					for(int i=0;i<miAnotacion.intentos();i++)
					{
						mt.invoke(c.newInstance(), null);
					}
				 }
			}
		}
		
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
			
			

	}
	

}
