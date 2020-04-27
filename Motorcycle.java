package programmingtask03;
//inheritance
public class Motorcycle extends Dealership2 {

	int enginecap;
	String type;
	public Motorcycle(int c, String m, int y, String mo,int ec, String ty) {
		super(c, m, y, mo);
		// constructer
		
		this.enginecap = ec;
		this.type = ty;
	}

}
