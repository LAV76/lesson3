package ru.geekbrains.lesson3;

import java.awt.*;

public abstract class Car {


    private CarWash carWash;
    private ServiceStation serviceStation;

    public void setCarWash(CarWash carWash) {
        this.carWash = carWash;
    }

    public void setServiceStation(ServiceStation serviceStation) {
        this.serviceStation = serviceStation;
    }

    /**
     * Visit the car wash
     */
    public void visitCarWash() {
        if (carWash != null) {
            carWash.washCar();
        }
    }

    /**
     * Visit the service station
     */
    public void visitServiceStation() {
        if (serviceStation != null) {
            serviceStation.serviceCar();
        }
    }


    //endregion

    //region Методы

    public void setRefuelingStation(Refueling refuelingStation) {
        this.refueling = refuelingStation;
    }

    /**
     * Заправить автомобиль
     */
    public void fuel() {
        if (refueling != null){
            refueling.fuel(fuelType);
        }
    }

    public int getWheelsCount() {
        return wheelsCount;
    }

    // Движение
    public abstract void movement();
    // Обслуживание
    public abstract void maintenance();
    // Переключение передач
    public abstract boolean gearShifting();
    // Включение фар
    public abstract boolean switchHeadlights();
    // Включение дворников
    public abstract boolean switchWipers();

    // Состояние противотуманных фар
    private boolean fogLights = false;
    public boolean switchFogLights(){
        fogLights = !fogLights;
        return fogLights;
    }

    //endregion

    //region Поля

    private Refueling refueling;

    // Марка автомобиля
    private String make;

    // Модель
    private String model;

    // Цвет
    private Color color;

    // Тип
    protected CarType type;

    // Число колес
    protected int wheelsCount = 4;

    // Тип топлива
    protected FuelType fuelType = FuelType.Diesel;

    // Тип коробки передач
    private GearboxType gearboxType;

    // Объем двигателя
    private double engineCapacity;



    //endregion

}
