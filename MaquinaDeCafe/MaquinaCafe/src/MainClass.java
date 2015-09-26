
public class MainClass {
	public static void main(String[] args) {
		
		
		System.out.println("Primeiro Cafe Selecionado:");		
		Cafe cafe = new Creme( new Creme(new Expresso()));
                cafe.preparar();
                
                System.out.println("_________________________________");
                System.out.println("Segundo Cafe Selecionado:");

                cafe = new Creme(new Expresso());
                cafe.preparar();
                
                System.out.println("_________________________________");
                System.out.println("Terceiro Cafe Selecionado:");
                cafe = new Expresso();
                cafe.preparar();
                
                System.out.println("_________________________________");
                System.out.println("Quarto Cafe Selecionado:");
                cafe = new Acucar(new Creme(new Expresso()));
                cafe.preparar();
                
                System.out.println("_________________________________");
                System.out.println("Quinto Cafe Selecionado:");
                cafe = new Capuccino( new Expresso ()) {};
                cafe.preparar();
                                System.out.println("_________________________________");
                System.out.println("Quinto Cafe Selecionado:");
                cafe = new Moca( new Expresso ()) {};
                cafe.preparar();
                
                

	}

}
