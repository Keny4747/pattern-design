package decorator2;

public class CarroStandar implements Automovil{
	
	private String nombre;
	
	public CarroStandar(String s) {
		this.nombre=s;
	}

	@Override
	public void accel() {
		System.out.println("Aceleración estandar");	
	}

	@Override
	public void stop() {
		System.out.println("Frenar");
	}

	@Override
	public void start() {
		System.out.println("Prendiendo el carro");
	}
	
	
}
