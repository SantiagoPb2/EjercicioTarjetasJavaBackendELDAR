package santiagofdez.app.ejercicio.model;

public class Amex extends Marca{
	
	public Amex() {
		super("American Express");
	}

	@Override
	public Double getTasa() {
		double tasa = 0.0;
		if(getMonth() * 0.1 < getPorcentajeMinimo()) {
			tasa = getPorcentajeMinimo();
		}else if(getMonth() * 0.1 > getPorcentajeMaximo()){
			tasa = getPorcentajeMaximo();		
		}else {
			tasa = (double) getMonth() * 0.1;
		}
		return tasa;
	}

	@Override
	public String toString() {
		return "[Nombre de Marca: " + getNombreMarca() + ", Tasa de servicio: " + getTasa() + "]";
	}

}
