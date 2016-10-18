import jade.Boot;
public class Main {

	public static void main(String[] args) {
		System.out.println("Hello Jade.");
		String[] param = new String[ 1 ];
		param[ 0 ] = "-gui";
		Boot.main( param );

	}

}
