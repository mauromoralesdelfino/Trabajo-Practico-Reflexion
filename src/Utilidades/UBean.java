package Utilidades;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;

public class UBean {
/*
 * 1. Dentro del paquete “Utilidades” se debe crear una clase llamada UBean, la cual
constara de 3 métodos públicos y estáticos:

a. obtenerAtributos(Object): Devuelve un ArrayList<Field> con todos los atributos
que posee el parámetro Object.

b. ejecutarSet(Object o, String att, Object valor): Se debe ejecutar el método
Setter del String dentro del Object.

c. ejecutarGet(Object o, String att): devolverá el valor del atributo pasado por
parámetro, ejecutando el getter dentro del objeto.*/
	
	
	public static ArrayList<Field> obtenerAtributos(Object o)
	{
		ArrayList<Field> campos = new ArrayList<Field>();
		Field[] fields = o.getClass().getDeclaredFields();
		
		for(int i=0; i< fields.length;i++)
		{
		campos.add(fields[i]);
		}
		return campos;
		
	}
	
	/*b. ejecutarSet(Object o, String att, Object valor): Se debe ejecutar el método
	Setter del String dentro del Object.*/
	
	public static void ejecutarSet(Object o, String att, Object valor)
	{
		try
		{
			
			
			Method[] metodos = o.getClass().getDeclaredMethods();
			String aux = att.substring(0, 1).toUpperCase() +att.substring(1);
			String nombre = "set"+aux;
			
			for(Method misMet : metodos)
			{
				if(nombre.equals(misMet.getName()))
				{
					misMet.invoke(o, valor);
				}
			}
		
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
	
	public static Object ejecutarGet(Object o,String att)
	{
		Object obj = null;

		try
		{
			Method[] metodos = o.getClass().getDeclaredMethods();
			String aux = att.substring(0, 1).toUpperCase() +att.substring(1);
			String nombre = "get"+aux;
				
			
			for(Method misMet : metodos)
			{
				if(nombre.equals(misMet.getName()))
				{
					obj = misMet.invoke(o, new Object[0]);
				}
			}
			
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		
		return obj;
		
	}
	
	public void noHagonada()
	{
		/*package Clases;
		import java.lang.reflect.Field;
		import java.lang.reflect.Method;
		import java.util.ArrayList;

		public class Main {*/

			//public static void main(String[] args) {
				// TODO Auto-generated method stub
				/*
				 * Constructor[] co = clazz.getConstructor();
				 * 
				 * Object o = con[0].new Instance(Object[]);
				 * 
				 * 
				 * Persona P = new Persona();
				 * 
				 * Class c = p.getClass();
				 * 
				 * Field F = c.get.DeclaredField("nombre");
				 * f.setAccesible(true);
				 * Syso(f.get(p));
				 * f.set(p,"matias")
				 * 
				 * 
				 * 
				 * */
						
			/*	Persona persona = new Persona("Diego", "Gato", 0);
				Field[] fields = persona.getClass().getDeclaredFields();
				String field = fields[2].getName();
				
				try{
				
				String aux = field.substring(0,1).toUpperCase() + field.substring(1);
				
				String setterName = "set" + aux;
				Method setter = persona.getClass().getMethod(setterName, fields[2].getType());
				
				//ArrayList results = new ArrayList();
				//results.add(7);
				setter.invoke(persona, new Object[setter.getParameterCount()]);
				}
				catch(Exception ex){
				ex.printStackTrace();
				}
				
				
				for(Field f : fields)
				{
				
					String aux = field.substring(0,1).toUpperCase() + field.substring(1);
					String field2 = f.getName();
					try{
					
					String getterName = "get"+ aux;
					System.out.println(getterName);
					Method getter = persona.getClass().getMethod(getterName);
					
					System.out.println(field);
				
					Object value = getter.invoke(persona, new Object[0]);
					System.out.println(value);
					if(value == null){
						value = Main.emptyInstance(value.getClass().getName());
					}
					}//try
					catch(Exception ex)
					{
					ex.printStackTrace();
					}
				
				
				

			}//for
			}
			private static Object emptyInstance(String name) {
				//Este método crea una instancia de Class con el tipo
				//de dato obtenido por parámetro, y luego itera sobre
				//los Constructores de esta Clase para intentar
				//crear una Instancia en base a un Constructor Vacío
				Object obj = null;
				try {
					Class clazz = Class.forName(name);
					for (java.lang.reflect.Constructor con : clazz.getConstructors()) {
					if (con.getParameterTypes().length == 0) {
					obj = con.newInstance();
					break;
					}
					}
					} catch (Exception e) {
					return null;
					}
					return obj;
			}

		}
*/
		
	}
	
}
