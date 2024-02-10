package Practice;

import org.json.simple.JSONObject;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class PetStoreExample2 
{
	public static void main(String[] args) {
		//step1
		JSONObject obj=new JSONObject();
		obj.put("id", 5);
		obj.put("username", "DFGh");
		obj.put("firstName", "mnbbnm");
		obj.put("lastName","JUJU");
		obj.put("email", "GF@THJKL.com");
		obj.put("password","85225");
		obj.put("phone","8563201");
		obj.put("userStatus",0);
		//step2
		RequestSpecification req = RestAssured.given();
		req.body(obj);
		req.contentType(ContentType.JSON);
		Response response = req.post("https://petstore.swagger.io/v2/user/createWithArray");
		//step3
		response.then().log().all();

		
	}

}
