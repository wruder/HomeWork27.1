import java.util.ArrayList;
import java.util.Scanner;

public class ReaktorTemperatureMonitor {

    public static void main(String[] args) {

        ArrayList<Double> temperatures = new ArrayList<>();//список хранения температур
        Scanner scanner = new Scanner(System.in);// сканер для вводаданных
        double previousTemperature = 0.0;// перемменная для хранения предыдущей температуры
        double totalSum = 0.0;//перменная ддля хранения суммы всех температур
        while (true) { // бесконечный цикл

            System.out.println("введите температуру:");

            double currentTemperature = scanner.nextDouble();//считываем введенное значение
            temperatures.add(currentTemperature);

            totalSum += currentTemperature; //обновление суммы всех температур

        double averageTemperature = totalSum / temperatures.size();

        System.out.println("средняя температура за все время:" + averageTemperature);

        if (temperatures.size() > 1) {
            double difference = currentTemperature - previousTemperature; //разница с предыдущей температурой
            System.out.println("разница с предыдущей температурой:" + difference);

            //проверка условий тревоги
            if (currentTemperature > averageTemperature * 1.1 && difference > previousTemperature * 0.2) {
                //проверка условий тревоги
                System.out.println("тревога превышение температуры!!!");
            }
        }
        previousTemperature = currentTemperature; // обновляем значение предыдущей температуры
    }
}
     }


