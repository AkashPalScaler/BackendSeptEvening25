package ParkingLotManagement.models;

import java.util.List;

public class ParkingSlot {
    String number;
    ParkingSlotStatus status;
    List<AllowedVehicle> allowedVehicles;

    public ParkingSlot(String number, ParkingSlotStatus status, List<AllowedVehicle> allowedVehicles) {
        this.number = number;
        this.status = status;
        this.allowedVehicles = allowedVehicles;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public ParkingSlotStatus getStatus() {
        return status;
    }

    public void setStatus(ParkingSlotStatus status) {
        this.status = status;
    }

    public List<AllowedVehicle> getAllowedVehicles() {
        return allowedVehicles;
    }

    public void setAllowedVehicles(List<AllowedVehicle> allowedVehicles) {
        this.allowedVehicles = allowedVehicles;
    }

    public boolean checkAllowedVehicle(VehicleType type){
//        System.out.println("Type of vehicle"+ type);
        for(AllowedVehicle vehicle : allowedVehicles){
//            System.out.println("Allowed Vehicle" + vehicle.type);
            if(vehicle.getType().equals(type)){
                return true;
            }
        }
        return false;
    }

}
