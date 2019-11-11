package com.restapi;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class RestapiSample {

	public static void main(String[] args) throws IOException, ParseException {
		
		Response response=null;
        RequestSpecification request=RestAssured.given(); 
        //request.header("header1","User1");
        
        
       // request.header("header2","User2");
        response = request.when().get("http://dummy.restapiexample.com/api/v1/employees");//Submit the request
        
        System.out.println(response.getStatusCode());
        ResponseBody body = response.getBody();
        System.out.println(body.asString());
        
        JSONParser parse=new JSONParser();
        FileReader fi=new FileReader("C:\\Users\\Lenovo\\Documents\\CucumberFrameWork\\sample.json");
        
        Object obj= parse.parse(fi);
       
        JSONArray arr=(JSONArray)obj;
        for(int i=0;i<arr.size();i++) 
        {
        JSONObject users = (JSONObject) arr.get(i);
      //  System.out.println(users);//This prints every block - one json object
       Iterator it= users.entrySet().iterator();
       while(it.hasNext()){
    	   System.out.println(it.next());
       }
       //JSONObject user = (JSONObject) users.get("users");
       // System.out.println(user); //This prints each data in the block
        //String username = (String) user.get;
        //String password = (String) user.get("employee_salary");
         // System.out.println("The username in JSON is -> "+username);
          //System.out.println("The password in JSON is -> "+password);
   }
	}

}
