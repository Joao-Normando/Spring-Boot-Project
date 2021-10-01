package com.joaonormando.hrworker.repositories;

import com.joaonormando.hrworker.entities.Worker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkerRepository extends JpaRepository<Worker, Long> {


}
