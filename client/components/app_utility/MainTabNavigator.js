import React from 'react';
import { Alert, StyleSheet, Text,TextInput, Button, View, SafeAreaView } from 'react-native';
import { NavigationContainer } from "@react-navigation/native"
import { createStackNavigator } from '@react-navigation/stack';
import { createBottomTabNavigator } from '@react-navigation/bottom-tabs'


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



const styles = StyleSheet.create({
    container: {
      flex: 1,
      backgroundColor: '#fff',
      alignItems: 'center',
      justifyContent: 'center',
    },
  });

  export default MainTabNavigator;