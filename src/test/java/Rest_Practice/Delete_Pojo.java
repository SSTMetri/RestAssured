package Rest_Practice;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import pojo.UserLibrary_PUT;

public class Delete_Pojo 
{
	public static void main(String[] args) {
		UserLibrary_PUT up=new UserLibrary_PUT("tester","Manual");
		
		RequestSpecification req = RestAssured.given();
		req.body(up);
		req.contentType(ContentType.JSON);
		
		Response response = req.put("https://reqres.in/api/users/2");
		response.then().log().all();
		
	}

}
