import React from 'react';
import { Alert, StyleSheet, Text,TextInput, Button, View, SafeAreaView } from 'react-native';

const MenuBar = ({ navigation: { navigate } }) => {

    return (
    
        <SafeAreaView style = {styles.container}>
            <Button style = {styles.button}
            onPress={() => navigate('Home')}
            title = "sign out"
            color="black"/>
            <Button style = {styles.button}
            onPress={() => navigate('AllDecks')}
            title = "your decks"
            color = "black"
                />
            <Button style = {styles.button}
            onPress={() => navigate('NewDeck')}
            title = "new deck"
            color = "black"
                />
        </SafeAreaView>
    
        )
        
}

const styles = StyleSheet.create({
    container: {
        margin: 20,
        // flex: 1,
        flexDirection: 'row',
        justifyContent: 'space-between'
    },
    button: {
        marginTop: 10,
        marginBottom: 10,
    }
})


export default MenuBar; 