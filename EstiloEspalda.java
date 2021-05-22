package examen;

public class EstiloEspalda extends Estilo {
	
	private final tipoEstilo estilo4 = tipoEstilo.espalda;
	public EstiloEspalda(){
		System.out.println("Tipo de estilo : "+estilo4);
	}
	@Override
	public void movimientoBrazos() {
		System.out.println("Alternancia de Brazos");
		
	}

	@Override
	public void movimientoPiernas() {
		System.out.println("Batido alternado de piernas");
		
	}

	@Override
	public void respiracion() {
		System.out.println("Respiracion boca arriba");
		
	}

}
