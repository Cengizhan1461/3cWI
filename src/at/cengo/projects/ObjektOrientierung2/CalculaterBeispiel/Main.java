package at.cengo.projects.ObjektOrientierung2.CalculaterBeispiel;

public class Main {
    public static void main(String[] args) {
        Calculater calculator = new Calculater();
        int result = calculator.sub(4, 7);
        System.out.println(result);

        ScienceCalculater scienceCalculator = new ScienceCalculater();
        int result2 = scienceCalculator.sinus(7);
        System.out.println(result2);

        Root root = new Root();
        int result3 = root.wurzel(4);
        System.out.println(result3);
    }
}
