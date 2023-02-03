package decorator2;

public class AutoElectricoFeature extends AutomovilDecorador{

	public AutoElectricoFeature(Automovil auto) {
		super(auto);
	}
	
	@Override
	public void accel() {
		System.out.println("Iniciando electricamente");
		getAuto().accel();
		
	}

	@Override
	public void stop() {
		System.out.println("Controlando frenos electronicos");
		getAuto().stop();	
	}

	@Override
	public void start() {
		System.out.println("Iniciando el sistema operativo");
		getAuto().start();
	}

}
