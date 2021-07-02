import React from 'react';
import { StyleSheet,Button,TextInput, Text, View, Alert } from 'react-native';
import LogIn from '../components/app_utility/LogIn';
import { NavigationContainer } from "@react-navigation/native"
import { createStackNavigator } from '@react-navigation/stack';



const LogInScreen = ({ navigation: { navigate } }) => {

    return(
    <View>
        <TextInput placeholder="Email"/>
        <TextInput placeholder="Password"/>
        <Button onPress={() => navigate('AllDecks')}
        title = "Log In"
        color="black"/>
    </View>
    )    
}

export default LogInScreen;


// () => navigation.navigate("all-decks")