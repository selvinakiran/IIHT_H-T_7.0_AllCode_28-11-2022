
// var name = "Selvina"
// var age = 26;
// var Graduate = true;
// var laptop;
// lap = "Asus";
// console.log(name);

// function alertUser() {
//     var favoritrCar = "AUDI"

//     console.log("The user is logged " + name);
//     // alert("The user is logged " +name)
// }
// alertUser();
// function operation(num) {
//     if (num > 20) {
//         console.log("Number is greater than 20");
//     }
//     else if (num == 20) {
//         console.log("Number is equal to  20");
//     }
//     else {
//         console.log("Number is less than   20");
//     }
// }

// operation(100);

function creditscore(score) {
    var creditLimit;
    switch (score) {
        case 800: creditLimit = "above 1 Lac";
            break;
        case 700: creditLimit = "50 K to 1 Lac";
            break;
        case 600: creditLimit = "10 K to 25 K";
            break;
        default: creditLimit = "Not eligble";
            break;

    }
    console.log(creditLimit);
}
creditscore(600);

function counting() {
    for (let i = 1; i < 10; i++) {
        console.log(i);

    }
}
counting();

var car = new Object();
car.brand = "AUDI"
car.model = "R15"
car.price = 8000000

console.log(car);

var names = ["robi", "Pappu", "Selu"];
console.log(names);

//class Car{ //old way  //inialize any object

let Car = class { //new way
    constructor(brand, modelname, prize) {
        this.brand = brand;
        this.modelname = modelname;
        this.prize = prize;

    }

    print() {
        console.log("This is the " + this.brand + " " + this.modelname + " " + this.prize);
    }
}

var c1 = new Car("AUDI", "R15", 800000000);
var c2 = new Car("Baleno", "Z", 500000);
c1.print();
c2.print();

class TodaysDate extends Date //Eg to make a class as child class of a inbuild JS class 
{
    constructor() {
        super();
    }


    printDate() {
        console.log(this.getDate());
        console.log(this.getTime());
    }
}
let today = new TodaysDate();  //new way of calling class
today.printDate();

class AppleLaptops{         //Parent class
    constructor(brand){
    this.brand="Apple";
    }
}

class MacBookPro extends AppleLaptops{      //child class
    constructor(model,processor,ram){
        super();
        this.model =model;
        this.processor=processor;
        this.ram=ram;

    }
}

let level = new MacBookPro (" mackpro12 ", " i7 ",16)
console.log("This is the " + level.brand + " " + level.model + " " + level.ram);

// ... Spread operator and its copy all the elements of the array named afterg the use of it 
let fruits = ["Apple","banana"]

let seasonfruits =["Mango","grapes"]

let allfruits =[...fruits, ...seasonfruits];

console.log(allfruits);

//Inline function (Arrow function) Conventional Method 

let amount = () =>
{
    for(let i =1;i<10;i++)
    {
        console.log(i);
    }
}
amount();

//there are three keywords used to declare a variable in java script
// var ===>this has a scope of functions which can be re declared 

var num1=1000;
var num1= 2000;
console.log(num1);

// let ====> Was announced in ES6, it has block scope , variable declared using let cannot be re declared 

//let a= 100;  //If it is enabled also the value will not be taken
function addnumbers(){
    a=200;
    let b=300;
    console.log(a+b);
}
addnumbers();
console.log(a +1000);

//const ===> it stands for constant you cannot change the values directly ,this is also a scope of block

function addnumber2(){
    const num3=350;
    //const num3 =400; cannot be done like this

}


function dogs(){
    this.dogname = "Lab"
    throw new error("This is not a wild dog");

}

dogs.prototype.display = function(){
    return "the dog breed is "+ this.dogname;
}

//constructor Function

function Animal(dogname){
    this.dogname = dogname;
}

//Create an object without using constructor

Animal.prototype = Object.create(dogs.prototype)
let tommy = new Animal("Dolmination")
console.log(tommy.display());

function greet(){
    alert("Greeting from Training");
}



