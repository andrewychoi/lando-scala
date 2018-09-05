import slick.jdbc.H2Profile.api._
import slick.lifted.{ProvenShape, ForeignKeyQuery}

class People(tag: Tag)
  extends Table[(Int, String, Option[String], Option[String], String, Int)](tag, "people") {

  // This is the primary key column:
  def id: Rep[Int] = column[Int]("id", O.PrimaryKey, O.AutoInc)
  def name: Rep[String] = column[String]("name")
  def relationship: Rep[Option[String]] = column[Option[String]]("relationship")
  def email: Rep[Option[String]] = column[Option[String]]("email")
  def freq_unit: Rep[String] = column[String]("freq_unit")
  def freq_period: Rep[Int] = column[Int]("freq_period")
  
  // Every table needs a * projection with the same type as the table's type parameter
  def * : ProvenShape[(Int, String, Option[String], Option[String], String, Int)] =
    (id, name, relationship, email, freq_unit, freq_period)
}