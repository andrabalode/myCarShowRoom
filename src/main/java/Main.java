import cars.Car;
import cars.ShowRoom;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.UUID;

public class Main {

    ShowRoom showRoom = new ShowRoom();
    public static void main(String[] args) {
        Main main = new Main();

        main.showMwnu();

    }

    void showMwnu() {
        Scanner scanner = new Scanner(System.in);
        String userInput = "";

        do {
            System.out.println("\nWelcome to the showroom, please choose an activity: ");
            System.out.println("1. Add Car");
            System.out.println("2. View all cars");
            System.out.println("3. View Single Car");
            System.out.println("4. Remove Car");
            System.out.println("\nEnter Quit to end program...");

            System.out.println("Choose a number: ");
            userInput = scanner.nextLine();

            switch (userInput) {
                case "Quit", "quit", "QUIT":
                    System.out.println("Exiting Application...");
                    break;
                case "1":
                    addCar();
                    break;
                case "2":
                    viewAllCars();
                    break;
                case "3":
                    viewSingleCar();
                    break;
                case "4":
                    removeCar();
                    break;
                default:
                    break;

            }
        } while (!userInput.equalsIgnoreCase("Quit"));

        return;

    }

    void addCar() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Add Car");

        Car car = new Car();
        System.out.println("Enter Name: ");
        car.name = scanner.nextLine();

        System.out.println("Enter Manufacturer: ");
        car.manufacturer = scanner.nextLine();

        System.out.println("Enter Type: ");
        car.type = scanner.nextLine();

        car.id = UUID.randomUUID();

        String message = showRoom.addCar(car);

        System.out.println(message);
    }

    void viewAllCars() {
        ArrayList<Car> allCars = showRoom.getAllCars();
        System.out.println("\nAll available cars\n");
        System.out.println("Car name\t Manufacturer\t Car Type\t Car Id");
        for (Car car: allCars) {
            System.out.println(car.name + " \t" + car.manufacturer + " \t" + car.type + " \t" + car.id );
        }
    }

    void viewSingleCar() {

//create method
        System.out.println("View Single Car");
//receive car id to view from the user
        System.out.println("Please provide the car index");
        Scanner scanner = new Scanner(System.in);
        int carIndex = scanner.nextInt();
//view specified car
        Car car = showRoom.getSingleCar(carIndex);
        System.out.println("Car number:" + carIndex);
        System.out.println("Car name\t Manufacturer\t Car Type");
        System.out.println(car.name + " \t" + car.manufacturer + " \t" + car.type);
    }


//    void removeCar () {
//
//        System.out.println("Remove this car");
//        System.out.println("Please provide car Index");
//        Scanner scanner = new Scanner(System.in);
//        int carIndex = scanner.nextInt();

//        System.out.println(showRoom.removeCar(carIndex);
//    }
    void removeCar () {

        System.out.println("Remove this car");
        System.out.println("Please provide car index");
        Scanner scanner = new Scanner(System.in);
        int carIndex = scanner.nextInt();
        String car = showRoom.removeCar(carIndex);
        System.out.println(car);
    }
    
    //this is a comment mode on the remote server and isn't yet on my machine
}
