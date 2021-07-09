# SkullTap is a deck building utility app for magic the gathering. 
# Its purpose is to allow newcomers and experienced players alike to experiment with different deck variations and rapidly evaluate viability for competitive or social play. 

#installing the app 

- [`Fork`](https://docs.github.com/en/get-started/quickstart/fork-a-repo#forking-a-repository) & [`Clone`](https://docs.github.com/en/get-started/quickstart/fork-a-repo#cloning-your-forked-repository) the repo as normal. 

- Install dependencies using `npm install`

- [Install android studio](https://developer.android.com/studio/install)

- Create a virtual device using the Android Virtual Device (AVD) manager: 
  (you may have to create a project to do this)
  
  1. select the `Tools` drop down menu.
  2. select `AVD Manager`. 
  3. select `create virtual device`. 
  4. select your desired device to emulate and click `next`.
  5. you can change certain settings on the next page, the app was developed on a pixel 4 XL emulator running R ar API level 30.
  6. click on the green play button in the AVD manager to launch your emulator. 

- run the backend server: 
  1. [Download and run IntelliJ -the community version is available for free](https://www.jetbrains.com/help/idea/installation-guide.html#toolbox)
  2. open the server directory as a project in intelliJ (file path ~/{yourfilepath}/SkullTap/server) and run the server app by pressing the green play button.
  (to ensure ensure that you are not running the tests, they have been commented out)
  3. ensure that the sever is running, by checking the terminal window output states something like this: "Started ServerApplication in 6.575 seconds (JVM running for 7.489)"


- fetch commands in the client will need to have your IP address added to replace my own:

`const addCardToDeck = () => {
        const url = "http://{YOUR IP ADDRESSS GOES HERE}:8080/decks/" + deck_id + "/add-card"
        const request = new Request();
        request.post(url, currentCard)
        .then(data => navigate('SpecificDeck', {deck_id: data.id}))
    }`

(there are 5 such fetches in the client app, one each in `NewDeckForm` & `AddCardToDeckScreen` then three in `DeckScreen`


- run the front end server by entering `npm start` or `expo start` in the client file directory.
  this may open a browser window which prompts you to select an emulator. click on `Run on device/emulator`
  you can do the same from your terminal window by simply keying `A` for Android.
  
- the app will now open on the emulator. 

ENJOY! :) 