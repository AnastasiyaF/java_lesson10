package com.epam.java_training.readdata;

import java.util.List;
import java.util.ArrayList;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.File;
import java.io.BufferedReader;
import java.io.FileReader;

public class IOdata {
	private File data_file;
	
	public IOdata(String filename) {
		data_file = new File(filename);
	}
	
	public List<String> readDataFromFile(){  
		
		List<String> listString = new ArrayList<String>();
		try {
			
			FileReader fr = new FileReader(data_file);
			BufferedReader br = new BufferedReader(fr);
			
			String sringFromReader;

			while ((sringFromReader = br.readLine()) != null) {
					listString.add(sringFromReader);
			}
			
			if (listString.get(0).contains("?xml")){
				listString.remove(0);
			}
	
			br.close();
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		} 
		catch (IOException e) {
			e.printStackTrace();
		} 
	
		return listString;
    }

}

