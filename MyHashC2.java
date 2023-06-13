class MyHashC2 {

    public boolean insert(String[] num) {
        int suc = 0;
        int i;
        for (i = 0; i < num.length; i++) {
            if (Main.data.contains(num[i]) == false) {
                Main.data.add(num[i]);
                suc++;
            }
        }
        if (suc < i) {
            return false;
        } else {
            return true;
        }
    }

    public boolean insert(int order, String num) {
        if (Main.data.contains(num) == false) {
            Main.data.add(order, num);
            return true;
        }
        return false;
    }

    public int search(String num) {
        int o = Main.data.indexOf(num);
        return o;
    }

    public boolean delete(String num) {
        boolean suc = Main.data.remove(num);
        return suc;
    }

    public void showcmd() {
        System.out.println("insert");
        System.out.println("inserto");
        System.out.println("search");
        System.out.println("delete");
        System.out.println("show");
        System.out.println("showcmd");
        System.out.println("quit");
    }
}