public class uzduotis1 {


    public static void main(String[] args) {
        double ilgisa = 17.35;
        double ilgisb = 18;
        double plotisa = 20.47;
        double plotisb = 16.37;

        double perimetras = NamoPerimetras(ilgisa, ilgisb, plotisa, plotisb);

        System.out.println("Perimetras = " + perimetras);
    }
    public static double NamoPerimetras(double ilgisa, double ilgisb, double plotisa, double plotisb){ return plotisa + plotisb + ilgisa +ilgisb;}
}