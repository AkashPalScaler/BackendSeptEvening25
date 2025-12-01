package ParkingLotManagement.controllers;

import ParkingLotManagement.models.IssueTicketRequestDTO;
import ParkingLotManagement.models.IssueTicketResponseDTO;
import ParkingLotManagement.models.ResponseStatus;
import ParkingLotManagement.models.Ticket;
import ParkingLotManagement.repositories.GateRepository;
import ParkingLotManagement.repositories.TicketRepository;
import ParkingLotManagement.repositories.VehicleRepository;
import ParkingLotManagement.services.TicketService;

public class TicketController {
    TicketService ticketService;

    public TicketController(GateRepository gateRepository, TicketRepository ticketRepository, VehicleRepository vehicleRepository) {
        this.ticketService = new TicketService(gateRepository, vehicleRepository, ticketRepository);
    }

    public IssueTicketResponseDTO issueTicket(IssueTicketRequestDTO requestDTO){
        IssueTicketResponseDTO responseDTO = new IssueTicketResponseDTO();
        // Issue Ticket service with required details
        try{
            Ticket ticket = ticketService.issueTicket(requestDTO.getReg_number()
                    ,requestDTO.getOwner_name()
                    , requestDTO.getOwner_number()
                    ,requestDTO.getVehicle_type()
                    ,requestDTO.getGate_id());

            responseDTO.setResponseMessage("Ticket created successfully");
            responseDTO.setStatus(ResponseStatus.SUCCESS);
            responseDTO.setTicket_number(ticket.getNumber());
            responseDTO.setSlot_number(ticket.getParkingSlot().getNumber());
        }catch(Exception e){
            responseDTO.setResponseMessage("Failed to create Ticket");
            responseDTO.setStatus(ResponseStatus.FAILURE);
        }
        return responseDTO;
    }
}
