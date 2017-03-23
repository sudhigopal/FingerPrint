package com.dt;

import java.awt.EventQueue;
import java.io.IOException;

public class HistogramMain {
	
	/**
	 * The main method (entry point) of the program.
	 * @param args command line arguments.
	 */
	public static void main(final String[] args) {		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HistogramWindow frame = new HistogramWindow();
					frame.setVisible(true);
					if (args.length == 1) {
						String fileName = args[0];
						frame.loadImage(fileName);
						frame.plotHistograms(fileName);
					}
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		});
	}
}
