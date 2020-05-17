package com.learning.maven;

import org.apache.commons.math.stat.descriptive.DescriptiveStatistics;

public class App1Utility {

	public double calculateMean(double[] values) {
		//double[] values = new double[] { 65, 51, 16, 11, 6519, 191, 0, 98, 19854, 1, 32 };
		DescriptiveStatistics descriptiveStatistics = new DescriptiveStatistics();
		for (double v : values) {
			descriptiveStatistics.addValue(v);
		}

		double mean = descriptiveStatistics.getMean();
		System.out.println("App1Utility.calculateMean(): Mean caluclation result "+mean);
		return mean;
	}
}
