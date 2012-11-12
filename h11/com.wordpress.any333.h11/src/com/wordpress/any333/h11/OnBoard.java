package com.wordpress.any333.h11;

import java.util.Random;

public class OnBoard {
	public static void main(String[] args) {
		AirPlane plane = new AirPlane();
		int Crew;
		while (plane.FreeSeats() != 0) {
			Crew = (int) new Random().nextInt(2) + 1;
			for (int i = 0; i < Crew; i++) {
				if (Crew == 1) {
					Person one = new Person();
					plane.Add(Crew, one);
				} else {
					if (Crew == 2) {
						Person one = new Person();
						Person two = new Person();
						plane.Add(Crew, one, two);
					} if (Crew == 3) {
						Person one = new Person();
						Person two = new Person();
						Person three = new Person();
						plane.Add(Crew, one, two, three);
					}
				}
			}
		}
		plane.Clear();
		Person man = new Person();
		man.setName("Victoria");
		man.setGender("Female");
		plane.Add(2, man);
		plane.Remove(man);
		System.out.println("Males passenger are " + plane.Males());
		System.out.println("Females passenger are " + plane.Females());
	}
}