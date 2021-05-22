package examen;

public class EstiloMariposa extends Estilo {
	private final tipoEstilo estilo2= tipoEstilo.mariposa;
	public void EstiloEspalda() {
		System.out.println("Tipo de estilo : "+estilo2);
	}
	@Override
	public void movimientoBrazos() {
		System.out.println("Movimiento simulataneo de brazos");
		
	}

	@Override
	public void movimientoPiernas() {
		System.out.println("Batido alternado de piernas");
		
	}

	@Override
	public void respiracion() {
		System.out.println("respiracion Plano frontal");
		
	}

}
