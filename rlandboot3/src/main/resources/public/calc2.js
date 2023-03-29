//뷰 원웨이 방식

Vue
.createApp({              //mount에 들어가 있는 대상-> 데이터 객체들
	data(){					//data()는 total:function(){}과 같다.
	let x=30;
	let y=50;
	let z =50;		//그저 지역변수
	//데이터라는 함수를 반환하기
		return{x,y,z}; //얘만 model임
	},
	//라이프사이클: 이미 지정되어있는 함수들의 이름이다. data도 이미 예약되어 있는 것이다. 함수를 만들때는 methods
	methods:{  //함수들의 객체라고 생각하면된다.
		calcHandler(e){
			e.preventDefault();
			 this.z= this.x+this.y;
			console.log("hello"+this.z);
			
		},
		resetHandler(){
		
			console.log("reset");
		}
		
	}
}) 
.mount("#calc"); //vue의 영역을 의미하는 것

//이벤트 처리하는 방식

//let kor= 30;
//let eng= 30;
//
//let math =30;
//
//
//let exam {
//	kor,
//	eng,
//	math,
//total:funtion(){
//	return{this.kor+this.eng+this.math}
//}
//};