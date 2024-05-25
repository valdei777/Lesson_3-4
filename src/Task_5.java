public class Task_5 {
    public static void main(String[] args) {
        // 5.Создайте класс, который делает из трех маленьких строк одну большую. Ко всем переменным обращаться можно ТОЛЬКО используя this.

        ThreeInOne combiner = new ThreeInOne("Hello, ", "world ", "!!!");

        System.out.println(combiner.oneLine());

    }
}
