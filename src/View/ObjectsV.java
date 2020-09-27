package View;

import processing.core.PApplet;
import processing.core.PImage;

public class ObjectsV extends PApplet {

	PImage img;
	int posX;
	int posY;
	int w;
	int h;
	PApplet app;
	
		ObjectsV(int posX, int posY, int w, int h, PApplet app){
			this.posX=posX;
			this.posY=posY;
			this.w=w;
			this.h=h;
			this.app=app;
		}
		
		void paint(){
			
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

		public int getW() {
			return w;
		}

		public void setW(int w) {
			this.w = w;
		}

		public int getH() {
			return h;
		}

		public void setH(int h) {
			this.h = h;
		}
		
		
}
