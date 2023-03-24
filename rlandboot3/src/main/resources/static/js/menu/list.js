window.addEventListener("load",function(){
   let ul = document.querySelector(".menu-category>ul");
   ul.onclick=function(e){
      e.preventDefault();
      let tagName = e.target.tagName;
      //if(tagName !=('LI' && 'A')){ // 태그네임은 항상 대문자라고 한다(대문자로 받아온다고 한다.)
      if(tagName !='LI' && tagName != 'A'){
         return;

//-------------------------------fetch api         
//         var requestOptions = {
//           method: 'GET',
//           redirect: 'follow'
//         };
         
//         fetch("http://localhost:8080/menus", requestOptions)
//           .then(response => response.text())
//           .then(result => console.log(result))
//           .catch(error => console.log('error', error));
         
         //------------------ xhr api
         // WARNING: For GET requests, body is set to null by browsers.
//         var xhr = new XMLHttpRequest();
//         xhr.withCredentials = true;
//         
//         xhr.addEventListener("readystatechange", function() {
//           if(this.readyState === 4) {
//             console.log(this.responseText);
//           }
//         });
         
//         xhr.open("GET", "http://localhost:8080/menus");
         
//         xhr.send();
      }
         console.log("clicked");
   }
})