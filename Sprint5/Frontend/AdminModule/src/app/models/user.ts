export default class User {
    username: any;
    firstName: string = '';
    lastName: string = '';
    location: string = '';
    jobtitle: string = '';
    department: string = '';
    role: string = '';
    password: string = '';
   
    
    
}

export class JwtRequest {
    username: string = '';
    password: string = '';
}