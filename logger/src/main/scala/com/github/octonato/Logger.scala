package com.github.octonato

trait Logger {
  def info(msg: String): Unit
  def info(thr: Throwable, msg: String): Unit
}