val host = "http://localhost:8080"

class TestMainSuite extends munit.FunSuite {
    test("Homepage response's status code must be 200") {
        val response = requests.get(host)
        assertEquals(response.statusCode, 200)
    }

    test("Homepage response's text must be 'Hello Pastebin'") {
        val response = requests.get(host)
        assertEquals(response.text(), "Hello Pastebin")
    }
}
