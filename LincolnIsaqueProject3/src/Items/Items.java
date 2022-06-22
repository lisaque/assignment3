package Items;    //Lincoln Isaque (74584732)

import Methods.Array;

public class Items extends boxInformation{
	
	public Items(int boxType, double height, double weight, double length, double width, double radius,
			double apothem) {
		super(boxType, height, weight, length, width, radius, apothem);
		// TODO Auto-generated constructor stub
	}
	//METHOD WITH VOLUME FORMULAS FOR EACH GIVEN SHAPE.
    public double calculatingVolume(double boxType, double weight, double height, double length, double width, double radius, double apothem, double amount) {
    	 if (boxType == 1) {    
    	double volume =((Math.PI)*Math.pow(radius,2)* height)* amount;
    	return volume;
    	} else if (boxType == 2) {
    	double volume = (length*width*height)*amount;
    	return volume;
    	}
    	else if (boxType == 3) {
    	double volume = (2.5*(apothem*length*height))*amount;
    	return volume;
    	}
		return boxType;
    }
    public void disclaimerMethod (String disclaimer1, String disclaimer2, String disclaimer3) {
    	disclaimer3 ="IF VALUE IS NOT APPLICABLE SET '0'!";
    	 disclaimer1 ="UNITS are in meters and kilograms.";
    	 disclaimer2 ="(recommended: design each box so that multiple of the same item can fit into one box!)";
    	System.out.println(disclaimer1);
    	System.out.println(disclaimer3);
    	System.out.println(disclaimer2);
    }

    //GETTER AND SETTER SETUP FOR ITEMS' INFORMATION
  public void itemsMethod (String name, double H, double W, double L, double Wt) {
	  System.out.println("ITEM INFO: "+ name + " height "+ H+ ", width "+W+", length "+L + ", weight "+Wt);
  }

    private String LaptopName;
	private double LaptopH;// 0.60*0.50*0.50 , 6.5 HWL
	private double LaptopW;
	private double LaptopL;
	private String MouseName;
	private double MouseH; //0.30*0.30*0.20, 200*0.001
	private double MouseW;
	private double MouseL;
	private String DesktopName;
	private double DesktopH; 
	private double DesktopW;
	private double DesktopL;//1.00*1.50*0.50, 20
	private String LcdName;
	private double LcdH;
	private double LcdW;
	private double LcdL;//1.20*1.40*0.80, 2.6
	
	private double LaptopWt;
	private double MouseWt;
	private double DesktopWt;
	private double LcdWt;
	
	
	
	//SETTERS
	public void setLaptopName (String LaptopName) {
		this.LaptopName = LaptopName;
}
    public void setLaptopH (double LaptopH) {
	this.LaptopH = LaptopH;
}
    public void setLaptopW (double LaptopW) {
    	this.LaptopW = LaptopW;
}
    public void setLaptopL (double LaptopL) {
    this.LaptopL = LaptopL;
}
	public void setDesktopName (String DesktopName) {
	this.DesktopName = DesktopName;
}
    public void setDesktopH (double DesktopH) {
	this.DesktopH = DesktopH;
}
    public void setDesktopW (double DesktopW) {
	this.DesktopW = DesktopW;
}
    public void setDesktopL (double DesktopL) {
   	this.DesktopL = DesktopL;
}
    public void setMouseName (String MouseName) {
	this.MouseName = MouseName;
}
    public void setMouseH (double MouseH) {
    this.MouseH = MouseH;
}
    public void setMouseW (double MouseW) {
    this.MouseW = MouseW;
}
    public void setMouseL (double MouseL) {
    this.MouseL = MouseL;
}
    public void setLcdName (String LcdName) {
    this.LcdName = LcdName;
}
    public void setLcdH (double LcdH) {
    this.LcdH = LcdH;
}
    public void setLcdW (double LcdW) {
    this.LcdW = LcdW;
}
    public void setLcdL (double LcdL) {
    this.LcdL = LcdL;
}
      
    
//  
    public void setWtLaptop (double LaptopWt) {
	this.LaptopWt = LaptopWt;
}
    public void setWtMouse (double MouseWt) {
	this.MouseWt = MouseWt;
}
    public void setWtDesktop (double DesktopWt) {
	this.DesktopWt = DesktopWt;
}
    public void setWtLcd (double LcdWt) {
	this.LcdWt = LcdWt;
}

//GETTERS
    public String getDesktopName () {
  	return DesktopName;
    }
    public double getDesktopH () {
	return DesktopH;
}
    public double getDesktopW () {
    return DesktopW;
}
    public double getDesktopL () {
    return DesktopL; 
}
    public String getLaptopName () {
  	return LaptopName;
}
    public double getLaptopH () {
	return LaptopH;
}
    public double getLaptopW () {
	return LaptopW;
}
    public double getLaptopL () {
	return LaptopL;
}
    public String getMouseName () {
     return MouseName;
}
    public double getMouseH () {
	return MouseH;
}
    public double getMouseW () {
    return MouseW;
}
    public double getMouseL () {
    return MouseL;
}
    public String getLcdName () {
    return LcdName;
}
    public double getLcdH () {
    return LcdH;
}
    public double getLcdW () {
    return LcdW;
}
    public double getLcdL () {
    return LcdL;
}
//
    public double getWtDesktop () {
   	return DesktopWt;
}
    public double getWtLaptop () {
	return LaptopWt;
}
    public double getMouseWt () {
	return MouseWt;
}
    public double getLcdWt () {
	return LcdWt;
    }
	
		
	}


