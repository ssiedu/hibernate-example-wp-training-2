package com.ssi;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import lombok.Data;

@Entity
@Data
//@DiscriminatorValue(value="W4")
public class FourWheeler extends Vehicle {
	private String steeringWheel;
}
