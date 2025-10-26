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
    }
}