package Practice;

import org.json.simple.JSONObject;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class PetStorePOST {
	public static void main(String[] args) 
	{
		//Step1 Create required Resuest body
		JSONObject obj=new JSONObject();
		obj.put("petId", 2);
		obj.put("quantity",3);
		obj.put("shipDate", "2023-08-23T09:03:22.056Z");
		obj.put("status", "placed");
		obj.put("complete", true);
		
		//Step2 send request
		RequestSpecification req = RestAssured.given();
		req.body(obj);
		req.contentType(ContentType.JSON);
		
		Response response = req.post("https://petstore.swagger.io/v2/store/order");
		
		//Step3 Validate/print the response
		response.then().log().all();
	}

}
