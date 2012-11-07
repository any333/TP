package com.wordpress.any333.h10;

import com.wordpress.any333.h10.Ball;

public class Box extends BallContainer {

	private int size;

	public Box(int size) {
		this.size = size;
	}

	public void add(Ball ball) throws Exception {
		if (!contains(ball) && size() < size) {
			PlaceInConateiner.add(ball);
		} else {
			throw new Exception("Need more place...");
		}
	}

	public Ball getBallsFromSmallest() {
		return new Ball();
	}
}