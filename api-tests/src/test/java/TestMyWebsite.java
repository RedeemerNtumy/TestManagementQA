import io.qameta.allure.restassured.AllureRestAssured;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

class TestMyWebsite {

    @Test
    void testSomeRequest() {
        given()
                .filter(new AllureRestAssured())
                .get("https://jsonplaceholder.typicode.com/todos/1")
                .then()
                .body("userId", equalTo(1));
    }
}
