package example

import com.github.wrapper.LoggerWrapper
object Hello extends App {
  val log = new LoggerWrapper

  log.info("hey")
  log.logger.info("ola")
}
