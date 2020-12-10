
public class Doggos {
	
	public Doggos() {
		
	}
	
	public static String checkWinner(int winner) {
		int iterator = 0;
		String currentPlace = "";
		for (int hun = 0; hun < 10; hun++) {
			for( int tens = 0; tens <=9; tens ++) {
				if (iterator == winner) {
					
				} else {
					 if (hun > 0 && hun <2) {
						 currentPlace += (iterator + "th, ");
					} else if (tens == 1 &&  (hun > 1 ||  hun ==0)) {
						currentPlace += (iterator + "st, ");
					} else if (tens ==2 && (hun > 1 ||  hun ==0)) {
						currentPlace += (iterator + "nd, ");
					} else if (tens == 3 &&  (hun > 1 ||  hun ==0)) {
						 currentPlace += (iterator + "rd, ");
					} else if (tens > 3 &&  (hun > 1 ||  hun ==0)) {
						currentPlace += (iterator + "th, ");
					}
					if (iterator % 10 == 0) {
						 currentPlace += "\n";
					}
				}
				iterator++;
				if (winner == 100) {
					
				} else if (iterator ==100) {
					currentPlace += "100th";
				}
			}
		}
		return currentPlace;
	}
	
	
}
