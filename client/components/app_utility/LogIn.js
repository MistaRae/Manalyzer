import React from 'react';
import { Alert, StyleSheet, Text,TextInput, Button, View } from 'react-native';

const LogIn = () => {

    return(

    <View>
        <TextInput placeholder="Email"/>
        <TextInput placeholder="Password"/>
        <Button onPress={() => Alert.alert("leads to ALL DECKS")}
        title = "Log In"
        color="black"/>
    </View>
    )
}

export default LogIn;