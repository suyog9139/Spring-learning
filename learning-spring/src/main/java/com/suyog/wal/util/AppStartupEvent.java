package com.suyog.wal.util;

import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;
import com.suyog.wal.data.Room;
import com.suyog.wal.data.RoomRepository;

@Component
public class AppStartupEvent implements ApplicationListener<ApplicationReadyEvent> {

    private final RoomRepository roomRepository;

    
    public AppStartupEvent(RoomRepository roomRepository) {
        this.roomRepository = roomRepository;
    }


    @Override
    public void onApplicationEvent(ApplicationReadyEvent event) {
        // TODO Auto-generated method stub
        Iterable<Room>rooms = this.roomRepository.findAll();
        rooms.forEach(System.out::println);
        
    }
    
}
