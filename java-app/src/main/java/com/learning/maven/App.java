package com.learning.maven;

import java.time.Duration;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.commons.math.stat.descriptive.DescriptiveStatistics;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		Arrays.stream(args).forEach(ar -> System.out.println("argume found "+ar));
		System.out.println("Hello World!");
		System.out.println("jai shree ram while preparing statistical calculations");
		double[] values = new double[] { 65, 51, 16, 11, 6519, 191, 0, 98, 19854, 1, 32 };
		DescriptiveStatistics descriptiveStatistics = new DescriptiveStatistics();
		for (double v : values) {
			descriptiveStatistics.addValue(v);
		}

		double mean = descriptiveStatistics.getMean();
		double median = descriptiveStatistics.getPercentile(50);
		double standardDeviation = descriptiveStatistics.getStandardDeviation();
		System.out.println("mean= " + mean + " median= " + median + " standardDeviation= " + standardDeviation);
		int[] items = { 1, 2, 3, 4, 3, 2, 4, 5, 6, 7 };
		System.out.println(countDistinctUsingStreams(items));
	}

	private static long countDistinctUsingStreams(int[] items) {
		LocalTime startTime = LocalTime.now();
		List<Integer> nonUniqueITems = new ArrayList<Integer>();
		int disitinctcount = 0;
		for (int i = 0; i < items.length; i++) {
			int currentItem = items[i];
			if (nonUniqueITems.contains(currentItem)) {
				continue;
			}
			boolean isDistinct = true;

			for (int j = i + 1; j < items.length; j++) {
				int nextITem = items[j];
				if (nextITem == currentItem) {
					isDistinct = false;
					nonUniqueITems.add(currentItem);
					break;
				}
			}
			if (isDistinct) {
				disitinctcount++;
			}
		}
		LocalTime end = LocalTime.now();
		System.out.println("total time taken " + Duration.between(startTime, end).getNano());
		return disitinctcount;
	}
}
