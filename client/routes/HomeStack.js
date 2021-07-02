import { createStackNavigator } from "@react-navigation/stack";
import { createAppContainer } from "react-navigation";
import AllDecksContainer from "../Screens/AllDecksScreen";
import DeckContainer from "../Screens/DeckScreen";
import MainContainer from "../Screens/HomeScreen";

const screens = {

 Home: {
     screen: MainContainer
 }, 
 AllDecks: {
     screen: AllDecksContainer
 },
 Specific_Deck: {
     screen: DeckContainer
 }
}

const HomeStack = createStackNavigator(screens);

export default createAppContainer(HomeStack);