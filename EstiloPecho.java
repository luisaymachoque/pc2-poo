package examen;

public class EstiloPecho extends Estilo{
	private final tipoEstilo estilo1= tipoEstilo.pecho;
	public void EstiloEspalda() {
		System.out.println("Tipo de estilo : "+estilo1);
	}
	@Override
	public void movimientoBrazos() {
		System.out.println("Brazada de Pecho");
		
	}

	@Override
	public void movimientoPiernas() {
		System.out.println("Patada de Rana");
		
	}

	@Override
	public void respiracion() {
		System.out.println("respiracion Plano frontal");
		
	}
	
	

}
