/**
 * Esta clase me va a servir para aprender a documentar con javadoc
 * @author DIOS Cesar
 * @version 0.0.2
 * @see <a href="https://twitter.com/ceesargarridor"/>
 * @see <a href="https://docs.oracle.com/javase/7/docs/api/" />
 * @since 12/04/2023
 */

package ies;

public class Empleado {
	private int emp_no;
	private String nombre;
	private String apellido;
	private String pobla;
	private String oficio;
	private Double salario;

	/**
	 * La inicializacion de los atributos numero de empleado,
	 * nombre,apellido,poblacion,oficio,salario
	 * 
	 * @param emp_no   numero de empleado
	 * @param nombre   nombre del empleado
	 * @param apellido appellido del empleado
	 * @param pobla    poblacion del empleado
	 * @param oficio   oficio del empleado
	 * @param salario  salario del empleado
	 */
	public Empleado(int emp_no, String nombre, String apellido, String pobla, String oficio,
			Double salario) {
		this.emp_no = emp_no;
		this.nombre = nombre;
		this.apellido = apellido;
		this.pobla = pobla;
		this.oficio = oficio;
		this.salario = salario;

	}

	/**
	 * La inicializacion de los atributos nmero de
	 * empleado,nombre,salario
	 * 
	 * @param emp_no  numero del empleado
	 * @param nombre  nombre del empleado
	 * @param salario salario del empleado
	 */
	public Empleado(int emp_no, String nombre, Double salario) {
		this.emp_no = emp_no;
		this.nombre = nombre;
		this.salario = salario;
	}

	/**
	 * un metodo getter sobre numero de empleado
	 * 
	 * @return el numero de empleado del objeto
	 */
	public int getEmp_no() {
		return emp_no;
	}

	/**
	 * metodo setter de numero de empleado
	 * 
	 * @param emp_no numero del empleado
	 */
	public void setEmp_no(int emp_no) {
		this.emp_no = emp_no;
	}

	/**
	 * un metodo getter sobre numero de empleado
	 * 
	 * @return nombre del empleado
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * metodo setter de nombre de empleado
	 * 
	 * @param nombre nombre del empleado
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * metodo getter de poblacion
	 * 
	 * @return poblacion del empleado
	 */
	public String getPobla() {
		return pobla;
	}

	/**
	 * metodo setter de poblacion
	 * 
	 * @param pobla poblacion del empleado
	 */
	public void setPobla(String pobla) {
		this.pobla = pobla;
	}

	/**
	 * metodo getter de oficio
	 * 
	 * @return oficio del empleado
	 */
	public String getOficio() {
		return oficio;
	}

	/**
	 * metodo setter del oficio de empleado
	 * 
	 * @param oficio del empleado
	 */
	public void setOficio(String oficio) {
		this.oficio = oficio;
	}

	/**
	 * metodo getter de salario
	 * 
	 * @return salario del empleado
	 */
	public Double getSalario() {
		return salario;
	}

	/**
	 * metodo setter de salario
	 * 
	 * @param salario del empleado
	 */
	public void setSalario(Double salario) {
		this.salario = salario;
	}

	/**
	 * metodo que establece la subida de salario
	 * 
	 * @param subida del salario
	 */
	public void subidasalario(Double subida) {
		salario = salario + subida;
	}

	/**
	 * metodo que comprueba
	 * 
	 * @return booleano
	 */
	private boolean comprobar() {
		if (nombre.equals("")) {

			return false;
		}
		return true;
	}
}