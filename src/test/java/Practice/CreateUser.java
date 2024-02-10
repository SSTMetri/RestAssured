package Practice;

import org.json.simple.JSONObject;

import io.restassured.RestAssured;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class CreateUser 

{
	public static void main(String[] args) {
		//Step 1 : Create required Resuest body
		//Create an object of JSONObject class from json simple tool
		JSONObject j=new JSONObject();
		j.put("name", "xyz");
		j.put("job", "QA");
		
		//Step 2 : Send the request
		//To send the request we use REST ASSURED
		//TO use the body, we use given() -is a static method in rest assured class
		//Given() will return request specification- is an interface
		//Request specification has metods like body()
		//Through this body() method 
		//Body is an interface coming from
		RequestSpecification req = RestAssured.given();
		req.body(j);
		req.contentType(ContentType.JSON);
		//Response is an interface in rest assured library
		Response response = req.post("https://reqres.in/api/users");
		
		//Step 3 : Validate/print the response
		//We have mthod then(), log() all()--> will print response in console
		response.then().log().all();
		
		
		
	}

}
