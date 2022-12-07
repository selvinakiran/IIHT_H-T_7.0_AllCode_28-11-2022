//help to get the values stored in the local storage 
window.onload = () => {
    console.log(JSON.parse(localStorage.getItem("form1")));
};