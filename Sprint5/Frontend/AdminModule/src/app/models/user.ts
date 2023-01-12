export default class User {
    employeeId: number ;
    username: string;
    firstName: string ;
    lastName: string ; 
    location: string ;
    jobtitle: string ;
    department: string ;
    role: string ;
    password: string ;
   
   
   
    
}

export class JwtRequest {
    username: string = '';
    password: string = '';
}