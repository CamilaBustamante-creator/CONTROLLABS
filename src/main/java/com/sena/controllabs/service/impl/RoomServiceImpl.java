package com.sena.controllabs.service.impl;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.sena.controllabs.entity.RoomEntity;
import com.sena.controllabs.repository.RoomRepository;
import com.sena.controllabs.service.RoomService;

@Service
public class RoomServiceImpl implements RoomService{

    private final RoomRepository roomRepository;
    public RoomServiceImpl(RoomRepository roomRepository) {
        this.roomRepository = roomRepository;
    }

    @Override
    public List<RoomEntity> findAll() {
        return roomRepository.findAll(); // Passthrough directo
    }

    @Override
    public Optional<RoomEntity> findById(UUID id) {
        return roomRepository.findById(id);
    }

    @Override
    public RoomEntity save(RoomEntity room) {
        return roomRepository.save(room);
    }

    @Override
    public void deleteById(UUID id) {
        roomRepository.deleteById(id);
    }

}
