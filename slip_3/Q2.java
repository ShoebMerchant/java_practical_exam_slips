import java.util.*;

/**
 * Write a program to create class Account (accno, accname, balance). Create an
 * array of 'n' Account objects. Define static method sortAccount which sorts
 * the array on the basis of balance. Display account details in sorted order.
 */
class Account {
    int accno;
    String accname;
    int balance;

    public int getBalance() {
        return balance;
    }

    void setAccount() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter acc. no : ");
        accno = in.nextInt();
        System.out.print("Enter acc. name: ");
        accname = in.next();
        System.out.print("Enter acc. balance: ");
        balance = in.nextInt();
    }

    void printAcc() {
        System.out.println("Acc Details: " + accno + " " + accname + " " + balance);
    }
}

public class Q2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of accounts : ");
        int n = in.nextInt();
        Account accs[] = new Account[n];
        for (int i = 0; i < n; i++) {
            accs[i] = new Account();
            accs[i].setAccount();
        }
        sortAccount(accs);
        for (int i = 0; i < accs.length; i++) {
            accs[i].printAcc();
        }
    }

    public static void sortAccount(Account[] accs) {
        Arrays.sort(accs, Comparator.comparing(Account::getBalance));

    }
}
