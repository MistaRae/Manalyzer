import React from 'react';
import { StatusBar } from 'expo-status-bar';
import { StyleSheet, Text, View } from 'react-native';
import { NavigationContainer } from "@react-navigation/native"
import { createStackNavigator } from '@react-navigation/stack';
import MainContainer from './containers/MainContainer';
import DeckContainer from './containers/DeckContainer';
import AllDecksContainer from './containers/AllDecksContainer'
import Request from './helpers/request'



const Stack = createStackNavigator();

export default function App() {




  return (

    <NavigationContainer>
      <Stack.Navigator>
        {/* <Stack.Screen name = "Home" component ={MainContainer} /> */}
        <Stack.Screen name = "all_decks" component = {AllDecksContainer} /> 
        {/* <Stack.Screen name = "Specific_Deck" component = {DeckContainer} /> */}
      </Stack.Navigator>
    </NavigationContainer>


  );
}


{/* <StatusBar style="auto" /> */}