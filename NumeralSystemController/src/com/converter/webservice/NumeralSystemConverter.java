package com.converter.webservice;

import com.sun.media.sound.InvalidFormatException;

public interface NumeralSystemConverter {
	
	public String convertNum(String numberString, Integer sourceRadix, Integer destRadix) throws InvalidFormatException;

}
