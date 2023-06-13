import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static ArrayList<String> data = new ArrayList<>();

    public static int commandInterPreter(Scanner sc) {
        String input = sc.next();
        String[] num = input.split(" ");
        String command = num[0];
        MyHashC2 myHash = new MyHashC2();

        switch (command) {
            case "insert":
                myHash.insert(num);
                break;

            case "insertO":
                myHash.insert(Integer.parseInt(num[1]), num[2]);
                break;

            case "search":
                myHash.search(num[1]);
                break;

            case "delete":
                myHash.delete(num[1]);
                break;

            case "showcmd":
                myHash.showcmd();
                break;

            case "quit":
                break;

            default:
                System.out.print("有効なコマンドを入力してください。(”showcmd”で利用可能なコマンド一覧が表示できます)");
        }
        return 0;
    }

    static public void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int cmd = commandInterPreter(sc);
        }
    }
}