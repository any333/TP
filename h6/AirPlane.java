import java.util.Random;

public class AirPlane {

	private int[][] seats = new int[6][27];

	public void print_seats() {
		for(int c=0; c<27; c++) {
			for(int n=0; n<6; n++) {
				System.out.print(seats[c][n]);
				if(n==2) {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	
	public void add(int value) {
		for(int i=0; i<value; i++) {
			seats[i][0] =1;
		}
		
	}
	
	public void freeSeats() {
		
	}
	
	public static void main(String args[]) {
		AirPlane plane = new AirPlane();		
	    plane.print_seats();
	    plane.add(2);
	    System.out.println("#####");
	    plane.print_seats();
		
		/*int p=0;
		int counter=0;
		for(int i=0; p<162; i++) {
				int rvalue = new Random().nextInt(3)+1;
				plane.add(rvalue);
				
				counter +=1;
				if((p+rvalue)<=162) {
					p+=rvalue;
				}
					
		}*/
		//System.out.println("Places " + p);
		//System.out.println("Iterations " + counter);
	} 

}
