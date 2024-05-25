public class Task_4 {
    public static void main(String[] args) {
        // 4.Создайте класс, который находит наибольшее из трех чисел. Ко всем переменным обращаться можно ТОЛЬКО используя this.

        MaxForThreeNumber maximator = new MaxForThreeNumber(3, 4, 100);

        System.out.println(maximator.max());
    }
}
