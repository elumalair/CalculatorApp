package com.acte.ui.flow;

import com.acte.service.Calculator;
import com.acte.validator.AdditionValidator;
import com.util.Logger;
import com.util.ScannerUtil;

public class AdditionFlow extends Flow {

	private static final Logger LOGGER = Logger.getInstance();

	@Override
	protected void process(ScannerUtil sc) throws Exception {

		int a = sc.getInputAsInt("Enter the 1st num");
		int b = sc.getInputAsInt("Enter the 2nd num");
		AdditionValidator.validate(a, b);
		int x = Calculator.add(a, b);
		LOGGER.print("Addition Result :" + x);

	}
}
