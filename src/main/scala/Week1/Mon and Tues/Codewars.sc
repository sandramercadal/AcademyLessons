/**Q1 you received a whatsup message from an unknown number. Could it be from that girl/boy with a foreign accent you met yesterday evening?

Write a simple function to check if the string contains the word hallo in different languages.

  These are the languages of the possible people you met the night before:

  hello - english
ciao - italian
salut - french
hallo - german
hola - spanish
ahoj - czech republic
  czesc - polish */
def containsGreeting(message: String): Boolean = {
  val greetings = List("hello", "ciao", "salut", "hallo", "hola", "ahoj", "czesc")
  greetings.map(message.toLowerCase.contains).contains(true)
}
println(containsGreeting("hello"))

//Q2
 /**Create a function finalGrade, which calculates the final grade of a student depending on two parameters: an exam grade & number of completed projects.
  This function should take two arguments: exam - grade for exam (from 0 to 100); projects - number of completed projects (from 0 and above);
  This function should return a number (final grade). There are four types of final grades:
  100, if a grade for the exam is more than 90 or if a number of completed projects more than 10.
  90, if a grade for the exam is more than 75 and if a number of completed projects is minimum 5.
  75, if a grade for the exam is more than 50 and if a number of completed projects is minimum 2.
  0, in other cases

Create a function finalGrade, which calculates the final grade of a student depending on two parameters: a grade for the exam and a number of completed projects.

This function should take two arguments: exam - grade for exam (from 0 to 100); projects - number of completed projects (from 0 and above);

This function should return a number (final grade). There are four types of final grades:

  100, if a grade for the exam is more than 90 or if a number of completed projects more than 10.
90, if a grade for the exam is more than 75 and if a number of completed projects is minimum 5.
75, if a grade for the exam is more than 50 and if a number of completed projects is minimum 2.
0, in other cases
Examples(Inputs-->Output):
  100, 12 --> 100
99, 0 --> 100
10, 15 --> 100
85, 5 --> 90
55, 3 --> 75
55, 0 --> 0
20, 2 --> 0 */

 def finalGrade(exam: Int, projects: Int): Int = {
   if (exam > 90 || projects > 10) {
     100
   } else if (exam > 75 && projects >= 5) {
     90
   } else if (exam > 50 && projects >= 2) {
     75
   } else {
     0
   }
 }
println(finalGrade(100, 12)) // 100
println(finalGrade(99, 0))   // 100
println(finalGrade(85, 5))   // 90
println(finalGrade(55, 3))   // 75
println(finalGrade(55, 0))   // 0
println(finalGrade(20, 2))   // 0

//Someone elses code with match case
//def finalGrade(exam: Int, projects: Int): Int = (exam, projects) match
//case (e, p) if e > 90 || p > 10 => 100
//case (e, p) if e > 75 && p >= 5 => 90
//case (e, p) if e > 50 && p >= 2 => 75
//case _                          => 0