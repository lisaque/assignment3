package Methods;    //Lincoln Isaque (74584732)

import java.util.Scanner;

import Containers.Containers;
import Items.Items;

public class Test{

	public static void main(String[] args) {
		//DISCLAIMER OBJECT
		Items disclaimer = new Items (0, 0, 0, 0, 0, 0, 0);
		disclaimer.disclaimerMethod(null, null, null);
		System.out.println();
		
		//GENERAL ARRAY LIST USED TO PRINT ITEMS INFORMATION
		//(OBJECTS ARRAY IS AT THE BOTTOM- LINE 234)
		
		Methods arrayPrintMethod = new Methods (); 
		
		Array<String> DesktopName = new Array <String>();
		Array<Double> DesktopH = new Array <Double>();
		Array<Double> DesktopW = new Array <Double>();
		Array<Double> DesktopL = new Array <Double>();
		Array<Double> DesktopWt = new Array <Double>();
		DesktopName.add("Desktop");
		DesktopH.add(1.0);
		DesktopW.add(1.5);
		DesktopL.add(0.5);
		DesktopWt.add(20.0);
		
		arrayPrintMethod.itemsMethod(DesktopName.get(), DesktopH.get(), DesktopW.get(), DesktopL.get(), DesktopWt.get());

		Array<String> LaptopName = new Array <String>();
		Array<Double> LaptopH = new Array <Double>();
		Array<Double> LaptopW = new Array <Double>();
		Array<Double> LaptopL = new Array <Double>();
		Array<Double> LaptopWt = new Array <Double>();
		LaptopName.add("Laptop");
		LaptopH.add(0.6);
		LaptopW.add(0.5);
		LaptopL.add(0.5);
		LaptopWt.add(6.5);
		
		arrayPrintMethod.itemsMethod(LaptopName.get(), LaptopH.get(), LaptopW.get(), LaptopL.get(), LaptopWt.get());


		Array<String> MouseName = new Array <String>();
		Array<Double> MouseH = new Array <Double>();
		Array<Double> MouseW = new Array <Double>();
		Array<Double> MouseL = new Array <Double>();
		Array<Double> MouseWt = new Array <Double>();
		MouseName.add("Mouse");
		MouseH.add(0.3);
		MouseW.add(0.3);
		MouseL.add(0.2);
		MouseWt.add(200*0.001);
		
		arrayPrintMethod.itemsMethod(MouseName.get(), MouseH.get(), MouseW.get(), MouseL.get(), MouseWt.get());

		
		Array<String> LcdName = new Array <String>();
		Array<Double> LcdH = new Array <Double>();
		Array<Double> LcdW = new Array <Double>();
		Array<Double> LcdL = new Array <Double>();
		Array<Double> LcdWt = new Array <Double>();
		LcdName.add("LCD");
		LcdH.add(1.2);
		LcdW.add(1.4);
		LcdL.add(0.8);
		LcdWt.add(2.6);
		arrayPrintMethod.itemsMethod(LcdName.get(), LcdH.get(), LcdW.get(), LcdL.get(), LcdWt.get());

		System.out.println();
		
//GETTER & SETTER FOR CONTAINERS MADE WUTH ABSTRACT CLASS ("containersInformation"). INHERITED IN "Containers" class

		Containers SmallContainerA = new Containers ("Small Container A",2.59, 2.43, 6.06,"500 ");
		Containers SmallContainerB = new Containers ("Small Container B",2.59 ,2.43, 6.06,"No weight limit");
        Containers BigContainer = new Containers("Big Container",2.59,2.43,12.01, "No weight limit");
        SmallContainerA.printInfo();
        SmallContainerB.printInfo();
        BigContainer.printInfo();
System.out.println();
	
		//SCANNER UNTIL LINE 219

		Scanner sc = new Scanner (System.in);		
		System.out.println("How many Desktops were ordered?(set '0' if not applicable)" );
		int DesktopNr = sc.nextInt();
		System.out.println("How many Laptops were ordered?" );
		int LaptopNr = sc.nextInt();
		Scanner mouseInput = new Scanner (System.in);		
		System.out.println("How many Mouses were ordered?" );
		int MouseNr = sc.nextInt();
		Scanner LCDs = new Scanner (System.in);		
		System.out.println("How many LCDs were ordered?" );
		int LcdNr = sc.nextInt();
		
		// TODO Auto-generated method stub
		
		System.out.println("Desktop: What is the type of box? (Cylindical = '1'. Cubic = '2'. Pentagonian = '3')" );
		int BoxType = sc.nextInt();
		
		Scanner height = new Scanner (System.in);		
		System.out.println("What is the box's height?" );
		double Height = sc.nextDouble();
		
		Scanner length = new Scanner (System.in);		
		System.out.println("What is the box's length? (set '0' if not applicable)" );
		double Length = sc.nextDouble();
		
		Scanner width = new Scanner (System.in);		
		System.out.println("What is the box's width? (set '0' if not applicable)" );
		double Width = sc.nextDouble();
		
		Scanner radius = new Scanner (System.in);		
		System.out.println("What is the box's radius? (set '0' if not applicable)" );
		double Radius = sc.nextDouble();
			
		Scanner apothem = new Scanner (System.in);		
		System.out.println("What is the box's apothem? (set '0' if not applicable)" );
		double Apothem = sc.nextDouble();
		
		System.out.println("What is the box's weight? (if the box fits 4 Desktops, it is x4 one Desktop's weight! " );
		double Weight = sc.nextDouble();
		
		Scanner amount = new Scanner (System.in);		
		System.out.println("How many times is this box used?" );
		double Amount = sc.nextDouble();
		
		//Item2
		System.out.println();
		System.out.println("Laptop: What is the type of box? (Cylindical = '1'. Cubic = '2'. Pentagonian = '3')" );
		int BoxType2 = sc.nextInt();
		
		Scanner height2 = new Scanner (System.in);		
		System.out.println("What is the box's height?" );
		double Height2 = sc.nextDouble();
		
		Scanner length2 = new Scanner (System.in);		
		System.out.println("What is the box's length? (set '0' if not applicable)" );
		double Length2 = sc.nextDouble();
		
		Scanner width2 = new Scanner (System.in);		
		System.out.println("What is the box's width? (set '0' if not applicable)" );
		double Width2 = sc.nextDouble();
		
		Scanner radius2 = new Scanner (System.in);		
		System.out.println("What is the box's radius? (set '0' if not applicable)" );
		double Radius2 = sc.nextDouble();
			
		Scanner apothem2 = new Scanner (System.in);		
		System.out.println("What is the box's apothem? (set '0' if not applicable)" );
		double Apothem2 = sc.nextDouble();
		
		System.out.println("What is the box's weight? " );
		double Weight2 = sc.nextDouble();
		
		Scanner amount2 = new Scanner (System.in);		
		System.out.println("How many times is this box used?" );
		double Amount2 = sc.nextDouble();
		
		//Item3
		System.out.println();
		System.out.println("Mouse: What is the type of box? (Cylindical = '1'. Cubic = '2'. Pentagonian = '3')" );
		int BoxType3 = sc.nextInt();
		
		Scanner height3 = new Scanner (System.in);		
		System.out.println("What is the box's height?" );
		double Height3 = sc.nextDouble();
		
		Scanner length3 = new Scanner (System.in);		
		System.out.println("What is the box's length? (set '0' is not applicable)" );
		double Length3 = sc.nextDouble();
		
		Scanner width3 = new Scanner (System.in);		
		System.out.println("What is the box's width? (set '0' is not applicable)" );
		double Width3 = sc.nextDouble();
		
		Scanner radius3 = new Scanner (System.in);		
		System.out.println("What is the box's radius? (set '0' is not applicable)" );
		double Radius3 = sc.nextDouble();
			
		Scanner apothem3 = new Scanner (System.in);		
		System.out.println("What is the box's apothem? (set '0' is not applicable)" );
		double Apothem3 = sc.nextDouble();
		
		System.out.println("What is the box's weight? " );
		double Weight3 = sc.nextDouble();
		
		Scanner amount3 = new Scanner (System.in);		
		System.out.println("How many times is this box used?" );
		double Amount3 = sc.nextDouble();
		
		//Item4
		System.out.println();
		System.out.println("LCD: What is the type of box? (Cylindical = '1'. Cubic = '2'. Pentagonian = '3')" );
		int BoxType4 = sc.nextInt();
		
		Scanner height4 = new Scanner (System.in);		
		System.out.println("What is the box's height?" );
		double Height4 = sc.nextDouble();
		
		Scanner length4 = new Scanner (System.in);		
		System.out.println("What is the box's length? (set '0' is not applicable)" );
		double Length4 = sc.nextDouble();
		
		Scanner width4 = new Scanner (System.in);		
		System.out.println("What is the box's width? (set '0' is not applicable)" );
		double Width4 = sc.nextDouble();
		
		Scanner radius4 = new Scanner (System.in);		
		System.out.println("What is the box's radius? (set '0' is not applicable)" );
		double Radius4 = sc.nextDouble();
			
		Scanner apothem4 = new Scanner (System.in);		
		System.out.println("What is the box's apothem? (set '0' is not applicable)" );
		double Apothem4 = sc.nextDouble();
		
		System.out.println("What is the box's weight? " );
		double Weight4 = sc.nextDouble();
		
		Scanner amount4 = new Scanner (System.in);		
		System.out.println("How many times is this box used?" );
		double Amount4 = sc.nextDouble();
		
		System.out.println();
		
		// TODO Auto-generated method stub
		
		Items BoxVol = new Items (BoxType, Weight, Height, Length, Width, Radius, Apothem);			
		
		
		Array<Integer> DesktopAmount = new Array <Integer>();
		Array<Integer> LaptopAmount = new Array <Integer>();
		Array<Integer> MouseAmount = new Array <Integer>();
		Array<Integer> LcdAmount = new Array <Integer>();
		DesktopAmount.add(DesktopNr);
		LaptopAmount.add(LaptopNr);
		MouseAmount.add(MouseNr);
		LcdAmount.add(LcdNr);
		
		arrayPrintMethod.itemsMethod(DesktopAmount.get(), LaptopAmount.get(), MouseAmount.get(),LcdAmount.get());

		
	//	Methods yourOrderInformation = new Methods();    //PRINTING THE USER'S ORDER INFORMATION
	//	yourOrderInformation.orderInformation(LaptopNr,MouseNr,DesktopNr,LcdNr);
		
		Methods calculations = new Methods(); //USER'S SCANNER INPUTS ARE USED TO SET THIS OBJECT'S VALUES.
		calculations.SetBoxVolume1(BoxVol.calculatingVolume(BoxType, Weight, Height, Length, Width, Radius, Apothem, Amount));
		calculations.SetBoxVolume2(BoxVol.calculatingVolume(BoxType2, Weight2, Height2, Length2, Width2, Radius2, Apothem2, Amount2));
		calculations.SetBoxVolume3(BoxVol.calculatingVolume(BoxType3, Weight3, Height3, Length3, Width3, Radius3, Apothem3, Amount3));
		calculations.SetBoxVolume2(BoxVol.calculatingVolume(BoxType4, Weight4, Height4, Length4, Width4, Radius4, Apothem4, Amount4));
System.out.println();

		Methods containerSelect = new Methods ();
		
		//SHIPPING INFORMATION PRINTED WITH THE 
		containerSelect.containerChoice(calculations.totalVolume(calculations.getBoxVolume1(), calculations.getBoxVolume2(), calculations.getBoxVolume3(), calculations.getBoxVolume4()), calculations.totalWeight(Weight, Amount, Weight2, Amount2, Weight3, Amount3, Weight4, Amount4));
		 containerSelect.cheaperOption(calculations.totalVolume(calculations.getBoxVolume1(), calculations.getBoxVolume2(), calculations.getBoxVolume3(), calculations.getBoxVolume4()), calculations.totalWeight(Weight, Amount, Weight2, Amount2, Weight3, Amount3, Weight4, Amount4));		
		}

}
