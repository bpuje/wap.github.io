
//ex4. sum()
    const array1 = [1,2,3,4];
    const sum = (acc, currVal) => acc + currVal;
    console.log(array1.reduce(sum));

    const multiplier = (acc, val) => acc * val;
    console.log(array1.reduce(multiplier));

    let numbers = [1,2,3,4];
    let multipliedNumbers = numbers.map(n => n * n);
    let addedNumbers = numbers.map(n => n + n);
    console.log(multipliedNumbers);
    console.log(addedNumbers);
    console.log(numbers);


    //ex5.
function reverse(str){
    return str.split("").reduce((rev, char)=> char + rev, '');
}

    // ex7. filterLongWords()
function findLongestWord(longestWord) {
    const word = ["USA", "Mongolia", "Canada", "Korea"];
    return maxStr = longestWord.filter(word => word.length > 6);
}

const longestWord = ["USA", "Mongolia", "Canada", "Korea"];
    const result = longestWord.filter(word => word.length > 6);
    console.log(result)




