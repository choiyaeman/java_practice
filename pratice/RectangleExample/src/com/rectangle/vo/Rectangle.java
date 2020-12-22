package com.rectangle.vo;

public class Rectangle {
	private int x;
	private int y;
	private int width;
	private int height;

	public int square() {
		return (width * height);
	}

	public void show() {
		System.out.println("좌표:" + "(" + x + "," + y + ")" + "사각형 넓이:" + "widht" + "*" + "height" + "인 사각형");
	}

	public boolean contains(Rectangle r) {
		if (x < r.x && this.y < r.y)
			if ((width + x) > (r.x + r.width) && (height + y) > (r.y + r.height))
				return true;
		return false;
	}

	public Rectangle(int x, int y, int width, int height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

}
