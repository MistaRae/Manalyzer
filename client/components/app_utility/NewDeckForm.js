import React, {useState, useEffect}from 'react';
import { ScrollView, StyleSheet, Text, SafeAreaView, View, Button } from 'react-native';
import { TextInput } from 'react-native-gesture-handler';
import Request from '../../helpers/request';

const NewDeckForm = ({navigation: { navigate }}) => {

    const [newDeck,setNewDeck] = useState({
        name:""
    })

    const url = "http://192.168.1.166:8080/decks/"

    const createNewDeck = () => {
        const request = new Request(); 
        request.post(url,newDeck)
        .then(data => {
            setNewDeck(data)
            navigate('SpecificDeck', {deck_id: data.id});
        })
    }

    return(

        <SafeAreaView style={styles.container}>
            <TextInput
            style = {styles.search_field}
            onChangeText = {(text) => setNewDeck({...newDeck, name: text})}
            placeholder = "Enter deck name..."/>    
            <Button
            title = "add deck"
            style = {styles.Button}
            onPress = {createNewDeck}
            color = "black"

            />
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
        marginBottom: 10,
        borderColor: "grey",
        borderWidth: 2,
        padding: 5,
        width: 220

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