package Practice;

import org.json.simple.JSONObject;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Post_Second 
{
	public static void main(String[] args) {
		//Step1
		JSONObject j=new JSONObject();

		j.put("email", "eve.holt@reqres.in");
		j.put("password", "passwordIS");
	
		//Step 2 
		RequestSpecification req = RestAssured.given();
		req.body(j);
		req.contentType(ContentType.JSON);
		
		Response response = req.post("https://reqres.in/api/register");
		
		//Step 3
		response.then().log().all();
	}

}
