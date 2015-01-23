public class Board {
	// Initialise variables
	private String position[] = new String[9]; // 0 - 8 grid positions.
	
	// Constructor
	public Board() {
		for(int x = 0; x < 9; x++) {
			this.position[x] = null;
		}
	}
	
	// Getter Methods
	public String getPosition(int x) {
		return this.position[x];
	}
	
	// Setter Methods
	public void setPosition(int x, String value) {
		this.position[x] = value;
	}
	
	// Text Representation
	@Override
	public String toString() {
		int cell = 0;
		for(int y = 1; y <= 3; y++) {
			for(int x = 1; x <= 3; x++) {
				if (x > 1) {
					System.out.print(" | ");
				}
				
				if (this.position[cell] == null) {
					System.out.print("   ");
				} else {
					System.out.print(" " + this.position[cell] + " ");
				}
				cell = cell + 1;
			}
			System.out.println("");
			if (y < 3) {
				System.out.println("----------------");
			}
		}
		
		return "yo";
		
	}
	

	
	public static void main(String[] args) {
		Board aBoard = new Board();
		aBoard.setPosition(7, "X");
		aBoard.setPosition(4, "O");
		aBoard.setPosition(6, "X");
		aBoard.toString();
		
	}
}


