/*
 * Задача 10.
 * Date: 14.03.2017
   Author: Anastasiya Findziukevich
   
Дан xml-файл.
<?xml version="1.0" encoding="UTF-8"?>
<breakfast-menu>
    <food id="1">
        <name>Belgian Waffles</name>
        <price>$5.95</price>
        <description>two of our famous Belgian Waffles with plenty of real maple syrup</description>
        <calories>650</calories>
    </food>
    <food id="2">
        <name>Strawberry Belgian Waffles</name>
        <price>$7.95</price>
        <description>light Belgian waffles covered with strawberries and whipped cream</description>
        <calories>900</calories>
    </food>
</breakfast-menu>

С помощью регулярных выражений разбейте XML на узлы(nodes) и создайте список, их содержащий.

Например
breakfast-menu
food id ="1"
name
Belgian Waffles
name
 * 
 * 
 */

package com.epam.java_training.main;


import java.util.List;

import com.epam.java_training.readdata.IOdata;
import com.epam.java_training.parse.ParseXML;

public class Main {
	
	
	public static void main(String[] args) {
		
		IOdata io = new IOdata("File.xml");
		
		List<String> getList = io.readDataFromFile();
		
		ParseXML parseXML = new ParseXML(getList);
		
		
		System.out.println("Печать исходных данных: ");
		parseXML.printInitialData();
		
		parseXML.parse();
		
		System.out.println("Печать обработанных данных: ");
		parseXML.printResult();

	}

}
