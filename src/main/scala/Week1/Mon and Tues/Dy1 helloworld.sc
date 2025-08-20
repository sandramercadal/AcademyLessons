print("hello world") //hello world

//How do we print each word on a separate line - Research

//VAL = value that cannot be re-assigned / is immutable
//e.g
val cakesRequired = 10 * 2

val stringLength = "What is the length of this string?"

println(stringLength.length) //34
println("hello world".mkString("\n")) //print spaces between letters
println("hello wonderful".toList.mkString("\n"))


//def greet: String = "hello world!".reverse
//  .toCharArray()
//  .reverse
//  .mkString
//  .reverse
//  .toCharArray()
//  .reverse
//  .mkString
//println(greet)



//VAR can be re-assigned

//INT - looking for whole numbers



/**Git ignore

.*

!.gitignore
!.scalafmt.conf
bin
  .bloop/
.cache
/.classpath
db
dist
  .DS_Store
*.DS_Store
eclipse
*.eml
.history
.idea
.idea_modules
/.idea_modules
*.iml
lib
lib_managed
log
logs
.metals/
modules
/out
precompiled
/.project
project/metals.sbt
project/project
project/target
/RUNNING_PID
server.pid
/.settings
target
.target
test-result
tmp
.vscode/
 **/