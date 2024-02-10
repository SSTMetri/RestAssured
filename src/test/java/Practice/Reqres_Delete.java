package Practice;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Reqres_Delete 
{
	public static void main(String[] args) {
		Response res = RestAssured.delete("https://reqres.in/api/users/2");
		res.then().log().all();
		
		//Response code -204
		
	}

}
