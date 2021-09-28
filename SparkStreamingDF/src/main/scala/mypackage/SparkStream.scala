package mypackage

import org.apache.spark.sql._
import org.apache.spark.sql.functions._
import org.apache.spark.sql.streaming._
import org.apache.spark.sql.types._

object SparkStream {

  def Main(args: Array[String]): Unit = {
    val spark = SparkSession
    .builder
    .master("local[*]")
    .appName ("Stream Handler")
    .getOrCreate ()

    println ("Hello Spark")

    spark.stop

  }
}
