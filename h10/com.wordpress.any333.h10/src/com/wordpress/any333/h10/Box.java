package com.wordpress.any333.h10;

public class Box {

	public static void main(String[] args) {
		BallContainer Container = new BallContainer();
		Ball ball = new Ball(1);
		Ball ball1 = new Ball(2);
		Ball ball2 = new Ball(3);
		Ball ball3 = new Ball(4);
		Ball ball4 = new Ball(5);
		Container.add(ball);
		Container.add(ball1);
		Container.add(ball3);
		Container.add(ball2);
		Container.remove(ball);
		Container.remove(ball1);
		Container.remove(ball3);
		Container.getCapacity();
		Container.size();
		Container.contains(ball1);
		Container.contains(ball4);
		Container.clear();
	}
}