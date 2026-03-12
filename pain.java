public class pain {

    public static void main(String[] args) {

        double x = 1.0; // 要計算導數的位置
        double h = 0.1; // 初始 h

        System.out.println("x = " + x);
        System.out.println("Using finite difference formula: (f(x+h)-f(x))/h");
        System.out.println();

        for (int i = 0; i < 6; i++) {

            double derivative = (Math.sin(x + h) - Math.sin(x)) / h;

            System.out.printf("h = %.6f  derivative ≈ %.10f\n", h, derivative);

            h = h / 10; // h 越來越小
        }

        System.out.println();
        System.out.println("Exact derivative cos(x) = " + Math.cos(x));
    }
}