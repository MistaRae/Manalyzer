import React, {useState, useEffect}from 'react';
import { SafeAreaView, Image, StyleSheet, Text, View } from 'react-native';
import { get } from 'react-native/Libraries/TurboModule/TurboModuleRegistry';

const DeckScreen = ({route, navigation}) => {

    const {deck_id} = route.params;

    // const {deck} = route.params;
    // const topCard = deck.map((card) => {
    //     card.name
    // })
    // console.log(topCard)

    const [currentDeck,setCurrentDeck] = useState([]);
    const [cardData,SetCardData] = useState(null);
    const [deckImageURL, setDeckImageURL] = useState('https://c1.scryfall.com/file/scryfall-cards/border_crop/front/1/2/12ab9836-bc90-4d92-a86d-b8e1b7671aa7.jpg?1562898915');


    const baseURL = 'http://192.168.1.166:8080/decks/';
    const ImageSearchURL = "https://api.scryfall.com/cards/named?";
    const randomCardURL = "https://api.scryfall.com/cards/random"

    const getCurrentDeck = () => {
            return fetch(baseURL + deck_id)
                .then(res => res.json())
                .then(data => setCurrentDeck(data))
        };

    // const getCardData = () => {
    //     return fetch(randomCardURL)
    //     .then(res => res.json())
    //     .then(data => setCardData(data))
    // }

    // const getDeckImageURL = () => {
    //     return fetch()
    //     .then(res => res.json())
    //     .then(data => JSON.stringify(data))
    //     .then(url => setDeckImageURL(url))
    // }

    useEffect(() => {
        getCurrentDeck()
        // getDeckImageURL()
    },[])


    return (

        <SafeAreaView>
            <Text>
            DECK NAME: {currentDeck.name}
            </Text>
            <Text>
                TOTAL CARDS: {currentDeck.cardCount}
            </Text>
            <Text>
                DECK LIST: 
            </Text>
            <Image 
                style={styles.card}
                source = {{uri: deckImageURL}}
            
            /> 
                
        </SafeAreaView>

        )

}

const styles = StyleSheet.create({
    container: {
        paddingTop: 10,
    },
    card: {
        backgroundColor: "black",
        width: 388,
        height: 550,
    }
})

export default DeckScreen;


