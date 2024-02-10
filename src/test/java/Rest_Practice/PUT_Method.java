package Rest_Practice;

import org.json.simple.JSONObject;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class PUT_Method 
{
	public static void main(String[] args) {
		JSONObject j=new JSONObject();
		j.put("name","s");
		j.put("job","manager");
		
		RequestSpecification req = RestAssured.given();
		req.body(j);
		req.contentType(ContentType.JSON);
		
		Response response = req.put("https://reqres.in/api/users/2");
		
		response.then().log().all();
	}

}
