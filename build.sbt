name := "spark-template"

version := "0.1"

scalaVersion := "2.11.11"

val sparkVersion = "2.1.0"

val sparkDependencies = Seq(
  "org.apache.spark" %% "spark-core" % sparkVersion,
  "org.apache.spark" %% "spark-sql" % sparkVersion,
  "org.apache.spark" %% "spark-mllib" % sparkVersion
)

libraryDependencies ++= sparkDependencies