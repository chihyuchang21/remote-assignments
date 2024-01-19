function count(input) {
    return input.reduce((acc, cur) => {
        acc[cur] = (acc[cur] || 0) + 1;
        return acc;
    }, {});
}


let input1 = ["a", "b", "c", "a", "c", "a", "x"];   //array
console.log(count(input1));
// should print {a:3, b:1, c:2, x:1}

function groupByKey(input) {
    let result = {};

    for (let i = 0; i < input.length; i++) {
        let element = input[i];

        result[element.key] = (result[element.key] || 0) + element.value;
    }

    return result;
}

let input2 = [                  //object
    { key: "a", value: 3 },
    { key: "b", value: 1 },
    { key: "c", value: 2 },
    { key: "a", value: 3 },
    { key: "c", value: 5 },
];
console.log(groupByKey(input2));