package com.suyog.wal.business;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Comparator;


import com.suyog.wal.data.GuestRepository;
import com.suyog.wal.data.ReservationRepository;
import com.suyog.wal.data.RoomRepository;
import com.suyog.wal.data.Room;

public class ReservationService {
    private RoomRepository roomRepository;
    private GuestRepository guestRepository;
    private ReservationRepository reservationRepository;

    public List<RoomReservation> getRoomReservationsForDate(Date date){
        Iterable<Room>rooms = this.roomRepository.findAll();
        Map<Long, RoomReservation> roomReservationMap = new HashMap();
        rooms.forEach(room ->{
            RoomReservation roomReservation = new RoomReservation();
            roomReservation.setRoomId(room.getId());
            roomReservation.setRoomName(room.getName());
            roomReservation.setRoomNumber(room.getRoomNumber());
            roomReservationMap.put(room.getId(), roomReservation);
        });
    }
}
