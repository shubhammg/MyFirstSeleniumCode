package Testing.Test2;
import org.testng.annotations.Test;

import io.restassured.response.Response;
import io.restassured.response.ResponseBody;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import  static org.hamcrest.Matchers.*;
public class GetTest {
	
	@Test
	void testingGet() {
     given().get("https://reqres.in/api/users?page=2").then().body("data.id[0]", equalTo(7));
     ResponseBody response = get("https://reqres.in/api/users?page=2").body();     
     System.out.println(response.asString());
}
}