package View;

import processing.core.PApplet;
import processing.core.PImage;

public class RatV extends ObjectsV{
	PImage img4;
	RatV(int posX, int posY, int w, int h, PApplet app) {
		super(posX, posY, w, h, app);
		this.img4= app.loadImage("ratones.png");
		}
		
		void paint() {
			app.image(this.img4,this.posX,this.posY,this.w,this.h);
		}
		
		
		void advice() {
			if(dist(this.posX+100, this.posY+30, app.mouseX, app.mouseY)<=120) {
				app.cursor(HAND);
					}else {
						app.cursor(ARROW);
			}
			
		}
		void interact() {
			if(dist(this.posX+100, this.posY+30, app.mouseX, app.mouseY)<=120) {
				app.cursor(HAND);
				this.w+=10;
				this.h+=10;
			}else {
				app.cursor(ARROW);
			}
			
		}
}
