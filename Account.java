package ss2;

import java.util.Scanner;

public class Account {
    public String id;
    public String name;
    public float balance;



    public Account(){

    }

    public Account(String id, String name, float balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public void credit() {
        float tien;
        Scanner sd = new Scanner(System.in);
        System.out.println("Nhập vào số tiền cần nạp : ");
        tien = sd.nextFloat();
        if (tien <= 0){
            System.out.println("Giao dịch lỗi!");
        }else{
            balance += tien;
            System.out.println("Giao dịch thành công.");
            System.out.println("Số dư hiện tại của tài khoản "+ id + " là : " + balance +"$");
        }

    }

    public void debit() {
        float tien;
        Scanner sd = new Scanner(System.in);
        System.out.println("Nhập vào số tiền thanh toán : ");
        tien = sd.nextFloat();
        if(tien > balance){
            System.out.println("Giao dịch lỗi!");
        }else{
            balance -= tien;
            System.out.println("Giao dịch thành công.");
            System.out.println("Số dư hiện tại của tài khoản "+ id + " là : " + balance+"$");
        }
    }

    public void tranFerTo(Account tk) {
        float st;
        Scanner sd = new Scanner(System.in);
        System.out.println("Nhập vào số tiền cần chuyển : ");
        st = sd.nextFloat();
        if(st > balance){
            System.out.println("Giao dịch lỗi!");
        }else{
            balance -= st;
            tk.balance += st;
            System.out.println("Giao dịch thành công.");
            System.out.println("Số dư hiện tại của tài khoản "+ id + " là : " + balance+"$");
            System.out.println("Số dư hiện tại của tài khoản "+ tk.id + " là : " + tk.balance+"$");
        }

    }
}
