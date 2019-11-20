$(document).ready(function () {
    $('#aa').click(function (event) {
        var userName = $("#username").val();
        var password = $("#password").val();
            $.ajax({
                type: 'POST',
                url:'http://35.186.227.12/users/signin',
                data: 'json',
                success: function(data, textStatus, request){
                    alert(request.getResponseHeader('some_header'));
                },
                error: function (request, textStatus, errorThrown) {
                    alert(request.getResponseHeader('some_header'));
                }
            });
        }
    );
});
