package Week5.Mon

// My MenuData object contains a list of MenuItem instances as working with collections of case classes means I can filter, map and fold using standard collection methods.
//Enhances safety.
//Code is more maintainable as its a cafe they may want to change their menu.

object MenuData {
  val menuItems: List[MenuItem] = List (
    MenuItem ("Croissant", 2.50, "Bakery", isSpecial = false),
    MenuItem ("bagel", 2.00, "Bakery", isSpecial = false),
    MenuItem ("Muffin", 2.50, "Bakery", isSpecial = false),
    MenuItem ("Donut", 2.50, "Bakery", isSpecial = false),
    MenuItem ("Mocha", 3.50, "Beverages", isSpecial = false),
    MenuItem ("Espresso", 2.50, "Beverages", isSpecial = false),
    MenuItem ("latte", 3.50, "Beverages", isSpecial = false),
    MenuItem ("Americano", 3.50, "Beverages", isSpecial = false),
    MenuItem ("Hot Chocolate", 3.50, "Beverages", isSpecial = false),
    MenuItem ("Sandwich", 5.50, "Lunch", isSpecial = false),
    MenuItem ("Wrap", 5.00, "Lunch", isSpecial = false),
    MenuItem ("Salad", 5.50, "Lunch", isSpecial = false),
    MenuItem ("Panini", 5.50, "Lunch", isSpecial = false),
  )
  //get a printline but no runnable button on this page
  println (MenuItem("Croissant", 2.50, "Bakery", isSpecial = false))
  menuItems.foreach(println)
//(menuItems.foreach => println (s" The cafe sells (item.name)")) Not sure this works




}
