import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static ArrayList<String> data = new ArrayList<>();

    public static void commandInterPreter(Scanner sc) {
        String input;
        String[] num;
        String command;
        boolean con = true;
        MyHashC2 myHash = new MyHashC2();

        while (con) {
            System.out.print("input:");
            input = sc.nextLine();
            num = input.split(" ");
            command = num[0];
            switch (command) {
                case "insert":
                    String[] subArray = Arrays.copyOfRange(num, 1, num.length);
                    myHash.insert(subArray);
                    System.out.println(Arrays.toString(subArray) + " was inserted");
                    break;

                case "insertO":
                    myHash.insert(Integer.parseInt(num[1]), num[2]);
                    System.out.println(num[2] + " was inserted");
                    break;

                case "search":
                    int i = myHash.search(num[1]);
                    if (i == -1) {
                        System.out.println(num[1] + " was not found.");
                    } else {
                        System.out.println(num[1] + "was found in " + i);
                    }
                    break;

                case "delete":
                    boolean j = myHash.delete(num[1]);
                    if (j == false) {
                        System.out.println(num[1] + " was not deleted");
                    } else {
                        System.out.println(num[1] + " was deleted");
                    }
                    break;

                case "show":
                    System.out.println(data);
                    break;

                case "showcmd":
                    myHash.showcmd();
                    break;

                case "quit":
                    con = false;
                    break;

                default:
                    System.out.println("有効なコマンドを入力してください。( showcmd で利用可能なコマンド一覧が表示できます)");
            }
        }
    }

    static public void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        commandInterPreter(sc);
    }
}