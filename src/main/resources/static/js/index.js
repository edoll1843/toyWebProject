var js = { //불필요한 hoisting을 줄이기 위해서 사용
    init: function () { //이벤트 바인딩
        loginEvent(); //로그인페이지 이동

    } //init function end

}; //var js end

function loginEvent() { //로그인 페이지 이동
    let loginButton = document.getElementsByClassName("moveToLogin");
    for(let i =0; i< loginButton.length; i++) { //class의 요소는 여러개이기 때문에 지정해줘야함
        loginButton[i].addEventListener("click", function () {
            location.href = window.location.href + "loginResistForm";
        });
    }
};
document.addEventListener("DOMContentLoaded", function () { //js ready function
    js.init();
})