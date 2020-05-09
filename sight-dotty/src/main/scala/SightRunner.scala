import sight.client.SightClient
import sight.models.{Error, Pages}

object SightRunner extends App{
    val a: SightClient = ???
    val result: Either[Error, Pages] = ???
    val apiKey: sight.types.APIKey = ???
}
