import React from 'react';
import { Alert, StyleSheet, Text,TextInput, Button, View } from 'react-native';
import { NavigationContainer } from "@react-navigation/native"
import { createStackNavigator } from '@react-navigation/stack';

const LogIn = ({ navigation: { navigate } }) => {

    return(

    <View>
        <TextInput placeholder="Email"/>
        <TextInput 
        secureTextEntry={true}
        placeholder="Password"/>
        <Button onPress={() => navigate('AllDecks')}
        title = "Log In"
        color="black"/>
    </View>
    )
}

export default LogIn;