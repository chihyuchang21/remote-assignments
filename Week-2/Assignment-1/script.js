function max(numbers) {

    //numbers不得為0
    if(numbers.length === 0){
        return -1;
    }

    let maxNum = numbers[0]

    for (let i = 1; i < numbers.length; i++){
        if (numbers[i] > maxNum){
            maxNum = numbers[i];
        }
    }
    return maxNum
}

function findPosition(numbers, target) {

    //numbers不得為0
    if(numbers.length === 0){
        return -1;
    }

    let resultTarget

    for (let i = 0; i < numbers.length; i++){
        if (numbers[i] === target){
            resultTarget = i;
            break; //找到第一個即可
        }
        else {
       resultTarget = -1;}
    }
    return resultTarget
}



/*============== Testing============ */
console.log(max([1, 2, 4, 5])); // should print 5
console.log(max([5, 2, 7, 1, 6])); // should print 7
console.log(findPosition([5, 2, 7, 1, 6], 5)); // should print 0
console.log(findPosition([5, 2, 7, 1, 6], 7)); // should print 2
console.log(findPosition([5, 2, 7, 7, 7, 1, 6], 7)); // should print 2 (the first position)
console.log(findPosition([5, 2, 7, 1, 6], 8)); // should print -1