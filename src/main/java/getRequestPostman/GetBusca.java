package getRequestPostman;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;


//BuscaAutomatizadaComJavaRestPostman
public class GetBusca {

	@Test
	public void testResponseMake() {
		given()
		.when()
			.get("http://desafioonline.webmotors.com.br/api/OnlineChallenge/Make")
		.then()
			.statusCode(200)
			.body(containsString("Honda"));
	}

	@Test
	public void post() {
		given()
			.contentType("application/json")
			.body("{\"ID\": 2 }")
		.when()
			.post("http://desafioonline.webmotors.com.br/api/OnlineChallenge/Make")
		.then()
		.statusCode(200);
		;
	}
	
	@Test
	public void getCity() {
		
		Response response = RestAssured.request(Method.GET, "http://desafioonline.webmotors.com.br/api/OnlineChallenge/Model?MakeID=2");
		List<Integer> listMakeID = Arrays.asList(2,2,2);
		assertEquals(listMakeID, response.path("MakeID"));
		
		List<Integer> listID = Arrays.asList(4,5,6);
		assertEquals(listID, response.path("ID"));
				
		List<String> listName = Arrays.asList("City","CRV","Fit");
		assertEquals(listName, response.path("Name"));
		
		given()
		.when()
			.get("http://desafioonline.webmotors.com.br/api/OnlineChallenge/Model?MakeID=2")
		.then()
		.statusCode(200)
		.body("MakeID[0]", is(2))
		.body("ID[0]", is(4))
		.body("Name[0]", containsString("City"))
		;
	}
	
	@Test
	public void getCityModelos() {
		Response response = RestAssured.request(Method.GET, "http://desafioonline.webmotors.com.br/api/OnlineChallenge/Version?ModelID=4");
		
		List<Integer> listMakeID = Arrays.asList(4,4,4,4);
		assertEquals(listMakeID, response.path("ModelID"));
		
		List<Integer> listID = Arrays.asList(21,22,23,24,25 );
		assertEquals(listID, response.path("ID"));
		
		List<String> listName = Arrays.asList("1.5 DX 16V FLEX 4P AUTOM햀ICO",
											  "1.5 LX 16V FLEX 4P MANUAL",
											  "1.8 16V EVO FLEX FREEDOM OPEN EDITION AUTOM햀ICO",
											  "1.0 MPI EL 8V FLEX 4P MANUAL"
												);
		assertEquals(listName, response.path("Name"));
	}
		
	@Test
	public void getVersoesCity() {
		given()
		.when()
			.get("http://desafioonline.webmotors.com.br/api/OnlineChallenge/Version?ModelID=4")
		.then()
		.statusCode(200)
		.body("Name[0]", containsString("1.5 DX 16V FLEX 4P AUTOM햀ICO"))
		.body("Name[1]", containsString("2.0 EXL 4X4 16V GASOLINA 4P AUTOM햀ICO"))
		.body("Name[2]", containsString("1.8 16V EVO FLEX FREEDOM OPEN EDITION AUTOM햀ICO"))
		.body("Name[3]", containsString("1.0 MPI EL 8V FLEX 4P MANUAL"))
		;
	}

	@Test
	public void getCarrosIDs() {
	List<Integer> ID = Arrays.asList(4,5,6);
	ArrayList<String> nomes = 
	
	given()
	.when()
		.get("http://desafioonline.webmotors.com.br/api/OnlineChallenge/Model?MakeID=2")
	.then()
		.statusCode(200)
		.extract().path("ID.findAll{1}")
	;
	Assert.assertEquals(ID, nomes);
	}
	
	
	@Test
	public void getCarrosNomes() {
	List<String> carros = Arrays.asList("City","CRV","Fit");
	ArrayList<String> nomes = 
	
	given()
	.when()
		.get("http://desafioonline.webmotors.com.br/api/OnlineChallenge/Model?MakeID=2")
	.then()
		.statusCode(200)
		.extract().path("Name.findAll{it}")
	;
	Assert.assertEquals(carros, nomes);	
	}
}
