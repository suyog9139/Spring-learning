package com.suyog.wal.business;

import java.util.Date;
import java.util.List;


import com.suyog.wal.data.GuestRepository;
import com.suyog.wal.data.ReservationRepository;
import com.suyog.wal.data.RoomRepository;
i

public class ReservationService {
    private RoomRepository roomRepository;
    private GuestRepository guestRepository;
    private ReservationRepository reservationRepository;

    public List<RoomReservation> getRoomReservationsForDate(Date date){
        Iterable<Room>rooms = this.roomRepository.findAll();

    }
}
