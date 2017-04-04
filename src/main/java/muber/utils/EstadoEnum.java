package muber.utils;

public enum EstadoEnum {

	ABIERTO("Abierto"),
	FINALIZADO("Finalizado");
	
	private String value;
	
	private EstadoEnum(String value){
		this.value = value;
	}
	
	public String toString() {
		return this.value;
	}
}
