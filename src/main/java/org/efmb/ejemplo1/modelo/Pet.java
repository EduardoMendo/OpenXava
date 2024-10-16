package org.efmb.ejemplo1.modelo;

import java.time.*;

import javax.persistence.*;

import org.openxava.model.*;

import lombok.*;

@Entity
@Getter
@Setter
public class Pet extends Identifiable {
	private String nombre;
	private String raza;
	private String descripcion;
	private LocalDate Fecha;
}
