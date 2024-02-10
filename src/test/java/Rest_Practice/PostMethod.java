package Rest_Practice;

import org.json.simple.JSONObject;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class PostMethod 
{
	public static void main(String[] args) {
		//Step 1
		JSONObject j=new JSONObject();
		j.put("name","morpheus");
		j.put("job","leader");
		
		//Step 2
		RequestSpecification req = RestAssured.given();
		req.body(j);
		req.contentType(ContentType.JSON);
		
		Response response = req.post("https://reqres.in/api/users");
		
		//Step 3
		response.then().log().all();
	}

}
