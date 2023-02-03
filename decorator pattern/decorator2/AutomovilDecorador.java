package decorator2;

public abstract class AutomovilDecorador implements Automovil{
	
	private Automovil auto;
	
	public AutomovilDecorador(Automovil auto) {
		this.auto=auto;
	}
	
	protected Automovil getAuto() {
		return auto;
	}
}

