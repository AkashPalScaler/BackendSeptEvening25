package ParkingLotManagement.strategies;

import ParkingLotManagement.models.ParkingLot;
import ParkingLotManagement.models.ParkingSlot;
import ParkingLotManagement.models.Vehicle;
import ParkingLotManagement.models.VehicleType;

public interface SlotAssignmentStrategy {
    public ParkingSlot getAvailableSlot(ParkingLot parkingLot, VehicleType type);
}
