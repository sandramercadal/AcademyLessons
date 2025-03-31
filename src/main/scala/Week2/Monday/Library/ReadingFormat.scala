package Week2.Monday.Library

import Week2.Monday.family


//Define class named ReadingFormat - a base class for defining various reading formats.
// However, since it has no properties or methods defined, it's essentially an empty class at this point.
class ReadingFormat

trait AudioBook extends ReadingFormat

trait DigitalBook extends ReadingFormat

trait PhysicalBook extends ReadingFormat
//This defines a trait named AudioBook, which inherits from the ReadingFormat class.
// Any class or trait that extends AudioBook will also be considered a type of ReadingFormat.

/**

 //ReadingFormat is a superclass

 By having each format extending the superclass/parent 'ReadingFormat' we are grouping these together and giving each trait access to any methods in the parent class.
 * EXTENDING
 //Extend with ket word 'extends' e.g extends ReadingFormat'
 //We can only extend 1 class per 'thing' (object, trait, class).
 //By having each format extending the superclass/parent "ReadingFormat' we are grouping these together
 // and giving each trait access to any methods in the parent class.

 { delete the curly brackets here as we don't have any parameters }
 */










