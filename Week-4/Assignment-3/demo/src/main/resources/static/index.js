document.addEventListener('DOMContentLoaded', function () {

    /*=====Sign Up Form=====*/
    const signUpForm = document.getElementById('signup-form');
    // Prevent the default behavior of the form after being submitting
    signUpForm.addEventListener('submit', function (event) {
        event.preventDefault();

        const signUpEmail = document.getElementById('signUpEmail').value;
        const signUpPassword = document.getElementById('signUpPassword').value;

        // Use Fetch API to send POST request
        fetch('/signup', {
            method: 'POST',
            headers: {
                'Content-Type': 'application/json',
            },
            body: JSON.stringify({
                'signUpEmail': signUpEmail,
                'signUpPassword': signUpPassword,
            }),
        })
            .then(res => res.json())
            .then(data => {
                if (data.message === 'Signup successful!') {
                    // Signup successful, redirect to member page with welcome message
                    window.location.href = 'member.html';
                } else {
                    // Signup failed, display error message or take appropriate action
                    console.log('Signup failed:', data.message);
                    // You can show an error message on the home page
                }
            })
            .catch(error => console.log(error));
    });

    /*=====Sign In Form=====*/
    const signInForm = document.getElementById('signin-form');
    signInForm.addEventListener('submit', function (event) {
        event.preventDefault();

        const signInEmail = document.getElementById('signInEmail').value;
        const signInPassword = document.getElementById('signInPassword').value;

        // Use Fetch API to send POST request
        fetch('/signin', {
            method: 'POST',
            headers: {
                'Content-Type': 'application/json',
            },
            body: JSON.stringify({
                'signInEmail': signInEmail,
                'signInPassword': signInPassword,
            }),
        })
            .then(res => res.json())
            .then(data => {
                if (data.message === 'Signin successful!') {
                    // Signin successful, redirect to member page
                    window.location.href = 'member.html';
                } else {
                    // Signin failed, display error message or take appropriate action
                    console.log('Signin failed:', data.message);
                    // Redirect to fail.html
                    window.location.href = 'fail.html';
                }
            })
            .catch(error => {
                console.error('Error during Signin:', error);
                // Redirect to fail.html
                window.location.href = 'fail.html';
            });
    });
});