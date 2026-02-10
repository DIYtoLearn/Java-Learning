const express = require('express');
const app = express();
const port = 3000;

// This defines a "Route"
app.get('/', (req, res) => {
  res.send('Hello World! This is much cleaner with Express.');
});

app.get('/profile', (req, res) => {
  res.send('This is your user profile page!');
});

app.get('/api/data', (req, res) => {
  res.json({
    message: "Success",
    status: 200,
    data: ["Node", "Express", "M1 Mac"]
  });
});

app.listen(port, () => {
  console.log(`Express app listening at http://localhost:${port}`);
});