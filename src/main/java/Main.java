import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String nameAuto;
        int speedAuto;
        final int RIDERS = 3;

        Auto[] arrayAuto = new Auto[RIDERS];

        for (int i = 0; i < RIDERS; i++) {
            System.out.println("Введите название машины №" + (i + 1) + ":");
            nameAuto = scanner.next();
            while (true) {
                System.out.println("Введите скорость машины №" + (i + 1) + ":");
                boolean isScannerInt = scanner.hasNextInt();
                if (isScannerInt) {
                    speedAuto = scanner.nextInt();
                    if (speedAuto > 0 && speedAuto <= 250) {
                        Auto auto = new Auto(nameAuto, speedAuto);
                        arrayAuto[i] = auto;
                        break;
                    } else
                        System.out.println("Неправильная скорость, превышение допустимых значений");
                } else {
                    System.out.println("Неверный ввод, введите численное значение скорости ");
                    scanner.next();
                }
            }
        }
        scanner.close();

        System.out.println("Самая быстрая машина: " + Race.winnerRace(arrayAuto));
    }
}
