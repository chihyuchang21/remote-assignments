/*
The callback function is responsible for handling the data of the AJAX response.
In this way, you can pass the data to externally defined logic when the response is received.
*/

function ajax(src, callback) {
    var xhr = new XMLHttpRequest();
    xhr.onreadystatechange = function(){
      if (xhr.readyState === 4 && xhr.status === 200){
          callback(JSON.parse(xhr.responseText));
      }
    };
    xhr.open('GET', src, true);
    xhr.send();
}

function render(data) {
    const selectDiv = document.getElementById('result');

    data.forEach(product => {
        const productsDiv = document.createElement('div');
        productsDiv.textContent = `Product: ${product.name}, Price: ${product.price}, Description: ${product.description}`;
        selectDiv.appendChild(productsDiv);
    });
} // document.createElement() and appendChild() methods are preferred.

ajax(
    'https://remote-assignment.s3.ap-northeast-1.amazonaws.com/products',
    function (response) {
        render(response);
    }
); // you should get product information in JSON format and render data in the page.