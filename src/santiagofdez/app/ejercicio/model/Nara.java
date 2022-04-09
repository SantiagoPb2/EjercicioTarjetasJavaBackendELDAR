package santiagofdez.app.ejercicio.model;

public class Nara extends Marca{

	public Nara(String nombre) {
		super(nombre);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Double getTasa() {
		double tasa = 0.0;
		if(getDay() * 0.5 < getPorcentajeMinimo()) {
			tasa = getPorcentajeMinimo();
		}if(getDay() * 0.5 > getPorcentajeMaximo()){
			tasa = getPorcentajeMaximo();		
		}else {
			tasa = getDay() * 0.5;
		}
		return tasa;
	}

	@Override
	public String toString() {
		return "[Nombre de Marca: " + getNombreMarca() + ", Tasa de servicio: " + getTasa() + "]";
	}
	
	

}
