package Array;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Github {
	public static void main(String[] args) {
		String s = "afa1425";
		int sum = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {

				sum = sum + s.charAt(i);
			}
System.out.println(sum);
		}

	}

}
