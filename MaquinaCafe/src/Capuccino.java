public abstract class Capuccino extends CafeDecorator {

    public Capuccino() {
        super(new Leite(new Canela (new Creme( new Acucar(new Expresso()))) ));


    }
	@Override
	public void preparar() {
		
		System.out.println("Café Capuccino");
                super.preparar();
	}



}
