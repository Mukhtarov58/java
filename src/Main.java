public class Main {
    public static void main(String[] args) {
        double regularBonus = 0.3;
        double specialBonus = 0.6;
        double totalBonus = regularBonus + specialBonus;
        System.out.println(totalBonus);
    }
}

/*
30.04 - 30.04
Приложение Project2
На тестирование затрачено 0.5
В результате тестировани выявлены следующие дефекты:
Результат сложения значений из переменныз очевидно не верный.
Сценарий:
    - break regularBonus;
    - break specialBonus;
    - break totalBonus;
Ожижаемый результат: сумма посчитается верно.
Фактический результат: сумма подсчитана не верно.
Окружение:
Windows 10 Pro 21H1
Java version 11.0.14
 */