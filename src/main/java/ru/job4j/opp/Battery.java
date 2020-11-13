package ru.job4j.opp;

public class Battery {
    private int load;
    Battery (int loadSize) {
        this.load = loadSize;
    }
    public void exchange(Battery another) {
        another.load = this.load + another.load;
        this.load  = 0;
    }

    public static void main(String[] args) {
        Battery nokiaBattery = new Battery(100);
        Battery samsungBattery = new Battery(400);
        System.out.println("Nokia battery : " + nokiaBattery.load + ". Samsung battery : " + samsungBattery.load);
        nokiaBattery.exchange(samsungBattery);
        System.out.println("Nokia battery : " + nokiaBattery.load + ". Samsung battery : " + samsungBattery.load);
    }
}
