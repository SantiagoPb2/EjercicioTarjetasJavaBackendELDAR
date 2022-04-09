package santiagofdez.app.ejercicio.model;

public class Visa extends Marca {

	public Visa() {
		super("Visa");
	}

	@Override
	public Double getTasa() {
		double tasa = 0.0;
		if((double)getYear() / getMonth() < getPorcentajeMinimo()) {
			tasa = getPorcentajeMinimo();
		}
		if((double)getYear() / getMonth() > getPorcentajeMaximo()){
			tasa = getPorcentajeMaximo();		
		}else {
			tasa = (double)getYear() / getMonth();
		}
		return tasa;
	}

	@Override
	public String toString() {
		return "[Nombre de Marca: " + getNombreMarca() + ", Tasa de servicio: " + getTasa() + "]";
	}

}
