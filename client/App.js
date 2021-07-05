import * as React from 'react';
import { StatusBar } from 'expo-status-bar';
import { StyleSheet, Text, View } from 'react-native';
import { NavigationContainer } from "@react-navigation/native"
import { createStackNavigator } from '@react-navigation/stack';
import { createBottomTabNavigator } from '@react-navigation/bottom-tabs'
import HomeScreen from './Screens/HomeScreen';
import DeckScreen from './Screens/DeckScreen';
import AllDecksScreen from './Screens/AllDecksScreen'
import NewDeckScreen from './Screens/NewDeckScreen';
// import Request from './helpers/request'
// import Navigator from './routes/HomeStack'


const Stack = createStackNavigator();
const Tab = createBottomTabNavigator();

function MainTabNavigator() {
  return (
    <Tab.Navigator>
      <Tab.Screen 
      name='AllDecks' 
      component={AllDecksScreen} 
      options={{title: "Your Decks"}}
      />
    </Tab.Navigator>
  )
}


export default function App() {



 
  return (    

    <NavigationContainer>
      <Stack.Navigator initialRouteName= "Home">
        <Stack.Screen name = "Home" component ={HomeScreen} options={{title: "MANALYZER V.01"}} />
        <Stack.Screen name = "AllDecks" component = {AllDecksScreen} options={{title: "All Decks"}}/> 
        <Stack.Screen name = "SpecificDeck" component = {DeckScreen} options={{title: "Deck Info"}}/>
        <Stack.Screen name = "NewDeck" component = {NewDeckScreen} options={{title: "New Deck"}}/>
      </Stack.Navigator>
    </NavigationContainer>

  );
}




{/* <StatusBar style="auto" /> */}