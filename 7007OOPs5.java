/* Write a Java Program to create a class called "Book" with attributes for title, author, and ISBN, and methods to add and remove books from a colletion */

class Book
{
String title,author,ISBN;


void add(String title2,String author2,String ISBN2)
{
title=title2;
author=author2;
ISBN=ISBN2;

System.out.println("Successfully Added"); 
}


void remove(String ISBN2)

{
if(ISBN2==ISBN)
{
title=null;
author=null;
ISBN=null;
System.out.println("Successsfully removed from the collection");
}
else
{
System.out.println("This ISBN number does not exist in our collection");
}

}

public static void main(String args[])
{
Book obj1 = new Book();
obj1.add("The Grass is Always Greener","Jeffrey Archer","1-86092-049-7");
obj1.remove("1-86092-049-7");

System.out.println("\n\n");

Book obj2 = new Book();
obj2.add("A Boy at Seven","John Bidwell","1-86092-022-5");
obj2.remove("1-86092-024-5");

 



}



}