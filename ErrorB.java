public class ErrorB {

    public static void main(String[] args) {
        int var1 = 15;
        int var2 = 5;
        int var3 = 0;
        float ans1 = (float) var1 / var2;

        float ans2 = (float) var1 / var3;

        System.out.println("Division of va1 by var2 is: " + ans1);
        System.out.println("Division of va1 by var3 is: " + ans2);
    }
}
