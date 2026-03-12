public class qain {

    // 原函數 f(x) = x^2
    public static double f(double x) {
        return x * x;
    }

    // 真正導數 f'(x) = 2x
    public static double exactDerivative(double x) {
        return 2 * x;
    }

    public static void main(String[] args) {
        double x = 2.0; // 在 x = 2 的位置驗證
        double h = 1.0; // 初始 h

        System.out.println("驗證中央差分公式：");
        System.out.println("f'(x) ≈ (f(x+h) - f(x-h)) / (2h)");
        System.out.println("函數 f(x) = x^2");
        System.out.println("x = " + x);
        System.out.println();

        System.out.printf("%-12s %-20s %-20s %-20s%n",
                "h", "中央差分近似值", "真正導數 2x", "誤差");

        for (int i = 0; i < 6; i++) {
            double approx = (f(x + h) - f(x - h)) / (2 * h);
            double exact = exactDerivative(x);
            double error = Math.abs(approx - exact);

            System.out.printf("%-12.6f %-20.10f %-20.10f %-20.10f%n",
                    h, approx, exact, error);

            h = h / 10.0; // h 越來越小
        }
    }
}