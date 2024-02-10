package Rest_Practice;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GET_Method
{
	public static void main(String[] args) {
		
		Response response = RestAssured.get("https://reqres.in/api/users?page=2");
		response.then().log().all();
		
	}
}
