package ParkingLotManagement.repositories;

import ParkingLotManagement.models.Gate;
import ParkingLotManagement.models.ParkingLot;

import java.util.Map;
import java.util.Optional;
import java.util.TreeMap;

public class ParkingLotRepository {
    Map<Long, ParkingLot> pltable = new TreeMap<>();
    static Long previousId = 0l;
    public Optional<ParkingLot> getById(Long gateId){
        return Optional.ofNullable(pltable.get(gateId));
    }

    public ParkingLot insert(ParkingLot parkingLot){
        // It will add the id
//        parkingLot.setId(previousId++);
        pltable.put(parkingLot.getId(), parkingLot);
        return parkingLot;
    }
}
