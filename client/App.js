import * as React from 'react';
import { StatusBar } from 'expo-status-bar';
import { StyleSheet, Text, View } from 'react-native';
import { NavigationContainer } from "@react-navigation/native"
import { createStackNavigator } from '@react-navigation/stack';
import HomeScreen from './Screens/HomeScreen';
import DeckScreen from './Screens/DeckScreen';
import AllDecksScreen from './Screens/AllDecksScreen'
// import Request from './helpers/request'
// import Navigator from './routes/HomeStack'


const Stack = createStackNavigator();

export default function App() {



 
  return (    

    <NavigationContainer>
      <Stack.Navigator initialRouteName= "Home">
        <Stack.Screen name = "Home" component ={HomeScreen} options={{title: "home"}} />
        <Stack.Screen name = "AllDecks" component = {AllDecksScreen} options={{title: "All Decks"}}/> 
        <Stack.Screen name = "SpecificDeck" component = {DeckScreen} options={{title: "Deck Info"}}/>
      </Stack.Navigator>
    </NavigationContainer>

  );
}


{/* <StatusBar style="auto" /> */}