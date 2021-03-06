addSbtPlugin("com.github.mpeltonen" % "sbt-idea" % "1.6.0")

addSbtPlugin("net.virtual-void" % "sbt-dependency-graph" % "0.7.4")

// aggregate tasks across subprojects and their crossScalaVersions
// use `very publishSigned` to cross publish subprojects.
addSbtPlugin("com.eed3si9n" % "sbt-doge" % "0.1.1")