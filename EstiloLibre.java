package examen;

public class EstiloLibre extends Estilo {
	private final tipoEstilo estilo3= tipoEstilo.libre;
	public void EstiloEspalda() {
		System.out.println("Tipo de estilo : "+estilo3);
	}

	@Override
	public void movimientoBrazos() {
		System.out.println("Alternacia de Brazos");
		
	}

	@Override
	public void movimientoPiernas() {
		System.out.println("Batido alternado de piernas");
		
	}

	@Override
	public void respiracion() {
		System.out.println("Respiracion Lateral");
		
	}

}
