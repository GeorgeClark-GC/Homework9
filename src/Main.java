public class Main {
    public static void main(String[] args) {
        System.out.println("Example1");
        int[] expenses = {120017, 120041, 120049, 120077, 120103};
        int sumExpenses = 0;
        for (int index = 0; index < expenses.length; index++) {
            sumExpenses += expenses[index];
        }
        System.out.println("Сумма затрат компании за месяц составит " + sumExpenses + " рублей.");
        System.out.println("Example2");
        int[] expensesSecond = {113002, 107007, 101011, 103007, 100903};
        int maxExpense = expensesSecond[0];
        int minExpense = expensesSecond[0];
        for (final int current : expensesSecond) {
            if (current > maxExpense) {
                maxExpense = current;
            }
            if (minExpense > current) {
                minExpense = current;
            }
        }
        System.out.println("Максимальная сумма трат за неделю составляет " + maxExpense + " рублей.");
        System.out.println("Минимальная сумма трат за неделю составляет " + minExpense + " рублей.");
        System.out.println("Example3");
        int[] expensesThird = {117042, 104117, 102234, 119575, 116825};
        double sumExpenseThird = 0;
        for (int index = 0; index < expensesThird.length; index++) {
            sumExpenseThird += expensesThird[index];
        }
        double mediumExpense = sumExpenseThird / expensesThird.length;
        System.out.println("Средняя сумма затрат за месяц составляет " + mediumExpense + " рублей.");
        System.out.println("Example4");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int index = reverseFullName.length - 1; index >= 0; index--) {
            System.out.print(reverseFullName[index]);
        }
    }
}