import java.time.LocalDate;
public class Main {
    public static void main(String[] args) {
        checkLeapYear(2024);
    }

    public static void checkLeapYear(int year) {
        boolean isLeap = false;
        System.out.println("Задача 1");

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    isLeap = true;
                }
            } else {
                isLeap = true;
            }
        }

        if (isLeap) {
            System.out.println(year + " является високосным годом.");
        } else {
            System.out.println(year + " не является високосным годом.");
        }
    }

        public static void installApp(int osType, int deviceYear) {
            int currentYear = LocalDate.now().getYear();

            if (deviceYear < currentYear) {
                String appType = (osType == 0) ? "облегченную версию для iOS" : "облегченную версию для Android";
                System.out.println("Установите " + appType + " по ссылке");
            } else {
                String appType = (osType == 0) ? "приложение для iOS" : "приложение для Android";
                System.out.println("Установите " + appType + " по ссылке");
            }
        }

    public static int deliveryDays(int deliveryDistance) {
        if (deliveryDistance <= 0 || deliveryDistance > 100) {
            throw new IllegalArgumentException("Delivery distance must be between 1 and 100 km");
        }
        int days = 1;
        if (deliveryDistance > 20) {
            days++;
        }
        if (deliveryDistance > 60) {
            days++;
        }
        return days;
    }


}




