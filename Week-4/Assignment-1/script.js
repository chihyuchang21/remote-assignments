/*
Three ways to implement the asynchronous function
1. Callback
2. Promise
3. Async / Await
*/

/*===== 1. Callback =====*/
function delayedResult(n1, n2, delayTime, callback) {
    setTimeout(() => {
        const result = n1 + n2;
        callback(result);
    }, delayTime);
}

delayedResult(4, 5, 3000, function (result) {
    console.log("Result from Callback (3s):", result);
}); // 9 (4+5) will be shown in the console after 3 seconds


delayedResult(-5, 10, 2000, function (result) {
    console.log("Result from Callback (2s):",result);
}); // 5 (-5+10) will be shown in the console after 2 seconds



/*===== 2. Promise =====*/
function delayedResultPromise(n1, n2, delayTime) {
    return new Promise((resolve, reject) => {
        setTimeout(() => {
            const result = n1 + n2;
            resolve(result);
        }, delayTime);
    });
}

delayedResultPromise(4, 5, 3000).then(result =>{
    console.log(`Result from Promise (3s): ${result}`);
}); // 9 (4+5) will be shown in the console after 3 seconds



/*===== 3. Async / Await =====*/
async function main() {
    const result1 = await delayedResultPromise(4,5,1000);
    console.log("Result from Async (3s):", result1);

    const result2 = await delayedResultPromise(-5, 10, 2000);
    console.log("Result from Async (2s):",result2);
}

main();  //result will be shown in the console after delay