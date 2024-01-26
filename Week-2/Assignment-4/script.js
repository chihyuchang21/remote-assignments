function changeWelcomeMessage() {
    var welcomeMessage = document.querySelector('.content-first-title');

    // Change the text to "Have a Good Time!"
    welcomeMessage.innerText = 'Have a Good Time!';
}

function showHiddenBoxes() {
    var hiddenBoxes = document.getElementById('hiddenBoxes');

    // Toggle the 'hidden' class to show/hide the boxes
    hiddenBoxes.classList.toggle('hidden');
}