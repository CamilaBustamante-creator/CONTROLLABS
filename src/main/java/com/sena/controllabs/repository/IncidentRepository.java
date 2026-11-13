package com.sena.controllabs.repository;

import com.sena.controllabs.entity.IncidentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IncidentRepository  extends JpaRepository<IncidentEntity, Long> {

}