# BankSimulator
first practical assignment for Computer Lab 3 - UTN FRMDP

/////////////////////////////
Includes: Inheritance, Polimorphism, abstract classes, interfaces, Overridden methods (ToString, Equals, HashCode), Collections (HashMap, ArrayList), Operations with UUID and LocalDate/LocalDateTime classes



This is a project based on the following exercises proposed by the professor:

Model an object called Employee with the following characteristics: ID, name,
last name and salary. 
It must be able to calculating the annual salary. 
In turn, another method is required to increase the salary
depending on the percentage that is passed by parameter.
Consider creating a method to print on screen the characteristics of the object of the
following form:
Employee [ID = ?, first name = ?, last name = ?, salary =?]
	a. Initialize an employee Carlos Gutiérrez, with ID 23456345 and starting salary of 25000.
	b. Initialize an employee Ana Sánchez, with ID 34234123 and starting salary of 27500.
	c. Print both objects per screen
	d. Increase the salary of employee Carlos by 15% and print on screen the annual salary of the same.


Model a Sales Item object with the following properties: identifier, description, quantity and unit price.
Create the methods to calculate the total price taking into account the unit price and quantity,
 and a method that allows print on screen the attributes of the object as follows:
ItemVenta [id = ?, description = ?, quantity = ?, pUnitary = ?, pTotal =?]
	a. Initialize the object with the required attributes
	b. Print the initialized object on the screen.


Model the object that represents a bank account, with an identifier, a name,
and a balance. Consider the necessary getters, setters, and constructors. Take into
account the following methods:
	a. The credit method that represents a deposit of money in the account. This
method should return the balance after the trade.
	b. The debit method that represents a withdrawal of money from the account.
This method should return the balance after the trade. If the money in
the account is not sufficient to cover the transaction, it must be printed by
display a notice.
	c. A method that prints the characteristics of the object on the screen.

Perform the following operations:
1. Initialize an account with a starting amount of 15000.
2. Make a credit operation of 2,500.
3. Place a buy trade for 1500.
4. Make a buy trade for 30,000.
5. Print the account values on the screen and verify that the balance is right.

/////////////////////////////
Original text:
Modele el objeto Empleado que posee las siguientes características, dni, nombre,
apellido y salario. El mismo debe contar con la posibilidad de calcular el salario
anual. A su vez se requiere otro método que permita aumentar el salario
dependiendo del porcentaje que se le pase por parámetro. Considere crear un
método que facilite imprimir por pantalla las características del objeto de la
siguiente forma:
Empleado[dni=?, nombre=?, apellido=?, salario=?]
a. Inicialice un empleado Carlos Gutiérrez, con dni 23456345 y salario inicial de
25000.
b. Inicialice un empleado Ana Sánchez, con dni 34234123 y salario inicial de
27500.
c. Imprima ambos objetos por pantalla
d. Aumente el salario del empleado Carlos en un 15% e imprima en pantalla el
salario anual del mismo.
3. Modele el objeto Ítem de Venta con las siguientes propiedades, identificador,
descripción, cantidad y precio unitario. Cree los métodos para calcular el precio
total teniendo en cuenta el precio unitario y cantidad. Un método que permita
imprimir por pantalla los atributos del objeto de la siguiente forma:
ItemVenta[id=?, descripción=?, cantidad=?, pUnitario=?, pTotal=?]
a. Inicialice el objeto con los atributos necesarios
b. Imprima por pantalla el objeto inicializado.
4. Modele el objeto que representa la cuenta de un banco, con identificador, nombre
y balance. Considere los getters, setters y constructores necesarios. Tenga en
cuenta los siguientes métodos.
a. El método crédito que representa un depósito de dinero en la cuenta. Este
método debe devolver el balance luego de la operación.
b. El método débito que representa una sustracción de dinero de la cuenta.
Este método debe devolver el balance luego de la operación. Si el dinero en
la cuenta no es suficiente para cubrir la sustracción, se debe imprimir por
pantalla un aviso.
c. Un método que imprima por pantalla las características del objeto.
Realice las siguientes operaciones:
1. Inicialice una cuenta con un monto inicial de 15000.
2. Realice una operación de crédito de 2500.
3. Realice una operación de compra de 1500.
4. Realice una operación de compra de 30000.
5. Imprima por pantalla los valores de la cuenta y verifique que el balance sea
correcto.
