package Practice;

import org.json.simple.JSONObject;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Patch_Ex 
{
	public static void main(String[] args) {
		JSONObject j=new JSONObject();
		//For patch we can give partial data, that is data which needs to be updated
		j.put("job", "jobless");
		
		RequestSpecification req = RestAssured.given();
		req.body(j);
		req.contentType(ContentType.JSON);
		Response response = req.patch("https://reqres.in/api/users/2");
		
		response.then().log().all();
		
	}


}
