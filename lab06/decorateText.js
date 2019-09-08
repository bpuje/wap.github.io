/*Lab06 */

window.onload = function () {
    "use strict";
    var btn = document.getElementById("btnBig");
    btn.onclick = onclickBtn;
    var chkbox = document.getElementById("checkBox");
    chkbox.onclick = onchange;
    var convertBtn = document.getElementById('convertBtn');
    convertBtn.onclick = converter;
    var malkovBtn = document.getElementById('malkBtn');
    malkovBtn.onclick = malkovfunc;
};

function malkovfunc() {
    "use strict";
    var input = document.getElementById('input').value;
    var output = document.getElementById('output');
    if (input.length >= 5) {
        output.value = 'Malkovich';
    } else {
        output.value = input;
    }
}

function converter() {
    "use strict";
    var input = document.getElementById('input').value;
    var output = document.getElementById('output');
    var firstletter = input.charAt(0);
    var converted = input.substring(1) + "-" + firstletter + "ay";
    output.value = converted;
}

function onclickBtn() {
    "use strict";
    setInterval(function () {
        var tArea = document.getElementById("tArea");
        var size = parseInt(window.getComputedStyle(tArea, null).getPropertyValue("font-size"));
        size = size * 72 / 96;
        size = size + 2;
        tArea.style.fontSize = size + "pt";
    }, 500);
}

function onchange() {
    "use strict";
    var tArea = document.getElementById("tArea");
    var chkbox = document.getElementById("checkBox");
    if (chkbox.checked) {
        tArea.style.fontWeight = "bold";
        tArea.style.color = "green";
        tArea.style.textDecoration = "underline";
        document.body.style.backgroundImage = "url('horse.jpg')";
    } else {
        tArea.style.fontWeight = "normal";
        tArea.style.color = "black";
        tArea.style.textDecoration = "none";
        document.body.style.backgroundImage = "none";
    }
}
