package ProfModuleTest1;

class oddControl extends Exception {
    oddControl(String message) {
        System.out.println(message);
    }
}

public class Task4 {
    public static void main(String args[]) throws Exception {
        MyEvenNumber number = new MyEvenNumber(9);
        int a = number.getN();
        System.out.println(a);
    }
}

class MyEvenNumber {

    private int n;

    public MyEvenNumber(int n) {
        try {
            if (n % 2 == 0) {
                this.n = n;
            } else {
                throw new oddControl("запретить создание инстанса MyEvenNumber с нечётным числом.");
            }
        } catch (oddControl e) {
            e.printStackTrace();
        }
    }

    public int getN() {
        return n;
    }
}


