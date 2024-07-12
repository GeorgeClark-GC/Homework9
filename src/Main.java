public class Main {
    public static void main(String[] args) {
        int[] expenses = {120017, 120041, 120049, 120077, 120103};
        int sumExpenses = 0;
        for (int index = 0; index < expenses.length; index++) {
            sumExpenses += expenses[index];
        }
        System.out.println("Сумма затрат компании за месяц составит " + sumExpenses + " рублей.");
    }
}