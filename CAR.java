package programmingtask03;

import java.util.Scanner;

//inheritance
public class CAR extends Dealership2 {

	int HP;
	int capacity;//Attributes for Car
	
	public CAR(int c, String m, int y, String mo,int sc, int hp) {
		super(c, m, y, mo);
		this.HP = hp;
		this.capacity = sc;
		//constructer
	
	}
	

}

	
	


