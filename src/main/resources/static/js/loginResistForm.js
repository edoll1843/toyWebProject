var fn = {
    init : function() { //init function
        loginButton();
       // registButton()
    }
};

function loginButton() { //press login button
    let userLoginButton = document.getElementById("userLoginButton");
    userLoginButton.addEventListener("click", function(){
        var loginId = document.getElementById("getUserId").value; //user id
        var loginPw = document.getElementById("getUserPw").value; //user pw
        $.ajax({
            url : "/loginResistForm/userLoginButton",
            type : "POST",
            data : JSON.parse({
                loginId : loginId,
                loginPw : loginPw,
            }),
            contentType : "application/json",
            success : function(result) {
                if(result) {
                    console.log("ajax data connection success!!");
                } else {
                    console.log("ajax data connection fail!!");
                }
            }, // success end
            error : function(){
                console.log("ajax error!!!!");
            }
        }); // ajax end
    }); //userLoginButton click end



}
function registButton() {

}
document.addEventListener("DOMContentLoaded", function(){ //js ready function
    fn.init();
});