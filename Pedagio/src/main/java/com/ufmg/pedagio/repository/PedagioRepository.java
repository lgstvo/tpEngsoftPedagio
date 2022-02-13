package com.ufmg.pedagio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ufmg.pedagio.model.entity.PedagioEntity;

@Repository
public interface PedagioRepository extends JpaRepository<PedagioEntity, Integer>{

}
