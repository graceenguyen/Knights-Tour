package code;
//KNIGHTS GAME
public class main {

	public static void main(String[] args) {
		LinkedGrid LG = new LinkedGrid(5);
		
//		LG.display();
		
//		LG.display();
		LG.flood(LG.getFirst(), 1);
//		LG.display();
		
	}

}
