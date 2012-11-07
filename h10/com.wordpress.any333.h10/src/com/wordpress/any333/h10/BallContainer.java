package com.wordpress.any333.h10;

import com.wordpress.any333.h10.Ball;
import java.util.*;

public class BallContainer {

	protected LinkedList<Ball> PlaceInConateiner;

	public void add(Ball ball) throws Exception {
		if (!contains(ball)) {
			PlaceInConateiner.add(ball);
		} 
	}

	public int size() {
		return PlaceInConateiner.size();
	}

	public void remove(Ball ball) {
		PlaceInConateiner.remove(PlaceInConateiner.indexOf(ball));
	}

	public void clear() {
		PlaceInConateiner.clear();
	}

	public boolean contains(Ball ball) {
		return PlaceInConateiner.contains(ball);
	}
}