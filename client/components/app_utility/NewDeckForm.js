import React, {useState, useEffect}from 'react';
import { ScrollView, StyleSheet, Text, SafeAreaView, View } from 'react-native';
import { TextInput } from 'react-native-gesture-handler';

const NewDeckForm = ({setNewDeck}) => {



    return(

        <SafeAreaView >
            <TextInput
            style = {styles.search_field}
            onChangeText = {(text) => setNewDeck(text)}
            placeholder = "Enter deck name..."/>    
        </SafeAreaView>


    )
}

const styles = StyleSheet.create({
    container: {
        margin: 20,
        flex: 1,
        backgroundColor: '#fff',
        alignItems: 'center',
        justifyContent: 'center',
    }, 
    all_fields: {
        flexDirection: "row",
        flex:1,
    },
    search_field: {
        borderColor: "black",
        borderWidth: 2,
        flex: 1,
        padding: 10,
        height: 50,
        margin: 5
    }, 
    outline: {
        flex: 1,
        borderColor: "red",
        borderWidth: 2,
    },
    card: {
        margin: 20,
        // backgroundColor: "black",
        resizeMode: "contain",
        width: "100%",
        height: "70%",
        // width: 388,
        // height: 550,
    }
})    

export default NewDeckForm;