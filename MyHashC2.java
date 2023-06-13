class MyHashC2 {

    public boolean insert(String[] num) {
        for (int i = 0; i < num.length; i++) {
            Ex5_C2.data.add(num[i]);
        }
        return true;
    }

    public boolean insert(int order, String num) {
        return true;
    }

    public int search(String num) {
        return 5;
    }

    public int delete(String num) {
        return 0;
    }
}