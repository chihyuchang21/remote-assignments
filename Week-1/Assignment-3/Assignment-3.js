function countAandB(input) {
    let countA = 0
    let countB = 0

    for (let i = 0; i < input.legth; i++){
        if (input[i] === "a"){
            countA += 1;
        }   else if (input[i] === "b"){
            countB += 1;
        }
    }

    return countA + countB;
}

function toNumber(input) {
// your code here
}

let input1 = ['a', 'b', 'c', 'a', 'c', 'a', 'c'];
console.log(countAandB(input1)); // should print 4 (3 ‘a’ letters and 1 ‘b’ letter)
console.log(toNumber(input1)); // should print [1, 2, 3, 1, 3, 1, 3]

let input2 = ['e', 'd', 'c', 'd', 'e'];
console.log(countAandB(input2)); // should print 0
console.log(toNumber(input2)); // should print [5, 4, 3, 4, 5]




/* Reference
For syntax: https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Statements/for
Comments: https://www.w3schools.com/js/js_comments.asp
Convert Letters to Numbers with JS: https://stackoverflow.com/questions/22624379/how-to-convert-letters-to-numbers-with-javascript
String.prototype.charCodeAt(): https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/String/charCodeAt
https://www.runoob.com/jsref/jsref-charcodeat.html
*/