public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++){
            System.out.print(i + " ");
        }
        System.out.println();
//task 2
        for (int x = 10; x >= 0; x -- ) {
            System.out.print(x + " ");
        }
        System.out.println();
//task 3
        for (int y = 0; y <= 17; y = y + 2) {
            System.out.print(y + " ");
        }
        System.out.println();
//task 4
        for (int z = 10; z >= -10; z--) {
            System.out.print(z + " ");
        }
        System.out.println();
//task 5
        for (int year = 1904; year <= 2096; year+=4) {
            System.out.println(year + " год является високосным");
        }
//task 6
        for (int c = 7; c <= 98; c+=7) {
            System.out.print(c + " ");
        }
        System.out.println();
//task 7
        for (int v = 1; v <= 512; v = v * 2) {
            System.out.print(v + " ");
        }
        System.out.println();
//task 8
        int sum = 0;
        for (int b = 1; b <= 12; b++) {
            sum = sum + 29000;
            System.out.println("Месяц " + b+ ", сумма накоплений равна " + sum + " рублей");
        }
//task 9
        int salary = 29000;
        int total = 0;
        for (int n = 0; n < 12; n++) {
            total = total + total/100;
            total = total + salary;
            System.out.println("Месяц " + n + ", сумма накоплений равна " + total + " рублей");
        }
//task 10
        for (int m = 1; m <= 10; m++) {
            System.out.println("2*" + m + "=" + (2 * m));
        }
    }
}