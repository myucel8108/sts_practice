window.addEventListener("load",function(){
	const menuList = document.querySelector(".menu-list");
   let ul = document.querySelector(".menu-category>ul");
   ul.onclick=function(e){
      e.preventDefault();
      let tagName = e.target.tagName;
      //if(tagName !=('LI' && 'A')){ // 태그네임은 항상 대문자라고 한다(대문자로 받아온다고 한다.)
      if(tagName !='LI' && tagName != 'A')
         return;
	//클릭할 떄 데이터를 수집해야함.
	let elLi = (tagName == 'Li')?e.target:e.target.parentNode;
	console.log(elLi.dataset.cid);
	
	let categoryId = elLi.dataset.cid;

// 내가클릭했을때 알아내야하는 방법
	const request = new XMLHttpRequest();
	request.onload = function(){
	let menus = JSON.parse(request.responseText); //콜백함수로 비동기작업이 끝나면 줘	
	// menuList.removeChild(menuList.firstElementChild);
	while(menuList.firstElementChild)
		menuList.firstElementChild.remove();
		
	}
	
	request.open("GET",`http://localhost:8080/menus?c=${categoryId}`,true); //브라우저에 url를 입력해야하는 느낌 false면 동기 ture면 비동기
	request.send();
	//기존목록을 지워야한다.
     //자식기준 menuList.children
     //부모기준

         
         console.log("clicked");
   }
})




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