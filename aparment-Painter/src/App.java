public class App {
////Joshua Vachachira////
//Aparment Painter//
//Object-Oriented-Cpsc-24500//


public static void main(String[]args){
    double length = 32.75;
    double wide = 25.62;
    double windowheight = 5.5;
    double windowwide = 14.4;
    double doorheight = 8;
    double doorwide = 3.25;
    double height = 10;

    double coveragepaintgallon = 400;
    double coverageprimergallon = 300;
    double costpaintgallon = 34.99;
    double costprimergallon = 24.49;

    double longarea = (length*height)*2;
    double shortarea = (wide*height)*2;
    double doorarea = doorheight*doorwide;
    double windowarea = windowheight*windowwide;
    double ceilingarea = wide*length;
    
    
    double wallarea = longarea+shortarea-windowarea-doorarea;
    double totalarea = wallarea + ceilingarea;
    
    double complexarea = 8*totalarea;
    
    int primerneeded = (int) (complexarea/coverageprimergallon) + 1;
    int paintneeded = (int) (complexarea/coveragepaintgallon) + 1;

    double primercost = primerneeded*costprimergallon;
    double paintcost = paintneeded*costpaintgallon;
    
    System.out.println("**********************************************************");
    System.out.printf("Wall area per unit:           \t %20.2f\n",wallarea);
    System.out.printf("Ceiling area per unit:        \t %20.2f\n",ceilingarea);
    System.out.printf("Total area to paint and prime:\t %20.2f\n",complexarea);
    System.out.println("");
    System.out.printf("You must purchase %d gallons of paint for $%.2f\n",paintneeded,paintcost);
    System.out.printf("You must purchase %d gallons of primer for $%.2f\n",primerneeded,primercost);
    System.out.println("");
    System.out.printf("Your total cost to paint and prime all units is $%.2f\n",primercost + paintcost);
    System.out.println("**********************************************************");

    }
    
}




