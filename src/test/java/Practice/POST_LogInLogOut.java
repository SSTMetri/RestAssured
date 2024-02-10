package Practice;

import org.json.simple.JSONObject;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class POST_LogInLogOut 
{
	public static void main(String[] args) 
	{
		JSONObject j=new JSONObject();
		j.put("email","eve.holt@reqres.in");
		j.put("password","cityslicka");
		
		RequestSpecification req = RestAssured.given();
		req.body(j);
		req.contentType(ContentType.JSON);
		Response response = req.post("https://reqres.in/api/login");
		
		response.then().log().all();
		
		
		
		JSONObject j1=new JSONObject(); 
		j1.put("email", "peter@klaven");
		
		RequestSpecification req1 = RestAssured.given();
		req1.body(j1);
		req1.contentType(ContentType.JSON);
		Response resp = req1.post("https://reqres.in/api/login");
		resp.then().log().all();
//		Response - 400
//		{
//			"error": "Missing password"
//		}
		
		
	}

}
