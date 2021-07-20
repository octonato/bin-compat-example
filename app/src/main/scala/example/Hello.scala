package example

import com.github.wrapper.LoggerWrapper
object Hello extends App {
  val log = new LoggerWrapper

  log.info("foo")
  log.logger.info("bar")
  
  log.logger.info(new RuntimeException("bang"), "bang")
}
