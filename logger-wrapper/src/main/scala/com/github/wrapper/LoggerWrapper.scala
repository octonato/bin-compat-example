package com.github.wrapper

import com.github.octonato.Logger

class LoggerWrapper extends Logger {

  val logger = new Logger {
    def info(msg: String): Unit = println(s"[$msg]")
  }
  override def info(msg: String): Unit = logger.info(s"=$msg=")
}