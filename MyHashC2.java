class MyHashC2 {

    public boolean insert(String[] num) {
        for (int i = 0; i < num.length; i++) {

            Main.data.add(num[i]);
        }
        return true;
    }

    public boolean insert(int order, String num) {
        Main.data.add(order, num);
        return true;
    }

    public int search(String num) {
        int o = Main.data.indexOf(num);
        return o;
    }

    public int delete(String num) {

        return 0;
    }

    public void showcmd() {

    }
}