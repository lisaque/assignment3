package Containers;    //Lincoln Isaque (74584732)

abstract class containersInformation {
	String name;
	double height;
	double width;
	double length;
	String weight;
	
	public containersInformation(String name, double height,double width,double length,String weight) {
		this.name = name;
		this.height = height;
		this.width = width;
		this.length = length;
		this.weight = weight; 
	}
	public void  setName(String name) {
		this.name = name;
	}
	public void setH() {
		this.height = height;
	}
	public void setW() {
	this.width = width;
	}
	public void setL() {
	this.length = length;
	}
	public void setWt() {
		this.weight = weight;
	}
	public String getName() {
		return name;
	}
	public String getWt() {
		return weight;
	}
	
	public abstract void printInfo();

}
