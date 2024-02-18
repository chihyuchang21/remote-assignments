import React, { useState } from 'react';
import './style.css';

const App = () => {
  const [welcomeMessage, setWelcomeMessage] = useState('Welcome Message');
  const [hiddenBoxesVisible, setHiddenBoxesVisible] = useState(false);

  const changeWelcomeMessage = () => {
    setWelcomeMessage('Have a Good Time!');
  };

  const showHiddenBoxes = () => {
    setHiddenBoxesVisible(!hiddenBoxesVisible);
  };

  return (
      <div className="page">
        <header className="main-header">
          <h1 className="name">Website Title / Logo</h1>
          <ul className="main-nav">
            <li>Item 1</li>
            <li>Item 2</li>
            <li>Item 3</li>
            <li>Item 4</li>
          </ul>
        </header>

        <h1 className="content-first-title" onClick={changeWelcomeMessage}>
          {welcomeMessage}
        </h1>
        <h2>Section Title</h2>

        <div className="container">
          <div>
            <div className="box"> Content Box 1</div>
            <div className="box"> Content Box 3</div>
          </div>
          <div>
            <div className="box"> Content Box 2</div>
            <div className="box"> Content Box 4</div>
          </div>
        </div>

        <div className="button-container">
          <button onClick={showHiddenBoxes}>Call to Action</button>
        </div>

        {hiddenBoxesVisible && (
            <div className="container" id="hiddenBoxes">
              <div>
                <div className="box"> Content Box 5</div>
                <div className="box"> Content Box 6</div>
              </div>
              <div>
                <div className="box"> Content Box 7</div>
                <div className="box"> Content Box 8</div>
              </div>
            </div>
        )}
      </div>
  );
};

export default App;
