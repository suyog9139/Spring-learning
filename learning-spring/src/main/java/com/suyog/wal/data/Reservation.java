package com.suyog.wal.data;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "RESERVATION")
public class Reservation {


    @Id
    @Column(name = "RESERVATION_ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long reservationId;
    @Column(name = "ROOM_ID")
    private long roomId;
    @Column(name="GUEST_ID")
    private long guestId;
    @Column(name="RES_DATE")
    private Date reservatioDate;
    
    public long getReservationId() {
        return reservationId;
    }
    public void setReservationId(long reservationId) {
        this.reservationId = reservationId;
    }
    public long getRoomId() {
        return roomId;
    }
    public void setRoomId(long roomId) {
        this.roomId = roomId;
    }
    public long getGuestId() {
        return guestId;
    }
    public void setGuestId(long guestId) {
        this.guestId = guestId;
    }
    public Date getReservatioDate() {
        return reservatioDate;
    }
    public void setReservatioDate(Date reservatioDate) {
        this.reservatioDate = reservatioDate;
    }
    @Override
    public String toString() {
        return "Reservation [reservationId=" + reservationId + ", roomId=" + roomId + ", guestId=" + guestId
                + ", reservatioDate=" + reservatioDate + "]";
    }

    

    
}
