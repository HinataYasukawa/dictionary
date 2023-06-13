import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static ArrayList<String> data = new ArrayList<>();

    public static void commandInterPreter(Scanner sc) {
        String input = sc.next();
        String[] num = input.split(" ");
        String command = num[0];
        boolean con = true;
        MyHashC2 myHash = new MyHashC2();

        while (con) {
            System.out.print("input:");
            switch (command) {
                case "insert":
                    myHash.insert(num);
                    System.out.println(num + " was inserted");
                    break;

                case "insertO":
                    myHash.insert(Integer.parseInt(num[1]), num[2]);
                    System.out.println(num[2] + " was inserted");
                    break;

                case "search":
                    int i = myHash.search(num[1]);
                    if (i == -1) {
                        System.out.println(num[1] + " was not found.");
                    }
                    break;

                case "delete":
                    int j = myHash.delete(num[1]);
                    if (j == -1) {
                        System.out.println(num[1] + " was not deleted");
                    } else {
                        System.out.println(num[1] + "[" + j + "] was deleted");
                    }
                    break;

                case "showcmd":
                    myHash.showcmd();
                    break;

                case "quit":
                    con = false;
                    break;

                default:
                    System.out.print("有効なコマンドを入力してください。( showcmd で利用可能なコマンド一覧が表示できます)");
            }
        }
    }

    static public void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        commandInterPreter(sc);
    }
}