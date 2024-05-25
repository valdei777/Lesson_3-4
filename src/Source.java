import java.io.*;
import java.util.Scanner;

public class Source {

    private  String test1 = "найти минимум из 2 чисел";

    private  String test2 = "найти сумму элементов массива";

    private  String test3 = "вывести строку сконца";

    private String[] sources = {"Min.txt", "sumMas.txt", "reversLine.txt"};

    public  void goToSourse () throws IOException {
        System.out.println("Выберете задачу для решения");
        System.out.println("1 - " + this.getTest1());
        System.out.println("2 - " + this.getTest2());
        System.out.println("3 - " + this.getTest3());

        printFile(taskSelectoin());
    }

    private int taskSelectoin() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    private void printFile(int x) throws IOException {
        if(x == 1) {
            Scanner scanner = new Scanner(new File(this.sources[x - 1]));
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
            scanner.close();

        } else if (x ==2) {
            BufferedReader reader = new BufferedReader(new FileReader(this.sources[x - 1]));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
        } else if(x == 3) {
            BufferedReader reader = new BufferedReader(new FileReader(this.sources[x - 1]));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
        } else {
            System.out.println("Неверное значение");
        }
    }

    private  String getTest1() {
        return this.test1;
    }

    private  String getTest2() {
        return this.test2;
    }

    private  String getTest3() {
        return this.test3;
    }
}
