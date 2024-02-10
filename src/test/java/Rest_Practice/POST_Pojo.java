package Rest_Practice;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import pojo.UserLibrary;

public class POST_Pojo 
{
	public static void main(String[] args) {
		UserLibrary ul=new UserLibrary("Me","AT");
		
		RequestSpecification req = RestAssured.given();
		req.body(ul);
		req.contentType(ContentType.JSON);
		
		Response response = req.post("https://reqres.in/api/users");
		response.then().log().all();
	}

}
