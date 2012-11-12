/*
Училище - Технологично училище "Електронни системи" към ТУ-София{ www.elsys-bg.org }
Клас - 11Б клас
Номер - 3
Име - Анна-Мария Верева Матейна

Задача - Да се направи програма имитираща местата в самолет - 27 реда, 2 колони[по 3 места в колона]. Де се подреждт пътниците в самолета, докато той не се напълни, и ако са повече от един да не бъдат разделяни. 
*/

import java.util.Random;

public class AirPlane{

	private int[][] seats = new int[6][27];
	private boolean full = false;
public void PrintSeats(){
	for(int c = 0; c < 27; c++){
		for(int n = 0; n < 6; n++){
			System.out.print(seats[n][c]);
			if(n == 2){
				System.out.print(" ");
			}
		}
		System.out.println();
	}
}
public void Add(int value){
	for(int r = 0; r < 27; r++){
		for(int k = 0; k < 6; k++){
			if(seats[k][r] == 0){
				if(value == 1){
					seats[k][r] = 1;
					full = true;
					break;
				}
						
				if(value == 2 && k<=4){
					if(seats[k+1][r] == 0 && k%3 <=1){
						seats[k][r] = 2;
						seats[k+1][r] = 2;
						full = true;
						break;
					}
				}
						
				if(value == 3 && k<=3){
					if(seats[k+1][r] == 0 && seats[k+2][r] == 0 && k%3 == 0){
						seats[k][r] = 3;
						seats[k+1][r] = 3;
						seats[k+2][r] = 3;
						f=true;
						break;
					}
				}
			}else{
				continue;
			}
		}
		if(full == true){
			break;
		}
	}
	if(full == false){
		System.out.println("Stop");
	}
}
public int FreeSeats(){
	int c = 0;
	for(int r = 0; r < 27; r++){
		for(int k = 0; k < 6; k++){
			if(seats[r][k] == 0){
				c++ ;
			}
		}
	}
	return c;
}
public static void main(String args[]){
	AirPlane plane = new AirPlane();	
	plane.PrintSeats();
	System.out.println("#######");
		while(plane.FreeSeats() != 0){
			int value = new Random().nextInt(3)+1;
			plane.Add(value);
		}
	plane.PrintSeats();
	}
}


