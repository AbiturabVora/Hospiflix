package com.hospiquick.appointment.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.hospiquick.appointment.model.Vaccination;

public interface AppRepository extends JpaRepository<Vaccination, Long> {

}
