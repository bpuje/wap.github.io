// $(function () {
//     $('#signupForm').submit(function (event) {
//         event.preventDefault();
//         $('#errors').empty();
//         submitFlag = true;
//
//         const email = $('#email').val();
//
//         if(email ===''){
//             $('#errors').append('Email cannot be null <br/>');
//             submitFlag = false;
//         }
//     })
// });

$(function () {
    const myform = $('SignupForm');
    $('#submit').click(validate);

    myform.submit();
});

// $(function () {
//     $(#'print').click()
//     alert("This jquery");
// });

function validate() {
    const email = $('#email');
    const pass1 = $('#pass1');
    const pass2 = $('#pass2');
    const gender = $('#gender');
    const phone = $('#phone');

    if(email === ''){
        $('h2').append("Email must be require")
    }


    if(pass1 !== pass2){
        $('h1').append("Password must be equal")
    }

    const check = $('checked');
        if(!check.checked){
            $('h1').append("Pass checked");
        }

    if(gender === ''){
        $('h1').append("YOu must select type");
    }

    if(phone === ''){
        $('h1').append("Phone number can not be null");
    }
}