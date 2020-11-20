package ru.job4j.opp;

public class CollectionVehicle {
    public static void main(String[] args) {
        Bus bus = new Bus();
        Plain plain = new Plain();
        Train train = new Train();
        Vehicle vehicleBus = (Vehicle) bus;
        Vehicle vehiclePlain = (Vehicle) plain;
        Vehicle vehicleTrain = (Vehicle) train;
        Vehicle [] arrVehicles = new Vehicle[]{vehicleBus, vehiclePlain, vehicleTrain};
        for (Vehicle vehicle : arrVehicles) {
            vehicle.move();
            System.out.println(vehicle.spentOil());
        }
    }
}
