package cars;

import java.util.ArrayList;

public class ShowRoom {
    private ArrayList<Car> cars = new ArrayList<Car>();

    //addcar
    public String addCar(Car car) {
        this.cars.add(car);
        return car.name + " added successfully";
    }
    //getAllCars
    public ArrayList<Car> getAllCars() {
        return cars;
    }

    //getSingleCar
    public Car getSingleCar(int carIndex) {
        return this.cars.get(carIndex);
    }


    //removeCar
    public String removeCar(int carIndex) {
        try {
        cars.remove(carIndex);
        } catch (Exception ex) {
            return "Unable to remove specified car";
        }
        return "car removed successfully";
    }

}
