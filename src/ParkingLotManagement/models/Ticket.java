package ParkingLotManagement.models;

import java.util.Date;

public class Ticket {
    String number;
    Date entry_time;
    Gate gate;
    Operator operator;
    ParkingSlot parkingSlot;
    Vehicle vehicle;
    static Integer ticketNumber = 0;

    public Ticket(Gate gate, Operator operator, ParkingSlot parkingSlot, Vehicle vehicle) {
        this.number = ""+ticketNumber++;
        this.entry_time = new Date();
        this.gate = gate;
        this.operator = operator;
        this.parkingSlot = parkingSlot;
        this.vehicle = vehicle;
    }

    public Date getEntry_time() {
        return entry_time;
    }

    public void setEntry_time(Date entry_time) {
        this.entry_time = entry_time;
    }

    public Gate getGate() {
        return gate;
    }

    public void setGate(Gate gate) {
        this.gate = gate;
    }

    public Operator getOperator() {
        return operator;
    }

    public void setOperator(Operator operator) {
        this.operator = operator;
    }

    public ParkingSlot getParkingSlot() {
        return parkingSlot;
    }

    public void setParkingSlot(ParkingSlot parkingSlot) {
        this.parkingSlot = parkingSlot;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
