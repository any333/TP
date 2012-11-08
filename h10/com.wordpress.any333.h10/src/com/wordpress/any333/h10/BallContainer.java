package com.wordpress.any333.h10;

import java.util.ArrayList;

public class BallContainer {
	private int freeSpace = 5;
	private ArrayList<Ball> BallContainer = new ArrayList<Ball>(freeSpace);

	public void add(Ball ball) {
		if (BallContainer.size() != freeSpace) {
			if (!BallContainer.contains(ball)) {
				BallContainer.add(ball);
			} else {
				System.out.println("The ball already exist.");
			}
		} else {
			System.out.println("Full container.");
		}

	}

	public void remove(Ball ball) {
		BallContainer.remove(ball);
	}

	public void size() {
		System.out.println(freeSpace);
	}

	public void getCapacity() {
		System.out.println(freeSpace - BallContainer.size());
	}

	public void contains(Ball ball) {
		System.out.println(BallContainer.contains(ball));
	}

	public void clear() {
		BallContainer.clear();
	}
}
