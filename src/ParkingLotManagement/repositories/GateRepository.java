package ParkingLotManagement.repositories;

import ParkingLotManagement.models.Gate;
import ParkingLotManagement.models.ParkingLot;
import ParkingLotManagement.models.ParkingSlot;

import java.util.Map;
import java.util.Optional;
import java.util.TreeMap;

public class GateRepository {
    Map<Long, Gate> gateTable = new TreeMap<>();
    static Long previousId = 0l;
    public Optional<Gate> getById(Long gateId){
        return Optional.ofNullable(gateTable.get(gateId));
    }

    public Gate insert(Gate gate){
        // It will add the id
        gate.setId(previousId++);
        gateTable.put(previousId, gate);
        return gate;
    }

    public ParkingLot getParkingLotFromGate(Gate gate){
        // Loop through all parking lots and check which has this gate
        return null;
    }
}
// TreeMap would be perfectly reflecting a DB in memory