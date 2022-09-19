package ss2;

public class RunAccount {
    public static void main(String[] args) {
        Account[] kh = new Account[2];
        kh[0] = new Account("T2203E","Minh Duong",150);
        kh[1] = new Account("T2203M","Xuan Hanh",100);

        kh[0].credit();
        kh[0].debit();
        kh[0].tranFerTo(kh[1]);

    }
}
