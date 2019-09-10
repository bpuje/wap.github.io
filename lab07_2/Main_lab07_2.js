
//ex4. isVovel()
function isVowel(char) {

}
//ex5. sum()
// function sumArr(mult, base, numbers) {
//     const total = [0,1,2,3].reduce((accum, num) => accum + num, base);
//     return mult * total;
//
// }
//
// let numbers = [1,2,3,4];
// let multipliedNumbers = numbers.map(n => n * n);
// let addedNumbers = numbers.map(n => n + n);
// console.log(multipliedNumbers);
// console.log(addedNumbers);
// console.log(numbers);

// function sum(multiplier, base, numbers) {
//     var temp = numbers.reduce((accum, num) => accum + num, base);
//     return multiplier * temp;
// }
//
// var total = sum(2, 6, 10, 9, 8);
// console.log("total: " + total);
//

// function calc(multiplier, base, ...numbers) {
//     var temp = numbers.reduce((accum, num) => accum + num, base);
//     return multiplier * temp;
// }
// var total = calc(2, 6, 10, 9, 8); console.log("total: " + total);


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
