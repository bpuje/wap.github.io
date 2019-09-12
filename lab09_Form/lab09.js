
$(function () {
    $("#ticketbookingForm").submit(function (event) {
        event.preventDefault();
        $('#errors').empty();
        submitFlag = true;

        const name = $('#name').val();
        const street = $('#street').val();
        const zipcode = $('#zipcode').val();
        const seat = $('input[name=seats]').val();

        if(name === ''){
            $('#errors').append('Name cannot be null <br/>');
            submitFlag = false;
        }

        if(street === ''){
            $('#errors').append('Street cannot be null<br/>');
            submitFlag = false;
        }

        if(zipcode === ''){
            $('#errors').append('Zipcode cannot be null<br/>');
            submitFlag = false;
        }

        if(seat <= 0 || seat > 200){
            $('#errors').append('You can not book more than 200 seats. <br/>');
            submitFlag = false;
        }

        if($('input[name="taxi"]:checked').val() === undefined){
            $('#errors').append('You must select type. <br/>');
            submitFlag = false;
        }

        if($('input[name="Extras"]:checked').val() === undefined){
            $('#errors').append('You must check one extra. <br/>');
            submitFlag = false;
        }

        if(submitFlag){
            this.submit();
        }

    });
});










































