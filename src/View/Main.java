package View;

import Model.User;
import processing.core.PApplet;

public class Main extends PApplet{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PApplet.main(Main.class.getName());
	}
	
	User user;
	ChildrenV child;
	FlautistV flaut;
	SignV sign;
	MayorV mayor;
	RatV rat;
	StartScreen start;
	FinalScreen fin;
	static GameScreen gameS;
	static int screen;
	
	
	public void settings() {
		size(869,653);
	}
	
	public void setup() {
		user = new User("Mija", this);
		child = new ChildrenV(/*1001*/ 651, 249, 437, 378, this);
		flaut = new FlautistV(521,113,283,509, this);
		sign = new SignV(0,0,206,78,this);
		mayor = new MayorV(733,161,162,378,this);
		rat = new RatV(28,374,231,105,this);
		start = new StartScreen(0,0, this);
		fin = new FinalScreen(0,0,this);
		gameS = new GameScreen(0,0,this);
		screen =0;
		user.createArrayList();
		
			
	}
	
	public void draw() {
		background(255);
		gameS.paint();
		
		switch(screen) {
		case 0:
			start.paint();
			
			break;
			
		case 1: 
			gameS.paint();
			mayor.paint();
			flaut.paint();
			rat.paint();
			sign.paint();
			
			
			if(gameS.getPosX()<=-188) {
			child.paint();
		
			}
			break;
			
		case 2: 
			fin.paint();
			break;
		}
		
		fill(0);
		textSize(20);
		text(mouseX + "X"+ " " + mouseY + "Y", mouseX, mouseY);
	}
	
	public void mouseMoved() {//lineas de codigo para que cuando el mouse pase por encima
		//de algun objeto de interaccion el cursor cambie y el usuario entienda que es posible interactuar.
		switch(screen) {
		case 0:
			start.change();
			
			break;
			
		case 1: 
		rat.advice();
		mayor.advice();
		flaut.advice();
			if(start.getPosX()<=-188) {
				
				child.advice();
				}
		
			break;
			
		case 2: 
			
			break;
	}
	}
	
	public void mousePressed() {
		switch(screen) {
		case 0:
			start.change();
			
			break;
			
		case 1: 
			
			rat.interact();
			mayor.interact();
			flaut.interact();
			
			if(start.getPosX()<=-188) {
				
				child.interact();
				}
		
			break;
			
		case 2: 
			
			break;
		}
		
		
		
	}
	
	
}
