
class Data {

    public void increment(int i, int j) {
        i = i + 10;
        j = j + 20;
    }
}

public class passByValue {

    public static void main(String[] args) {
        int i = 10, j = 20;
        System.out.println("before passing:  i=" + i + "  " + "j=" + j);
        Data n = new Data();
        n.increment(i, j);
        System.out.println("after passing :  i=" + i + "  " + "j=" + j);

    }
}
