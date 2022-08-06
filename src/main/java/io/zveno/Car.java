package io.zveno;

public class Car {
    Double petrol;
    String carBrand;

    public Car(double petrol, String carBrand) {
        this.petrol = petrol;
        this.carBrand = carBrand;

    }

    void FillTheCar (){
        if (petrol <10){
            System.out.println("Необходимо заправить машину");
        }
        else {
            if (petrol >= 50) {
                System.out.println("Бак полон, заправка не требуется");
            }
            else {
                System.out.println("Машина заправлена на "+ (60.0 - petrol) +" л");
                petrol = 60.0;
            }
        }
    }
    void RepairsCenterToyota(){
        if (carBrand.equals("Toyota")) {
            System.out.println("Это верный сервис");
        } else {
            System.out.println("Этот сервис не подходит, необходимо обратиться в другой сервис");
        }
    }

}

