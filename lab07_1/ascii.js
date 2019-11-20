/*jshint esversion: 6 */
"use strict";

window.onload = init;
var actionFrame = null;
var timer = null;
var counter = 0;

function init() {
    const startBtn = document.getElementById('startBtn');
    const stopBtn = document.getElementById('stopBtn');
    const animeType = document.getElementById('animeType');
    const animeSize = document.getElementById('animeSize');
    const turbo = document.getElementById('turbo');
    animeType.onchange = animationChange;
    animeSize.onchange = animationSize;
    startBtn.onclick = startAction;
    stopBtn.onclick = stopAction;
    turbo.onclick = speedTurbo;
}

function startAction() {
    const startBtn = document.getElementById('startBtn');
    const stopBtn = document.getElementById('stopBtn');
    const animeType = document.getElementById('animeType');
    const turbo = document.getElementById('turbo');
    let tArea = document.getElementById('teArea');
    stopBtn.disabled = false;
    startBtn.disabled = true;
    animeType.disabled = true;
    actionFrame = tArea.innerHTML.split("=====\n");
    if (timer === null) {
        if (turbo.checked) {
            timer = setInterval(function () {
                if (counter < actionFrame.length) {
                    tArea.innerHTML = actionFrame[counter];
                    counter++;
                } else {
                    tArea.innerHTML = actionFrame[0];
                    counter = 1;
                }
            }, 50);
        } else {
            timer = setInterval(function () {
                if (counter < actionFrame.length) {
                    tArea.innerHTML = actionFrame[counter];
                    counter++;
                } else {
                    tArea.innerHTML = actionFrame[0];
                    counter = 1;
                }
            }, 250);
        }
    }

}

function stopAction() {
    const startBtn = document.getElementById('startBtn');
    const stopBtn = document.getElementById('stopBtn');
    const animeType = document.getElementById('animeType');
    let tArea = document.getElementById('teArea');
    stopBtn.disabled = true;
    startBtn.disabled = false;
    animeType.disabled = false;
    clearInterval(timer);
    counter = 0;
    timer = null;
    tArea.innerHTML = actionFrame.join("=====\n");
}

function animationChange(event) {
    let tArea = document.getElementById('teArea');
    tArea.innerHTML = ANIMATIONS[event.target.value.toUpperCase()];
}

function animationSize(event) {
    let tArea = document.getElementById('teArea');
    tArea.className = event.target.value.toLowerCase();
}

function speedTurbo(event) {
    let tArea = document.getElementById('teArea');
    if(timer !== null){
        if (event.target.checked) {
            clearInterval(timer);
            timer = setInterval(function () {
                if (counter < actionFrame.length) {
                    tArea.innerHTML = actionFrame[counter];
                    counter++;
                } else {
                    tArea.innerHTML = actionFrame[0];
                    counter = 1;
                }
            }, 50);
        } else {
            clearInterval(timer);
            timer = setInterval(function () {
                if (counter < actionFrame.length) {
                    tArea.innerHTML = actionFrame[counter];
                    counter++;
                } else {
                    tArea.innerHTML = actionFrame[0];
                    counter = 1;
                }
            }, 250);
        }
    }
}
