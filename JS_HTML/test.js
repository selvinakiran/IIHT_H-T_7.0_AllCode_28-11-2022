class employees{         //Parent class
    constructor(brand){
    this.companyname="CTS";
    }
}

class Developers extends employees{      //child class
    constructor(employeename,experience,position){
        super();
        this.employeename = employeename;
        this.experience= experience;
        this.position= position;

    }
}

class HR extends employees{      //child class
    constructor(employeename, experience, position) {
        super();
        this.employeename = employeename;
        this.experience = experience;
        this.position = position;

    }
}

class Sales extends employees{      //child class
    constructor(employeename, experience, position) {
        super();
        this.employeename = employeename;
        this.experience = experience;
        this.position = position;

    }
}

class Marketing extends employees{      //child class
    constructor(employeename, experience, position) {
        super();
        this.employeename = employeename;
        this.experience = experience;
        this.position = position;

    }
}
class QA extends employees{      //child class
    constructor(employeename, experience, position) {
        super();
        this.employeename = employeename;
        this.experience = experience;
        this.position = position;

    }
}


let a1 = new Developers (" Selvina ", " 4 ","IT");
let a2 = new HR (" Anu ", " 3 ","IT");
let a3 = new Sales (" ROBI ", " 5","Manufacturing");
let a4 = new Marketing (" Suguna ", " 6 ","Market");
let a5 = new QA (" Mithu ", " 7 ","school");

console.log("This is the " + a1.employeename + " " + a1.experience + " " + a1.position);
console.log("This is the " + a2.employeename + " " + a2.experience + " " + a2.position);
console.log("This is the " + a3.employeename + " " + a3.experience + " " + a3.position);
console.log("This is the " + a4.employeename + " " + a4.experience + " " + a4.position);
console.log("This is the " + a5.employeename + " " + a5.experience + " " + a5.position);