package com.sena.controllabs.repository;

import com.sena.controllabs.entity.LoanEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.UUID;

@Repository
public interface LoanRepository extends JpaRepository<LoanEntity, Long> {

    // Derived Query
    List<LoanEntity> findByRoomIdOrderByCreatedAtDesc(UUID roomId);

    // Consulta JPQL con JOIN
    @Query("SELECT l FROM LoanEntity l JOIN l.room r WHERE r.nombre = :roomName")
    List<LoanEntity> findByRoomName(@Param("roomName") String roomName);
}