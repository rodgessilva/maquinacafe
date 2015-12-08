public abstract class Moca extends CafeDecorator {

    public Moca() {
        super(new Leite(new Chocolate( new Acucar(new Expresso()))) );


    }
	@Override
	public void preparar() {
		
		System.out.println("Café Moca");
                super.preparar();
	}



}
