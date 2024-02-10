package Rest_Practice;

import org.json.simple.JSONObject;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class PATCH_Method 
{
	public static void main(String[] args) {

		JSONObject j=new JSONObject();
		
		j.put("job","monkey");
	
		RequestSpecification req = RestAssured.given();
		req.body(j);
		req.contentType(ContentType.JSON);
	
		Response response = req.patch("https://reqres.in/api/users/2");
	
		ValidatableResponse validate = response.then();
		validate.log().all();
		response.then().log().all();
	}

}
