package com.converter.webservice;

import javax.jws.*;

import com.converter.source.InvalidNumberFormatException;
import com.sun.media.sound.InvalidFormatException;

@WebService
public class NumeralSystemConverterImpl implements NumeralSystemConverter {

	
	public NumeralSystemConverterImpl() {
		super();
	}
	
	
	@Override
	public String convertNum(
			@WebParam(name="number") String numberString,
            @WebParam(name="source_radix") Integer sourceRadix,
            @WebParam(name="dest_radix")  Integer destRadix) 
            		throws InvalidFormatException {
		try {
			return com.converter.source.NumeralSystemConverter.convertNum(numberString, sourceRadix, destRadix);
		} catch (InvalidNumberFormatException e) {

			e.printStackTrace();
		}
		return null;
	}

}
