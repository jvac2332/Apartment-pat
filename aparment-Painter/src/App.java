public class App {
////Joshua Vachachira////
//Aparment Painter//


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
    double costprimergallon = 24.99;

    double longarea = length*wide*2;
    double shortarea = wide*height*2;
    double doorarea = doorheight*doorwide*2;
    double windowarea = windowheight*windowwide*2;
    double ceilingarea = wide*length*2;
    
    
    double wallarea = longarea+shortarea-windowarea-doorarea;
    double totalarea = wallarea + ceilingarea;
    
    double complexarea = 8*totalarea;
    
    int primerneeded = (int) (complexarea/coverageprimergallon) + 1;
    int paintneeded = (int) (complexarea/coveragepaintgallon) + 1;

    double primercost = primerneeded*costprimergallon;
    double paintcost = paintneeded*costpaintgallon;


    
}



