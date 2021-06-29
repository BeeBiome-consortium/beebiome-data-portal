## Available Scripts

In the project directory, you can run:

#### Install BeeBiome package and any packages that it depends on

`npm install`

#### Runs the app in the development mode

1. `npm start`  
2. Open [http://localhost:3000](http://localhost:3000) to view it in the browser.

The page will reload if you make edits.  
You will also see any lint errors in the console.

Note: environment variables are defined in following files (files on the left have more priority than files on the right): `.env.development.local`, `.env.development`, `.env.local`, `.env`

#### Create a war for production

1. Modify .env to set properties.  
**WARNING: Do not commit this file to avoid having unencrypted e-mails in the git repository.**  

2. Then, `mvn -P prod clean install`

Note: environment variables are defined in following files (files on the left have more priority than files on the right): `.env.production.local`, `.env.production`, `.env.local`, `.env`

## Learn More

You can learn more in the [Create React Hero documentation](https://facebook.github.io/create-react-app/docs/getting-started).

This project was bootstrapped with [Create React Hero](https://github.com/facebook/create-react-app).

