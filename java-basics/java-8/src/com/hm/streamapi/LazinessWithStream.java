package com.hm.streamapi;

import java.util.Arrays;
import java.util.List;

public class LazinessWithStream {

	public static void main(String[] args) {

		List<Integer> nums = Arrays.asList(2, 4, 5, 3, 1, 6, 8);

		int output = nums.stream().filter(i -> {
			System.out.println("Filtered");
			return i % 2 != 0;
		}).map(i -> {
			System.out.println("Mapped");
			return i * i;
		}).findFirst().get();

		System.out.println(output);

	}

}
