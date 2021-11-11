package ru.ibs.tkb.restcars.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface EngineRepository extends JpaRepository<EngineRepository, Long> {
}
