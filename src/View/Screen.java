package View;

import processing.core.PApplet;

public class Screen extends PApplet{
	int posX;
	int posY;
	PApplet app;
	
	Screen(int posX, int posY, PApplet app){
		this.posX=posX;
		this.posY=posY;
	}
	
	void paint() {
		
	}
	
	void move() {
		this.posX= this.posX+5;
	}

	public int getPosX() {
		return posX;
	}

	public void setPosX(int posX) {
		this.posX = posX;
	}

	public int getPosY() {
		return posY;
	}

	public void setPosY(int posY) {
		this.posY = posY;
	}
	
}
