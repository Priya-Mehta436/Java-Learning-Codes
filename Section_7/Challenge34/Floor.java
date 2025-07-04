/* 
The Carpet Company has asked you to write an application that calculates the price of carpeting for rectangular rooms. To calculate the price, you multiply the area of the floor (width times length) by the price per square meter of carpet. For example, the area of the floor that is 12 meters long and 10 meters wide is 120 square meters. To cover the floor with a carpet that costs $8 per square meter would cost $960.
1. Write a class with the name Floor. The class needs two fields (instance variables) with name width and length of type double.
The class needs to have one constructor with parameters width and length of type double and it needs to initialize the fields.

In case the width parameter is less than 0 it needs to set the width field value to 0, in case the length parameter is less than 0 it needs to set the length field value to 0.

Write the following methods (instance methods):
Method named getArea without any parameters, it needs to return the calculated area (width * length).


2. Write a class with the name Carpet. The class needs one field (instance variable) with name cost of type double.
The class needs to have one constructor with parameter cost of type double and it needs to initialize the field.
In case the cost parameter is less than 0 it needs to set the cost field value to 0.

Write the following methods (instance methods):
Method named getCost without any parameters, it needs to return the value of cost field

3. Write a class with the name Calculator. The class needs two fields (instance variables) with name floor of type Floor and carpet of type Carpet.
The class needs to have one constructor with parameters floor of type Floor and carpet of type Carpet and it needs to initialize the fields.

Write the following methods (instance methods):
Method named getTotalCost without any parameters, it needs to return the calculated total cost to cover the floor with a carpet.

*/



package Section_7.Challenge34;

public class Floor {
    // write code here
    private double width;
    private double length;
    
    public Floor (double width, double length)
    { 
        if(width<0){
            width = 0;
        }
        if(length<0){
            length = 0;
        }
        
        this.width = width;
        this.length = length;
        
    }
    public double getArea(){
        return width * length;
    }
    
    
}
