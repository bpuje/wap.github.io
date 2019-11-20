/*
* Created by 986799 on 09/06/2019
*
* */


// ex1. max
function maxelement(a, b) {
    return a > b ? a : b;
}
document.write("1. Max element of (17,9): " + maxelement(17, 9) + "<br>")

// 2. max
function max(arr) {
    let max = arr[0], i
    let len = arr.length;
    for (i = 0; i < len; i++) {
        if (arr[i] > max)
            max = arr[i];
    }
    return max
}
document.write("2. Max of (19,11,3,5,99,34): " + max(new Array(19,11,3,5,99,34)) + "<br>")


// ex3. maxOfThree
function maxOfThree(arr) {
    let ret = [], i;
    let sortedarray = arr.sort(function (a, b) {
        return b - a
    })
    for (i = 0; i < 3; i++) {
        ret[i] = sortedarray[i];
    }
    return ret;
}
document.write("3. Max of three: " + maxOfThree(new Array(19, 11, 3, 7, 45, 2)) + "<br>")

// ex4. isVovel
function isVowel(str) {
    return str.length == 1 ? true : false
}
document.write("4. This (A, E, I, O, U) is vowel: " + isVowel("A", "E", "I", "O", "U") + "<br>")

// ex5. sum()
function sum(arr) {
    let ret = 0, i;
    let len = arr.length;
    for (i = 0; i < len; i++) {
        ret += arr[i];
    }
    return ret;
}
document.write("5. Sum of array (1,2,3,4): " + sum([1, 2, 3, 4]) + "<br>")

// ex6. reverse()
function reverse(str) {
    let ret = "", i
    let len = str.length
    for (i = len - 1; i >= 0; i--) {
        ret += str[i];
    }
    return ret
}
document.write("6. Reverse this text (had galagdah) is: " + reverse("had galagdah") + "<br>")


// ex7. findLongestWord
function findLongestWord(arr) {
    let maxstr = arr[0].length, i
    let len = arr.length
    for (i = 0; i < len; i++) {
        if (arr[i].length > maxstr)
            maxstr = arr[i]
    }
    return maxstr
}
document.write("7. Longest Word of array (USA, Mongolia, Canada, Korea): " + findLongestWord(["USA", "Mongolia", "Canada", "Korea"]) + "<br>")

// ex8. filterLongWords
function filterLongWords(arr, num) {

    let retval = [], i, k = 0
    let len = arr.length
    let newlen = 0
    for (i = 0; i < len; i++) {
        if (arr[i].length > num)
            newlen++
    }
    for (i = 0; i < len; i++) {
        if (arr[i].length > num) {
            retval[k] = arr[i]
            k++
        }
    }
    return retval
}
document.write("8. Filter Long words longer than 4 (USA, Mongolia, Canada, Korea): " + filterLongWords(["USA", "Mongolia", "Canada", "Korea"], 4) + "<br>")

// ex9. multiple()
function multiple(arr) {
    let ret = 1, i
    let len = arr.length
    for (i = 0; i < len; i++) {
        ret *= arr[i]
    }
    return ret
}
document.write("9. Multiply of array (1,2,3,4): " + multiple([1, 2, 3, 4]) + "<br>")
