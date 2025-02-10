package Week2.Monday.Library

//{
//delete the curly brackets here as we don't have any parameters
//}//

//ReadingFormat is a superclass
class ReadingFormat

//Extend them with 'extends ReadingFormat'
//We can only extend 1 class per 'thing' (object, trait, class).
//By having each format extending the superclass/parent "ReadingFormat' we are grouping these together
// and giving each trait access to any methods in the parent class.

//
trait AudioBook extends ReadingFormat

trait DigitalBook extends ReadingFormat

trait PhysicalBook extends ReadingFormat






