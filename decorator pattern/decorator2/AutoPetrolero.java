package decorator2;

public class AutoPetrolero extends AutomovilDecorador{
	

	public AutoPetrolero(Automovil auto) {
		super(auto);
	}

	@Override
	public void accel() {
		System.out.println("Inyectando petroleo");
		getAuto().accel();
	}

	@Override
	public void stop() {
		System.out.println("Aplicando embrague y freno");
		getAuto().stop();
	}

	@Override
	public void start() {
		System.out.println("Calentando motor");
		getAuto().start();
	}
	
	
}
