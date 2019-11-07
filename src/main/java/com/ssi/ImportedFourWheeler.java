package com.ssi;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import lombok.Data;

@Entity
@Data
//@DiscriminatorValue(value="W4Imp")
public class ImportedFourWheeler extends FourWheeler{
	private String country;
	private int duty;
}
