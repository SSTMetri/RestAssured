package Practice;

import org.json.simple.JSONObject;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class PetStore 
{
	public static void main(String[] args) 
	{
		JSONObject a=new JSONObject();
		a.put("id", 0);
		a.put("username", "aaaa");
		a.put("firstName", "ababa");
		a.put("lastName", "cccc");
		a.put("email", "dddd");
		a.put("password","eeeeee");
		a.put("phone", "5421");
		a.put("userStatus",5);
		
		RequestSpecification req = RestAssured.given();
		req.body(a);
		req.contentType(ContentType.JSON);
		Response response = req.post("https://petstore.swagger.io/v2/user");
		
		response.then().log().all();
		
	}
}
