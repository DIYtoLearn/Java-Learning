const express = require('express');
const app = express();
const port = 3000;

// This is your "Gatekeeper" middleware
const authorize = (req, res, next) => {
  const authHeader = req.headers.authorization;

  if (!authHeader) {
    res.setHeader('WWW-Authenticate', 'Basic');
    return res.status(401).send('Authentication required');
  }

  // Extract the string: "Basic YWRtaW46c2VjcmV0" -> "YWRtaW46c2VjcmV0"
  const base64Credentials = authHeader.split(' ')[1];
  // Decode Base64 to string: "admin:secret"
  const buffer = Buffer.from(base64Credentials, 'base64');
  const credentials = buffer.toString('ascii');
  
  const [username, password] = credentials.split(':');

  // Hardcoded check (In real life, you'd check a database)
  if (username === 'admin' && password === 'm1pro') {
    next(); // Credentials are good! Move to the next function.
  } else {
    res.status(403).send('Invalid credentials');
  }
};

// Apply the gatekeeper to this specific route
app.get('/secure-data', authorize, (req, res) => {
  res.json({
    secretMessage: "The eagle flies at midnight.",
    topSecretLevel: 9000
  });
});

app.listen(port, () => console.log(`Server on http://localhost:${port}`));