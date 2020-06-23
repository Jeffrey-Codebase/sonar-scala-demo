import org.scalatest._

class ExampleTest extends FlatSpec with Matchers {
  "App" should "say hello" in {
    App.hello() shouldBe "Hello Sonar"
  }
}
