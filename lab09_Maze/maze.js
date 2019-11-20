/*jslint esversion: 6*/

"use strict";

$(document).ready(function () {
    let win = 'none';
    $("#maze").mouseleave(function () {
        if (win === 'none') {
            win = 'lose';
            $(".boundary").addClass("youlose");
            $("#status").text("You are using cheat!!! Don't do this");
        }
    });

    $(".boundary").mouseover(function () {
        if (win === 'none') {
            $(".boundary").addClass("youlose");
            win = 'lose';
            $("#status").text("You lose! :[");
        }
    });

    $("#end").mouseover(function () {
        if (win === 'none') {
            win = 'yes';
            $("#status").text("You win! :]");
            $("#maze").css({"border": "5px solid green", "background": "green"});
        }
    });

    $("#start").click(function () {
        $(".boundary").removeClass("youlose");
        win = 'none';
        $("#status").text("Click the \"S\" to begin.");
        $("#maze").removeAttr('style');
    });
});
