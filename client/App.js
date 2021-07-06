import * as React from 'react';
import { useState } from 'react';
import { AppLoading } from 'expo-app-loading';
import { StyleSheet, Text, View } from 'react-native';
import { NavigationContainer } from "@react-navigation/native"
import { createStackNavigator } from '@react-navigation/stack';
import { createBottomTabNavigator } from '@react-navigation/bottom-tabs'
import HomeScreen from './Screens/HomeScreen';
import DeckScreen from './Screens/DeckScreen';
import AllDecksScreen from './Screens/AllDecksScreen'
import AddCardToDeckScreen from './Screens/AddCardToDeckScreen';
import NewDeckForm from './components/app_utility/NewDeckForm';
import CompositionChart from './components/deck_overview/ratings/speed/CompositionChart';
import { 
  BebasNeue_400Regular 
} from '@expo-google-fonts/bebas-neue';
import {useFonts} from 'expo-font';


const getFonts = () => Font.loadAsync({
    'bebas-neue': require('./assets/fonts/BebasNeue-Regular.ttf')
  })


const Stack = createStackNavigator();
// const Tab = createBottomTabNavigator();

// function MainTabNavigator() {
  
//   return (
//     <Tab.Navigator>
//       <Tab.Screen 
//       name='AllDecks' 
//       component={AllDecksScreen} 
//       options={{title: "Your Decks"}}
//       />
//     </Tab.Navigator>
//   )
// }


export default function App() {

  const [fontsLoaded, error] = useFonts({
    BebasNeue_400Regular 
  })

  return (    

    <NavigationContainer>
      <Stack.Navigator initialRouteName= "Home">
        <Stack.Screen name = "Home" component ={HomeScreen} options={{title: "MANALYZER V.01 - LOG IN"}} />
        <Stack.Screen name = "AllDecks" component = {AllDecksScreen} options={{title: "YOUR DECKS"}}/> 
        <Stack.Screen name = "SpecificDeck" component = {DeckScreen} options={{title: "DECK INFO"}}/>
        <Stack.Screen name = "NewDeck" component = {NewDeckForm} options={{title: "NEW DECK"}}/>
        <Stack.Screen name = "CardSearch" component = {AddCardToDeckScreen} options={{title: "CARD SEARCH"}}/>
        <Stack.Screen name = "CompositionChart" component = {CompositionChart} options={{title: " DECK COMPOSITION"}}/>
      </Stack.Navigator>
    </NavigationContainer>

  );
  // }
  // else {
  //   return( 
  //   <AppLoading
  //     startAsync={getFonts}
  //     onFinish={()=> setFontsLoaded(true)}
  //   />
  //   );
  // }
}
