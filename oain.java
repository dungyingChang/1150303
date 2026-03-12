public class oain {

    public static void main(String[] args) {

        double x = Math.PI / 2; // x = π/2
        double h = 0.000001; // 很小的 h

        // sin(x+h) - sin(x) / h
        double derivative = (Math.sin(x + h) - Math.sin(x)) / h;

        // 真正的導數 cos(x)
        double exact = Math.cos(x);

        System.out.println("x = π/2");
        System.out.println("Finite Difference derivative = " + derivative);
        System.out.println("Exact derivative cos(x) = " + exact);
    }
}