package practice22;

public class TestRPNCalculator {
    public static void main(String[] args) {
        RPNCalculator calculator = new RPNCalculator();
        int passed = 0;
        int failed = 0;

        // Тест 1: Простые операции
        System.out.println("1. Тест простых операций:");
        if (test(calculator, "2 3 +", 5)) passed++; else failed++;
        if (test(calculator, "10 5 -", 5)) passed++; else failed++;
        if (test(calculator, "3 4 *", 12)) passed++; else failed++;
        if (test(calculator, "15 3 /", 5)) passed++; else failed++;

        // Тест 2: Сложные выражения
        System.out.println("\n2. Тест сложных выражений:");
        if (test(calculator, "5 1 2 + 4 * + 3 -", 14)) passed++; else failed++;
        if (test(calculator, "2 3 + 4 *", 20)) passed++; else failed++;

        // Тест 3: Дробные числа
        System.out.println("\n3. Тест дробных чисел:");
        if (test(calculator, "2.5 3.5 +", 6)) passed++; else failed++;
        if (test(calculator, "10.5 2.5 -", 8)) passed++; else failed++;

        // Тест 4: Ошибки
        System.out.println("\n4. Тест обработки ошибок:");
        if (testError(calculator, "2 3 + *", "Недостаточно операндов")) passed++; else failed++;
        if (testError(calculator, "5 0 /", "Деление на ноль")) passed++; else failed++;
        if (testError(calculator, "abc", "Неизвестный токен")) passed++; else failed++;

        // Итоги
        System.out.println("\n=== РЕЗУЛЬТАТЫ ===");
        System.out.println("Пройдено: " + passed);
        System.out.println("Провалено: " + failed);
        System.out.println("Всего: " + (passed + failed));
    }

    private static boolean test(RPNCalculator calculator, String expression, double expected) {
        try {
            double result = calculator.evaluate(expression);
            if (Math.abs(result - expected) < 0.001) {
                System.out.println(expression + " = " + result + " (ожидалось: " + expected + ")");
                return true;
            } else {
                System.out.println(expression + " = " + result + " (ожидалось: " + expected + ")");
                return false;
            }
        } catch (Exception e) {
            System.out.println(expression + " Ошибка: " + e.getMessage());
            return false;
        }
    }

    private static boolean testError(RPNCalculator calculator, String expression, String expectedError) {
        try {
            calculator.evaluate(expression);
            System.out.println(expression + " Ожидалась ошибка: " + expectedError);
            return false;
        } catch (Exception e) {
            if (e.getMessage().contains(expectedError)) {
                System.out.println(expression + " Корректная ошибка: " + e.getMessage());
                return true;
            } else {
                System.out.println(expression + " Неправильная ошибка: " + e.getMessage());
                return false;
            }
        }
    }
}
