import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMapImpl<String> map = new HashMapImpl<>();

        while (scanner.hasNext()) {
            String command = scanner.next();
            String key = scanner.next();

            switch (command) {
                case "put": {
                    String value = scanner.next();
                    map.put(key, value);
                    break;
                }
                case "get": {
                    String value = map.getValue(key);
                    if (value == null) {
                        System.out.println("null");
                    } else {
                        System.out.println(value);
                    }
                    break;
                }
                case "delete": {
                    map.delete(key);
                    break;
                }
            }
        }

        scanner.close();
    }
}