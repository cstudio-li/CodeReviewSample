package jp.cstudio.codereview;

public class CodeReviewMain {
    public static void main(String args[]) {
        System.out.println("パラメータ： " + args[0]);
        int len = Integer.parseInt(args[0]);
        char[] thing = new char[len];

        for (int i=0; i<thing.length; i++) {
            thing[i] = 'x';
        }

        System.out.println("異常終了");
    }
}
