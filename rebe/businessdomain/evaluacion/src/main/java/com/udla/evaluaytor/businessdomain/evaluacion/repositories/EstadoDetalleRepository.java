package com.udla.evaluaytor.businessdomain.evaluacion.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.udla.evaluaytor.businessdomain.evaluacion.models.EstadoDetalle;

public interface EstadoDetalleRepository extends JpaRepository<EstadoDetalle, Long> {
}
