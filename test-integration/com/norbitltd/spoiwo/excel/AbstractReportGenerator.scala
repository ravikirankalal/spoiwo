package com.norbitltd.spoiwo.excel

import org.apache.commons.logging.LogFactory

abstract class AbstractReportGenerator {

  def log = LogFactory.getLog(this.getClass)

  def getWorkbook : XWorkbook

  def main(args : Array[String]) {
    try {
      val fileName = args.head
      println("Generating test report for " + fileName)
      val workbook = getWorkbook
      workbook.save(fileName)
      println("Report generated successfully!")
    } catch {
      case e : Exception => {
        println("Error generating test report, cause: " + e.getMessage, e)
        e.printStackTrace()
      }
    }

  }

}