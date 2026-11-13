package com.sena.controllabs.service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import com.sena.controllabs.entity.RoomEntity;

public interface RoomService {

    List<RoomEntity> findAll();

    Optional<RoomEntity> findById(UUID id);

    RoomEntity save(RoomEntity room);

    void deleteById(UUID id);

}
