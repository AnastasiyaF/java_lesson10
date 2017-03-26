package com.epam.java_training.parse;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ParseXML {

	
	private List<String> initial_list;
	private List<String> result_list;
	
	public ParseXML(List<String> initial_string){
		this.initial_list = initial_string;
		result_list = new ArrayList<String>();
	}
	
	public List<String> getInitial_list(){
		
		return this.initial_list;
	}

	public void setInitial_list(List<String> initial_list){
		
		this.initial_list = initial_list;
	}
	
	public List<String> getResult_list(){
		
		return this.result_list;	
	}
	
	public void parse(){
		
		Iterator<String> iterator = initial_list.iterator();
		
		Pattern pattern = Pattern.compile("([^</>]+)[><]");
		
		String get_string;
		Matcher matcher;
		
		while (iterator.hasNext()) {
			
			get_string = iterator.next().trim();
			matcher = pattern.matcher(get_string);
			
			while (matcher.find()){	
				
				result_list.add(matcher.group(1));	
	
			}
			
			matcher.reset();
		}		
	}
	
	public void printInitialData(){
		
		for (String stringResult : initial_list){
			System.out.println(stringResult);		
		}
	}
	
	public void printResult(){
		
		for (String stringResult : result_list){
			System.out.println(stringResult);		
		}
	}
	
	
}
