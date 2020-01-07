package com.acte.ui.flow;

import com.util.Logger;
import com.util.ScannerUtil;

public abstract class Flow {

	private static final Logger LOGGER = Logger.getInstance();

	protected abstract void process(ScannerUtil sc) throws Exception;

	public void start(ScannerUtil sc) {
		while (true) {
			try {
				process(sc);
				break;
			} catch (Exception e) {
				LOGGER.error(e.getMessage());
				sc.clear();
			}

		}
	}
}
