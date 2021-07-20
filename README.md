# bin incompatibility example with traits

This small samples demonstrates the impact of adding a method on a public trait.

* `logger` has a Logger trait
* `logger-wrapper` uses the Logger trait
* `app` uses both

Switch to first (initial) commit in repo:

* cd logger && sbt publishLocal && cd ../
* cd logger-wrapper && sbt publishLocal && cd ../
* cd app && sbt run // works

Switch to second commit in repo:

* cd logger && sbt publishLocal && cd ../
* cd app && sbt run // broken

Switch to HEAD in repo:

* cd logger && sbt publishLocal && cd ../
* cd app && sbt run // fixed
