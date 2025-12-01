package ParkingLotManagement.strategies;

import ParkingLotManagement.models.*;

public class RandomSlotAllotmentStrategy implements SlotAssignmentStrategy{
    @Override
    public ParkingSlot getAvailableSlot(ParkingLot parkingLot, VehicleType type) {
        for(ParkingFloor floor : parkingLot.getFloors()){
            for(ParkingSlot parkingSlot : floor.getParkingSlots()){
//                System.out.println("Parking slot :" + parkingSlot.getNumber());
                if(parkingSlot.getStatus().equals(ParkingSlotStatus.EMPTY) && parkingSlot.checkAllowedVehicle(type)){
                    parkingSlot.setStatus(ParkingSlotStatus.FILLED);
                    return parkingSlot;
                }
            }
        }
//        System.out.println("Returning null");
        return null;
    }
}
