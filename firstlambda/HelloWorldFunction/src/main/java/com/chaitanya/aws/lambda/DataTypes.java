package com.chaitanya.aws.lambda;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.amazonaws.services.lambda.runtime.Context;

public class DataTypes {
	
	private Double instanceVariable = Math.random();
	private static Double staticVariable = Math.random();
	
	public DataTypes() {
		System.out.println("Inside Constructor");
	}
	static {
		System.out.println("Static block executed");
	}
	
	public void coldstartBasics() {
		Double localvariable = Math.random();
		System.out.println("Instance Variable " + instanceVariable + " Static Variable " + staticVariable + " Local variable" + localvariable  );
	}
	public int getNumber(float number) {
		return (int) number;
	}
	
	public List<Integer> getScores(List<String> names) {
		Map<String, Integer> studentScores = new HashMap<String, Integer>();
		studentScores.put("Kiran", 90);
		studentScores.put("Bob", 80);
		studentScores.put("Varun", 70);
		
		List<Integer> matchingScores = new ArrayList<Integer>();
		names.forEach(name -> {
			matchingScores.add(studentScores.get(name));
		});
		return matchingScores;
	}
	
	public void saveEmployeeData(Map<String, Integer> empData) {
		System.out.println(empData);
	}
	
	public Map<String, List<Integer>> getStudentScores(){
		Map<String, List<Integer>> studentScores = new HashMap<String, List<Integer>>();
		studentScores.put("Kiran", Arrays.asList(80,90,100));
		studentScores.put("John", Arrays.asList(82,95,98));
		studentScores.put("Bob", Arrays.asList(79,88,92));
		return studentScores;
	}
	
	public ClinicalData getClinicals(Patient patient) {
		System.out.println(patient.getName());
		System.out.println(patient.getSsn());
		ClinicalData clinicalData = new ClinicalData();
		clinicalData.setBp("80/120");
		clinicalData.setHeartRate("80");
		return clinicalData;
		
	}
	
	public void getOutput(InputStream input, OutputStream output, Context context) throws IOException{
		System.out.println(System.getenv("restapiurl"));
		System.out.println(context.getAwsRequestId());
		System.out.println(context.getFunctionName());
		System.out.println(context.getRemainingTimeInMillis());
		int data;
		while((data = input.read())!= -1) {
			output.write(Character.toLowerCase(data));
		}
	}
	
	

}
