Vue
.createApp({
	data(){
	
		return{
			test:"hello"
		};	
	},
	methods:{ //function임
		  	categoryClickHandler(e){
			this.load(2);
			},
			
			
		 load(cid){			
//			fetch("/menus", (response)=>{
//				//결과 후에 실행할 코드
//			});
			
			let promise = fetch("/menus111"); //menus라는 곳에서 싹다 가져온다.
			promise
			.then(response=>{
				return response.json();// 중첩하지 않고 내려쓰는 다음항목에서 사용하고 싶을때 사용
				})
			.then(list=>{   //비동기 처리가 끝났다는 것을 의미한다.
				console.log(list);
				
			})
			.then(menu=>{
				console.log(menu.name);
			})
			.catch(error=>{
				console.log("ㅊㅊㅊ");

			});
		}
			
			
//			promise.then(response=>{
//				console.log(response);
//				let promise =  response.json();
//				promise.then(list=>{
//				console.log(list);
//				});
				
//			});
			
//			let promise = fetch("/menus");
//			
//			promise.then(respomnse=>{
//				console.log("도착했니");					
 //then: callback을 다로 담는다고 생각하면된다.

				
//			})
	}
})
.mount(
	"#main-section"
);