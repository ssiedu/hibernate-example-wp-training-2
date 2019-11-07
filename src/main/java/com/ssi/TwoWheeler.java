package com.ssi;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
//@DiscriminatorValue(value="W2")
public class TwoWheeler extends Vehicle {
	private String steeringHandle;
}
