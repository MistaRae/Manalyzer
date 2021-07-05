import React, {useState, useEffect}from 'react';
import { SafeAreaView, Image, StyleSheet, Text, View, FlatList, Pressable, Button } from 'react-native';
import { NavigationEvents } from 'react-navigation';
import { useIsFocused } from '@react-navigation/native'


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
        <Text>loading...</Text>)}
        const deckList = currentDeck.cards
        const reducedList = deckList.reduce((accumulator, currentCard) => {
            const found = accumulator.find(card => card.id == currentCard.id)
            if (found) {found.quantity += 1}
            else {accumulator.push({...currentCard, quantity: 1})}
            return accumulator 
        },[])
        const newDeckList = reducedList.map(card => {
        return (
            <Pressable key={card.id}>
         
            <Text> {card.name} x {card.quantity}</Text>
            </Pressable>
            
        )
    }
    )

   


    return (

        <SafeAreaView style = {styles.container}>
            <Text>
            DECK NAME: {currentDeck.name}
            </Text>
            <Text>
                TOTAL CARDS: {currentDeck.cardCount}
            </Text>
            
          {newDeckList}
           
           <Button
           style = {styles.button}
           onPress = {() => {navigate("CardSearch", {deck_id: currentDeck.id})}}
           title= "add cards to deck"
           
           />
        
        </SafeAreaView>

        )

}

const styles = StyleSheet.create({
    container: {
        flex: 1,
        paddingTop: 10,
        marginLeft: 20,
    },
    card: {
        backgroundColor: "black",
        resizeMode: "contain",
        width: "30%",
        height: "20%",
        // width: 388,
        // height: 550,
    }
})

export default DeckScreen;


