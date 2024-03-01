package Muniemon_01;

public class Muniemon {
	private String nombre;
	private int vida;
	private int ataque;
	private int defensa;
	private Enum_Muniemon tipo;

	// Constructor
	public Muniemon(String nombre, int vida, int ataque, int defensa, Enum_Muniemon tipo) {
		this.nombre = nombre;
		this.vida = vida;
		this.ataque = ataque;
		this.defensa = defensa;
		this.tipo = tipo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getVida() {
		return vida;
	}

	public void setVida(int vida) {
		this.vida = vida;
	}

	public int getAtaque() {
		return ataque;
	}

	public void setAtaque(int ataque) {
		this.ataque = ataque;
	}

	public int getDefensa() {
		return defensa;
	}

	public void setDefensa(int defensa) {
		this.defensa = defensa;
	}

	public Enum_Muniemon getTipo() {
		return tipo;
	}

	public void setTipo(Enum_Muniemon tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "Muniemon{" + "nombre='" + nombre + '\'' + ", vida=" + vida + ", ataque=" + ataque + ", defensa="
				+ defensa + ", tipo=" + tipo + '}';
	}
}
