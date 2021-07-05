import React, {useState, useEffect}from 'react';
import { Image, Alert, Text,TextInput, Button, View, SafeAreaView, StyleSheet, Pressable } from 'react-native';

const AddCardToDeckScreen = () => {

    const [currentCard, setCurrentCard] = useState({});
    const [searchString,setSearchString] = useState('');
    const [modalVisible, setModalVisible] = useState(false);


    useEffect(() => {
        getCard()
    },[searchString])

    const baseURL = "https://api.scryfall.com/cards/named?fuzzy=";


    const getCard = () => {
        return fetch(baseURL + searchString)
            .then(res => res.json())
            .then(data => setCurrentCard(data))
    };


    return (
        <SafeAreaView 
        style = {styles.container}
        >
            <View 
            style={styles.all_fields}
            >
            <TextInput 
            style = {styles.search_field}
            onChangeText = {(text) => setSearchString(text)}
            placeholder = "search by card name..."/>        
            </View>
            {currentCard.name ? 
                <Image 
                style={styles.card}
                source = {{uri: currentCard.image_uris.border_crop}} 
                />
                :
                <Image 
                style={styles.card}
                source = {{uri: 'https://media.magic.wizards.com/image_legacy_migration/magic/images/mtgcom/fcpics/making/mr224_back.jpg'}} 
                />
            }
            <Button
            style = {styles.button}
            title = "ADD CARD TO DECK"
            color = "black"
            // onPress = {() => {}}
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

export default AddCardToDeckScreen;