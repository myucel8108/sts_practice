window.addEventListener("load",function(){
   const menuList = document.querySelector(".menu-list");
   let ul = document.querySelector(".menu-category > ul");
   const form = document.querySelector(".search-header form");
   const findButton = form.querySelector(".icon-find");
   
   findButton.onclick =function(e){
	 e.preventDefault();
		
		const queryInput = form.querySelector("input[name=q]");
		let  query = queryInput.value;
		
		const request = new XMLHttpRequest();
		request.onload=function(){
			let menus = JSON.parse(request.responseText);
			
			bind(menus);
		
		}
	request.open("GET",`http://localhost:8080/menus?q=${query}`,true); //브라우저에 url를 입력해야하는 느낌 false면 동기 ture면 비동기
	request.send();
}
   
   

   ul.onclick=function(e){
        e.preventDefault();
    let tagName = e.target.tagName;
       if(tagName != 'LI' && tagName != 'A' )
         return;  

	//클릭할 떄 데이터를 수집해야함.
	
	// let el = tagName === 'LI' ? e.target : e.target.parentElement;

	let elLi = (tagName === 'LI')?e.target:e.target.parentNode;
	//elLi.className ="menu-selected"; //다른 속성값을 다 없애버릴 수 있다.
	let curLi = ul.querySelector("li.menu-selected");

	
	if(curLi === elLi)
		return;
		
	curLi.classList.remove("menu-selected");
	elLi.classList.add("menu-selected");
	
	let categoryId = elLi.dataset.cid;
	
// 내가클릭했을때 알아내야하는 방법
	const request = new XMLHttpRequest();
	request.onload = function(){
	let menus = JSON.parse(request.responseText); //콜백함수로 비동기작업이 끝나면 줘	
	// menuList.removeChild(menuList.firstElementChild);
	//while(menuList.firstElementChild)
	//	menuList.firstElementChild.remove();
		bind(menus);

	};
	
	if(categoryId)
	request.open("GET",`http://localhost:8080/menus?c=${categoryId}`,true); //브라우저에 url를 입력해야하는 느낌 false면 동기 ture면 비동기
	else
	request.open("GET",`http://localhost:8080/menus`,true); //브라우저에 url를 입력해야하는 느낌 false면 동기 ture면 비동기
	request.send();
	//기존목록을 지워야한다.
     //자식기준 menuList.children
     //부모기준


 };  
   function bind(menus){
		menuList.innerHTML="";
	//목록을 만들어 채우기  
	//1. 직접 DOM 객체를 생성해서 채우기  document를 직접 사용하는방법-> 이건 노가다 느낌
//	let menuSection = document.createElement("section");
//	menuSection.className = "menu";
//	let form = document.createElement("form");
//	form.className="";
//	menuSection.appendchild(form); 노드의 기능
//	menuSection.append(form); //엘리먼트 기능
//	menuList.append(menuSection);

	//2.문자열을 이용한 객체생성 `` 사용하면 밑에와 같이 더욱 편리하게 사용할 수 있다.
	for(let m of menus){
	     let template = 
         `<section class="menu">
             <form class="">
                <h1><span th:text="${m.name}">"${m.name}</span>/<span style="font-size:11px; vertical-align:center;" th:text="${m.categoryName}">${m.categoryName}</span></h1> 
                <div class="menu-img-box">
                   <a href="detail" th:href="@{detail(id=${m.id})}"><img class="menu-img" src="/image/product/${m.img}" th:src="@{/image/product/{img}(img=${m.img})}"></a>
                </div>    
                <div class="menu-price">${m.price} 원</div>
                <div class="menu-option-list">
                   <span class="menu-option">
                      <input class="menu-option-input" type="checkbox">
                      <label>ICED</label>
                   </span>            
                   <span class="menu-option ml-2">
                      <input class="menu-option-input" type="checkbox">
                      <label>Large</label>
                   </span>
                </div>
                <div class="menu-button-list">
                   <input class="btn btn-fill btn-size-1 btn-size-1-lg" type="submit" value="담기">
                   <input class="btn btn-line btn-size-1 btn-size-1-lg ml-1" type="submit" value="주문하기">
                </div>
             </form>
          </section>`;

	

//	menuList.innerHTML += template;
	//위처럼 만들면 반복문같은 방식은 어떻게 만들 수 있을까요?
	//menuList.innerHTML += template; 이부분이 문제가 생김  문자열을 대입할때 기존의 집을 무너트리고 새로운 집을 만들어내는 방식이라서 문자열이 누적되면서 다시 대입하는 형식이라서
	//for문이 끝날때까지 집을 계속 허물면서 오버헤드가 발생하기때문에
	menuList.insertAdjacentHTML("beforeend",template); //기존에 있는것이 있고 추가를 하는방식이다 앞에부분은 위치 뒤에는 더할 문자열
	
		}
   
	};


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