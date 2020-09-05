package designpatterns.structural.adapter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AdapterPatternExample {
	
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String line = reader.readLine();
		System.err.println(line);
	}

}
