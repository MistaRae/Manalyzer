import React, {useState, useEffect}from 'react';
import { SafeAreaView, Image, StyleSheet, Text, View, FlatList, Pressable, Button, ActivityIndicator } from 'react-native';
import { NavigationEvents } from 'react-navigation';
import { useIsFocused } from '@react-navigation/native';
import Request from '../helpers/request';
import { 
    BebasNeue_400Regular 
  } from '@expo-google-fonts/bebas-neue';
import {useFonts} from 'expo-font';


const DeckScreen = ({route, navigation: {navigate}}) => {

    const isFocused = useIsFocused()

    const {deck_id} = route.params;

    const [currentDeck,setCurrentDeck] = useState(null);
    const [cardData,setCardData] = useState(null);
    // const [deckImageURL, setDeckImageURL] = useState('https://c1.scryfall.com/file/scryfall-cards/border_crop/front/1/2/12ab9836-bc90-4d92-a86d-b8e1b7671aa7.jpg?1562898915');


    const baseURL = 'http://192.168.1.166:8080/decks/';

    const getCurrentDeck = () => {
            return fetch(baseURL + deck_id)
                .then(res => res.json())
                .then(data => setCurrentDeck(data))
        };

    useEffect(() => {
        getCurrentDeck()        
    },[isFocused])

    if (!currentDeck) {return (
        <ActivityIndicator
        style = {styles.activityIndicator}
        />
        // <Text>loading...</Text>
        )}
        const deckList = currentDeck.cards
        const reducedList = deckList.reduce((accumulator, currentCard) => {
            const found = accumulator.find(card => card.id == currentCard.id)
            if (found) {found.quantity += 1}
            else {accumulator.push({...currentCard, quantity: 1})}
            return accumulator 
        },[])
        const newDeckList = reducedList.map(card => {
        return (
            <Pressable key={card.id}
            onPress = {() => {}}>
            <Text
            style={styles.deckList}
            > {card.name} x {card.quantity}</Text>
            </Pressable>
        )
    }
    )

    const {cards} = currentDeck
    const cardCount = cards.length

    const deleteDeck = () => {
        const url = "http://192.168.1.166:8080/decks/" + deck_id
        const request = new Request();
        request.delete(url, currentDeck)
        .then(navigate('AllDecks'))
        .catch(error => console.log(error))
    }

   


    return (

        <SafeAreaView style = {styles.container}>
            <Text
            style = {styles.deckName}
            >
            DECK NAME: {currentDeck.name}
            </Text>
            <Text
            style = {styles.deckName}>
                TOTAL CARDS: {cardCount}
            </Text>
            <View
            style = {styles.deckListContainer}>
          {newDeckList}
            </View>

            <View
            style = {styles.buttonContainer}
            >
            <View
            style = {styles.button}
            >
            <Button
           style = {styles.button}
           onPress = {() => {navigate("CardSearch", {deck_id: currentDeck.id})}}
           title= "add cards to deck"
           color = "black"
           />
           </View>
           <View
            style = {styles.button}
            >
            <Button
           style = {styles.button}
           onPress = {() => {navigate("CompositionChart", {deck_id: currentDeck.id, deckList: deckList})}}
           title= "deck compostion"
           color = "black"
           />
           </View>
           <View
            style = {styles.button}
            >
            <Button
           style = {styles.button}
           onPress = {deleteDeck}
           title= "delete deck"
           color = "black"
           />
           </View>
        </View>
        </SafeAreaView>

        )

}

const styles = StyleSheet.create({
    container: {
        flex: 1,
        paddingTop: 50,
        marginLeft: 20,
        marginRight: 20
    },
    card: {
        backgroundColor: "black",
        resizeMode: "contain",
        width: "30%",
        height: "20%",
        // width: 388,
        // height: 550,
    },
    button: {
        // flex: 1,
        margin: 10,
        marginTop: 10,
        marginBottom: 10,    
    },
    deckName: {
        fontWeight: 'bold'
    }, 
    deckList: {
        paddingLeft: 10
    }, 
    deckListContainer: {
        margin: 10
    }, 
    buttonContainer: {
        justifyContent: 'space-between'
    },
    activityIndicator: {
        alignContent: "center",
        justifyContent: "center",
        alignItems: "center"
    }
})

export default DeckScreen;


