package Practice;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Reqres_GET 
{
	public static void main(String[] args) {
		
		//Step2 send the request
		Response res=RestAssured.get("https://reqres.in/api/unknown");
		
		//Step3 validate the response
		res.then().log().all();
		
	}

}
