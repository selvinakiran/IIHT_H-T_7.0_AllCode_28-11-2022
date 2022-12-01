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

// class Finance extends employees{      //child class
//     constructor(){
//         super();
//         this.model =model;
//         this.processor=processor;
//         this.ram=ram;

//     }
// }

// class Sales extends employees{      //child class
//     constructor(){
//         super();
//         this.model =model;
//         this.processor=processor;
//         this.ram=ram;

//     }
// }

// class Marketing extends employees{      //child class
//     constructor(){
//         super();
//         this.model =model;
//         this.processor=processor;
//         this.ram=ram;

//     }
// }
// class QA extends employees{      //child class
//     constructor(){
//         super();
//         this.model =model;
//         this.processor=processor;
//         this.ram=ram;

//     }
// }

let a1 = new Developers (" Selvina ", " 4 ","IT");
let a2 = new HR (" Selvina ", " 4 ","IT");
console.log("This is the " + a1.employeename + " " + a1.experience + " " + a1.position);
console.log("This is the " + a2.employeename + " " + a2.experience + " " + a2.position);