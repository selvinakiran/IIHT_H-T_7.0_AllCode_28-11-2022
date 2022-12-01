
// const fun1 =()=>{   //inline function is used
//     console.log("This is a function 1");
// }
// // The  const function 2 is not waiting for the time out so make use of PROMISE
// const fun2 =()=> {
//     setTimeout( ()=>{
//     console.log("the function was executed in set time out");
// }, 5000);
// console.log("This is a function 2");
// }
// const fun3 =()=>{
//     console.log("This is a function 3");

// }

// fun1();
// fun2();
// fun3();


const fun1 =() => {   //inline function is used
    return "This is a function 1"
}
// The  const function 2 is not waiting for the time out so make use of PROMISE
// const fun2 =() => {
//     setTimeout( ()=> {
//         return "This is a function 2"
// }, 5000);

// }
const fun2 = () => {
    return new  Promise((resolve,reject) => {
    setTimeout(() => {
        resolve( "This is a function 2");
}, 2000);
});
};


const fun3 =() =>{
    return "This is a function 3"

};

const callfun= async() => {
let val1= fun1();
console.log(val1);
let val2= await fun2();
console.log(val2);
let val3= fun3();
console.log(val3);

}