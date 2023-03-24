window.addEventListener("load",function(){
   let ul = document.querySelector(".menu-category>ul");
   ul.onclick=function(e){
      e.preventDefault();
      let tagName = e.target.tagName;
      //if(tagName !=('LI' && 'A')){ // 태그네임은 항상 대문자라고 한다(대문자로 받아온다고 한다.)
      if(tagName !='LI' && tagName != 'A')
         return;
	//클릭할 떄 데이터를 수집해야함.
	let el = tagName == 'Li'?e.target:e.target.parentElement;
//	let categoryId =1;
// 내가클릭했을때 알아내야하는 방법
	const request = new XMLHttpRequest();
	request.onload = function(){
	let menus = JSON.parse(request.responseText); //콜백함수로 비동기작업이 끝나면 줘
	console.log(menus[0]);

	}
	
	request.open("GET",`http://localhost:8080/menus?c=${id}`,true); //브라우저에 url를 입력해야하는 느낌 false면 동기 ture면 비동기
	request.send();
	
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
      
         console.log("clicked");
   }
})