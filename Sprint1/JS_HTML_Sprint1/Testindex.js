

function printvalues(ev) {
    ev.preventDefault(); //help to prevent the submit button without moving forward
   // document.getElementById('name').innerHTML = followersSum;
   // console.log(followersSum); // you can do print printvalues wherever you want
   const form = document.getElementById('form1'); //calling the form ID
   const Inputvalue = form.querySelectorAll('input');
   let formObjvalue = {};
   
    Inputvalue.forEach(e => {
        const key = e.getAttribute('name');
        formObjvalue[key] = e.value;
    });
    localStorage.setItem("form1",JSON.stringify(formObjvalue));
    setTimeout("location.href = '/thankyouPage.html';",1000);
  }

  