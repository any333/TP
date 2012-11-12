package com.wordpress.any333.h11;

public class AirPlane {

	private Person[][] seats = new Person[6][27];
	private boolean full = false;

	public void PrintSeats() {
		for (int r = 0; r < 27; r++) {
			for (int k = 0; k < 6; k++) {
				System.out.print(seats[k][r]);
				if (k == 2) {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

	public void Add(int value, Person one) {
		for (int r = 0; r < 27; r++) {
			for (int k = 0; k < 6; k++) {
				if (seats[k][r] == null) {
					if (full == false && value == 1) {
						seats[k][r] = one;
						full = true;
						break;
					}
				}
			}
		}
	}

	public void Add(int value, Person one, Person two) {
		for (int r = 0; r < 27; r++) {
			for (int k = 0; k < 6; k++) {
				if (value == 2 && k + 1 == 6) {
					if (seats[k + 1][r] == null && seats[k][r] == null
							&& full == false && k != 2) {
						seats[k][r] = one;
						seats[k + 1][r] = two;
						full = true;
						break;
					}
				}
			}
		}
	}

	public void Add(int value, Person one, Person two, Person three) {
		for (int r = 0; r < 27; r++) {
			for (int k = 0; k < 6; k++) {
				if (value == 3 && k + 2 >= 6) {
					if (seats[k + 1][r] == null && seats[k + 2][r] == null
							&& seats[k][r] == null && full == false && k != 1
							&& k != 2) {
						seats[k][r] = one;
						seats[k + 1][r] = two;
						seats[k + 2][r] = three;
						full = true;
						break;
					}
				}
			}
			if (full == true)
				break;
		}
	}

	public int FreeSeats() {
		int c = 0;
		for (int r = 0; r < 27; r++) {
			for (int k = 0; k < 6; k++) {
				if (seats[k][r] == null) {
					c++;
				}
			}
		}
		return c;
	}

	public int Males() {
		int m = 0;
		for (Person[] i : seats) {
			for (Person j : i) {
				if (j != null) {
					if (j.getGender() == "Male") {
						m++;
					}
				}

			}

		}
		return m;
	}

	public int Females() {
		int fe = 0;
		for (Person[] i : seats) {
			for (Person j : i) {
				if (j != null) {
					if (j.getGender() == "Female") {
						fe++;
					}
				}

			}

		}
		return fe;
	}

	public void Remove(Person one) {
		boolean deleted = false;
		for (int r = 0; r < 27; r++) {
			for (int k = 0; k < 6; k++) {
				if (seats[k][r] != null) {
					if (seats[k][r].getName() == one.getName()
							&& deleted == false) {
						seats[k][r] = null;
						deleted = true;
					}
				}
			}

		}
		if (deleted == false) {
			System.out.println(" ");
		}
	}

	public void Clear() {
		for (int r = 0; r < 27; r++) {
			for (int k = 0; k < 6; k++) {
				if (seats[k][r] != null) {
					seats[k][r] = null;
				}
			}
		}

	}
}