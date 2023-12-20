package com.suyog.wal.data;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import jakarta.persistence.Id;

@Entity
@Table(name="ROOM")
public class Room {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="ROOM_ID")
    private long id;
    @Column(name = "Name")
    private String name;
    @Column(name="ROOM_NUMBER")
    private long roomNumber;
    @Column(name = "BED_INFO")
    private String bedInfo;
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public long getRoomNumber() {
        return roomNumber;
    }
    public void setRoomNumber(long roomNumber) {
        this.roomNumber = roomNumber;
    }
    public String getBedInfo() {
        return bedInfo;
    }
    public void setBedInfo(String bedInfo) {
        this.bedInfo = bedInfo;
    }
    @Override
    public String toString() {
        return "Room [id=" + id + ", name=" + name + ", roomNumber=" + roomNumber + ", bedInfo=" + bedInfo + "]";
    }

    

    
}
