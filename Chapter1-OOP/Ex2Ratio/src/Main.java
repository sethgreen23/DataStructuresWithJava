public class Main {
    public static void main(String args[]) {
        Ratio r1 = new Ratio(2,4);
        Ratio r2 = new Ratio(4,8);
        Ratio r4 = new Ratio(1,0);
        System.out.println(r1+" is it equal to "+r2+" ? "+r1.equals(r2));
        Ratio r3 = Ratio.ZERO;
        System.out.println(r3);
        System.out.println(r1.compareTo(r4));
    }
}
