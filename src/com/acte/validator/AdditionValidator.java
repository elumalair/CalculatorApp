package com.acte.validator;

import com.acte.exception.ValidatorException;

public class AdditionValidator {

	public static void validate(int a, int b) throws ValidatorException {

		if (a == 0) {
			throw new ValidatorException("Input cannot be zero");
		}

		if (b == 0) {
			throw new ValidatorException("Input cannot be zero");
		}
	}
}
