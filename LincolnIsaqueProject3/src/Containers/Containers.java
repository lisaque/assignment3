package Containers;    //Lincoln Isaque (74584732)

public class Containers extends containersInformation {
	
	public Containers(String name, double height, double width, double length, String weight) {
		super(name, height, width, length, weight);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void printInfo() {
		System.out.println("CONTAINER INFO: "+ name + " height "+ height+ ", width "+ width + ", length " + length + ", weight = "+ weight);
		// TODO Auto-generated method stub
		
		//PLEASE IGNORE THESE VALUES! THE UTILIZED VALUES FOR GETTER AND SETTER IS ON THE ABSTRACT CLASS "ContainersInformation"
	}
	private double smallContainerVol;
	private double bigContainerVol;
	private double smallContainerWt;
	private double bigContainerWt;
	
	//SETTERS
    public void setVolSmallContainer (double smallContainerVol) {
	this.smallContainerVol = smallContainerVol;
    }
    public void setVolBigContainer (double bigContainerVol) {
	this.bigContainerVol = bigContainerVol;
}
    public void setWtSmallContainer (double smallContainerWt) {
    	this.smallContainerWt = smallContainerWt;
}
    public void setWtBigContainer (double bigContainerWt) {
    	this.bigContainerWt = bigContainerWt;
    }
    //GETTERS
    public double getVolsmallContainer () {
	return smallContainerVol;
} 
    public double getVolBigContainer () {
    	return bigContainerVol;
    } 
    public double getWtsmallContainer () {
	return smallContainerWt;
} 
        public double getWtBigContainer () {
    	return bigContainerWt;
    	
	
		

	
	}
}




