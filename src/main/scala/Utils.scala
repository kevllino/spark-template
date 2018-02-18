import org.apache.spark.sql.SparkSession

object Utils {

  def createSparkSession(appName: String) =
    SparkSession
      .builder()
      .appName(appName)
      .getOrCreate()

}
