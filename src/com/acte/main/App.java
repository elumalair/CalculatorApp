package com.acte.main;

import java.util.Scanner;

import com.acte.ui.flow.AdditionFlow;
import com.acte.ui.flow.DivisionFlow;
import com.acte.ui.flow.MultiplicationFlow;
import com.util.Logger;
import com.util.ScannerUtil;

public class App {

	private static final Logger LOGGER = Logger.getInstance();

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		ScannerUtil sc = new ScannerUtil(scanner);

		boolean loop = true;

		while (loop) {

			int choice = sc.getInputAsInt("Press 1. Addition 2. Division 3. Multiplication 4.Exit ");

			switch (choice) {
			case 1:
				LOGGER.info("---ADDITION PROCESS (STARTED)-----");

				new AdditionFlow().start(sc);

				LOGGER.info("---ADDITION PROCESS (COMPLETED)----");

				break;

			case 2:

				LOGGER.info("---DIVISION PROCESS (STARTED)-----");
				while (true) {

					try {
						new DivisionFlow().start(sc);
						break;
					} catch (Exception e) {
						LOGGER.error(e.getMessage());
						scanner.nextLine();
					}
				}
				LOGGER.info("---DIVISION PROCESS (COMPLETED)----");

				break;
			case 3:

				LOGGER.info("---Multiplication PROCESS (STARTED)-----");
				while (true) {

					try {
						new MultiplicationFlow().start(sc);
						break;
					} catch (Exception e) {
						LOGGER.error(e.getMessage());
						scanner.nextLine();
					}
				}
				LOGGER.info("---Multiplication PROCESS (COMPLETED)----");

				break;
			case 4:
				loop = false;
				LOGGER.info("---Thank You ---");
				break;

			default:
				LOGGER.error("Invalid Input");
				break;
			}

		}

		// close scanner
		sc.close();
		scanner.close();

	}

}
