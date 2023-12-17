package com.suyog.wal.util;

import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import com.suyog.wal.data.Guest;
import com.suyog.wal.data.GuestRepository;
import com.suyog.wal.data.Reservation;
import com.suyog.wal.data.ReservationRepository;
import com.suyog.wal.data.Room;
import com.suyog.wal.data.RoomRepository;

@Component
public class AppStartupEvent implements ApplicationListener<ApplicationReadyEvent> {

    private final RoomRepository roomRepository;
    private final GuestRepository guestRepository;
    private final ReservationRepository reservationRepository;


    public AppStartupEvent(RoomRepository roomRepository, GuestRepository guestRepository,
            ReservationRepository reservationRepository) {
        this.roomRepository = roomRepository;
        this.guestRepository = guestRepository;
        this.reservationRepository = reservationRepository;
    }






    @Override
    public void onApplicationEvent(ApplicationReadyEvent event) {
        // TODO Auto-generated method stub
        Iterable<Room>rooms = this.roomRepository.findAll();
        rooms.forEach(System.out::println);
        Iterable<Guest> guests = this.guestRepository.findAll();
        guests.forEach(System.out::println);
        Iterable<Reservation> reservations = this.reservationRepository.findAll();
        reservations.forEach(System.out::println);
        
    }
    
}
