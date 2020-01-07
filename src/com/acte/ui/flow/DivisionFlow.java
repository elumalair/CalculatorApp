package com.acte.ui.flow;

import com.acte.service.Calculator;
import com.util.Logger;
import com.util.ScannerUtil;

public class DivisionFlow extends Flow {

	private static final Logger LOGGER = Logger.getInstance();

	@Override
	protected void process(ScannerUtil sc) throws Exception {
		int a = sc.getInputAsValidInt("Enter the 1st num");
		int b = sc.getInputAsInt("Enter the 2nd num");
		float x = Calculator.div(a, b);
		LOGGER.print("Division Result :" + x);
	}
}
