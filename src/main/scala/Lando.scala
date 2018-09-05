import slick.jdbc.H2Profile.api._

object Lando extends App {
	println("Hello World!")
	val people = TableQuery[People]
	people.schema.create.statements.foreach(println)
}