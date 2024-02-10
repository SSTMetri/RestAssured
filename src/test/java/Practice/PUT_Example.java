 package Practice;

import org.json.simple.JSONObject;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class PUT_Example 
{
	public static void main(String[] args) {
		JSONObject j=new JSONObject();
		j.put("name", "MAp");
		j.put("job", "QA");
		
		RequestSpecification req = RestAssured.given();
		req.body(j);
		req.contentType(ContentType.JSON);
		Response response = req.put("https://reqres.in/api/users/2");
		
		response.then().log().all();
		
	}

}
