$(function () {
    $("#send").click(updateGuests);
});

function updateGuests() {
    var first = $("#first").val();
    var last = $("#last").val();

    $.ajax("guestServlet.ajax", {
        "type": "post",
        "data": {
            "first": first,
            "last": last
        }
    }).done(displayGuests);
}

function displayGuests(data) {
    // let guestList = JSON.stringify(data);
    // $("#guestList").html(guestList);
    //
    // let list;
    // for(let i = 0; i < data.length; i++){
    //     console.log(data[i].first);
    //     console.log(data[i].last);
    //

    var lists = $("<ul>");
        for (var i=0; i<data.length; i++){
            lists.append($('<li>', {'html': data[i].first + " " + data[i].last
            })
        );
    }
    $("#guestList").html(lists);
}