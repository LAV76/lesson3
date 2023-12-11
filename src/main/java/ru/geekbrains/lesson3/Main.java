package ru.geekbrains.lesson3;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Sedan("Toyota", "Camry", Color.BLUE);
        Car car2 = new SUV("Ford", "Explorer", Color.RED);

        CarWash carWash = new CarWash();
        ServiceStation serviceStation = new ServiceStation();

        car1.setRefuelingStation(new GasStation());
        car2.setRefuelingStation(new ElectricStation());

        car1.setCarWash(carWash);
        car2.setCarWash(carWash);

        car1.setServiceStation(serviceStation);
        car2.setServiceStation(serviceStation);

        car1.fuel();
        car2.fuel();

        car1.visitCarWash();
        car2.visitCarWash();

        car1.visitServiceStation();
        car2.visitServiceStation();
    }
}