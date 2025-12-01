package ParkingLotManagement.repositories;

import ParkingLotManagement.models.Gate;
import ParkingLotManagement.models.Vehicle;

import java.util.Optional;

public class VehicleRepository {
    public Optional<Vehicle> getByRegNumber(String reg_num){
        return Optional.empty();
    }

    public Vehicle insert(Vehicle vehicle){
        return vehicle;
    }
    //findOrCreate
    public Vehicle upsert(Vehicle vehicle){
        return vehicle;
    }
}
