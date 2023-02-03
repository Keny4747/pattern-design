package decorator2;

public class Main {
	public static void main(String[] args) {
		
		Automovil  carro = new AutoElectricoFeature(new CarroStandar("Chevy"));
		carro.start();
		carro.accel();
		carro.stop();
		System.out.println("-----------------------------------");
		Automovil carro2 = new AutoPetrolero(new CarroStandar("Susuki"));
		carro2.start();
		carro2.accel();
		carro2.stop();
	}

}
