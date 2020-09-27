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
	GameScreen gameS;
	int screen;
	
	
	public void settings() {
		size(869,653);
	}
	
	public void setup() {
		user = new User("Mija", this);
		child = new ChildrenV(0, 0, 437, 378, this);
		flaut = new FlautistV(0,0,283,509, this);
		sign = new SignV(0,0,206,78,this);
		mayor = new MayorV(0,0,162,378,this);
		rat = new RatV(0,0,467,212,this);
		start = new StartScreen(0,0, this);
		fin = new FinalScreen(0,0,this);
		gameS = new GameScreen(0,0,this);
		screen =2;
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
			break;
			
		case 2: 
			fin.paint();
			break;
		}
		
	}
	
}
