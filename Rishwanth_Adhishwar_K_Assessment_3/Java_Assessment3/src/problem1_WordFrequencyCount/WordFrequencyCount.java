package problem1_WordFrequencyCount;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.TreeMap;

public class WordFrequencyCount {

	public static void main(String[] args) {

		TreeMap<String, Integer> map = new TreeMap<>();
		
		try {
			BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\krish\\word.txt"));
			String line;
			while ((line=br.readLine())!= null) 
			{
				String words[]=line.split(" ");
				for (String s : words) 
				{
					if (map.containsKey(s)) 
					{
						map.put(s, map.get(s) + 1);
					} 
					else 
					{
						map.put(s, 1);
					}
				}
			}
			for (String key : map.keySet()) 
			{
				System.out.println(key + ": " + map.get(key));
			}
			System.out.println("Unique words: " + map.size());
		} 
		catch (FileNotFoundException e) 
		{
			System.out.println("File not found");
		} 
		catch (IOException e) 
		{
			System.out.println("Cannot able to read File");
		}

	}

}
