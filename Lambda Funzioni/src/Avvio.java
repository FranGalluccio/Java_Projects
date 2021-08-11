public class Avvio {

	public static void main(String[] args) {
		
//		Figura2D fig = new Cerchio(); //upcasting
//		fig.calcArea();
		
		//Questo è un oggetto di classe anonima
		//Una classe anonima è una classe NON
		//dichiarata esplicitamente, figlia della classe astratta
		Figura2D quadrato = new Figura2D() {

			@Override
			public Double calcArea() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public Double calcPerim() {
				saluto();
				// TODO Auto-generated method stub
				return null;
			}
			
			public void saluto() {
				System.out.println("Ciao sono un quadrato");
			}
			
		};
		
		quadrato.calcArea();
		quadrato.calcPerim();
		
		
		//Costruzione classica di un oggetto di classe anonima
		IFigura3D cilindroClassic = new IFigura3D() {

			@Override
			public Double calcVolume(Double area, Double altezza) {
				return area*altezza;
			}
		};
		System.out.println(cilindroClassic.calcVolume(4.5, 7.3));
		
		//Costruzione di un oggetto di classe anonima con lambda ex.
		IFigura3D cilindroLambda = (area,altezza)-> area*altezza;
		System.out.println(cilindroLambda.calcVolume(4.5, 7.3));
		
		//NB:Requisiti espressioni per usare le lambda exp.
		//1)Si usano solo le interfacce
		//2)L'interfaccia non deve avere più di un metodo astratto
		
		IFigura3D conoLambda = (area,altezza)-> {
			Double lato1=78.9;
			final Double PIGRECO=3.14;
			System.out.println("Fa caldo!!!"+lato1+","+PIGRECO);
			for(int i=1; i<=10; i++)
				System.out.println(i);
			return area*altezza;
		};
		System.out.println(conoLambda.calcVolume(78.3, 45.1));
		
		IFigura3D figura2d = (area, altezza)->{
			return area * altezza / 2;
		};
	}
}