package Rest_Practice;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class DELETE_Method 
{
	public static void main(String[] args) {
		Response response = RestAssured.delete("https://reqres.in/api/users/2");
		response.then().log().all();
	}

}
