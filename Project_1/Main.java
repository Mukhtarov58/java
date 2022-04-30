public class Main {
    public static void main(String[] args) {
        int score;
        score = 2_000_000_000;
        System.out.println(score);
        int transaction;
        transaction = 500_000_000;
        System.out.println(transaction);
        int total = score + transaction;
        System.out.println(total);
    }
}
/*
30.04 - 30.04
Приложение Project1
На тестирование затрачено 0.5
В результате тестировани выявлены следующие дефекты:
Результат сложения значений из переменныз очевидно не верный.
Сценарий:
    - break score;
    - break transaction;
    - break total;
Ожижаемый результат: сумма посчитается верно.
Фактический результат: сумма подсчитана не верно.

Окружение:
Windows 10 Pro 21H1
Java version 11.0.14
 */

