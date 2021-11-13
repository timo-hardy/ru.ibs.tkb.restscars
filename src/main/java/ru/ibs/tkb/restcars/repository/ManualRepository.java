package ru.ibs.tkb.restcars.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.ibs.tkb.restcars.entity.Manual;

@Repository
public interface ManualRepository extends JpaRepository<Manual, Long> {
}
