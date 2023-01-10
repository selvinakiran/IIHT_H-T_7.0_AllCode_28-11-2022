export default class User {
    employeeId: number ;
    username: any;
    firstName: string ;
    lastName: string ; 
    location: string ;
    jobtitle: string ;
    department: string ;
    role: string ;
    password: string ;
   
   
    // constructor(employeeId,username,firstName,lastName,location,jobtitle,department,role,password){
    //     this.employeeId=employeeId;
    //     this.username=username;
    //     this.firstName=firstName;
    //     this.lastName=lastName;
    //     this.location=location;
    //     this.jobtitle=jobtitle;
    //     this.department=department;
    //     this.role=role;
    //     this.password=password;
    // }
    
    
}

export class JwtRequest {
    username: string = '';
    password: string = '';
}