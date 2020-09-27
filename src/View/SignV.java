package View;

import processing.core.PApplet;
import processing.core.PImage;

public class SignV extends ObjectsV{
	PImage img5;
	boolean paint1;
	SignV(int posX, int posY, int w, int h, PApplet app) {
		super(posX, posY, w, h, app);
		this.img5= app.loadImage("ERSenal.png");
		this.paint1=true;
		}
		
		void paint() {
			if(paint1==true) {
			app.image(this.img5,this.posX,this.posY,this.w,this.h);
		} 
		}
		
		void advice() {
			if(dist(this.posX+85, this.posY+40, app.mouseX, app.mouseY)<=80) {
				app.cursor(HAND);
					}else {
						app.cursor(ARROW);
			}
			
		}
		
		void interact() {
			if(dist(this.posX+85, this.posY+40, app.mouseX, app.mouseY)<=80) {
				this.w+=20;
				this.h+=20;
					}
		}
}
