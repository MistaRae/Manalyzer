import React, {useState, useEffect}from 'react';
import { StyleSheet, Text, SafeAreaView, View } from 'react-native';
import DeckSnapshot from '../components/all_decks/DeckSnapshot';

const AllDecksScreen = () => {

    const [decks, setDecks] = useState([]);

    const baseURL = 'http://192.168.1.166:8080/decks';

    const getDecks = () => {
            return fetch(baseURL)
                .then(res => res.json())
                .then(data => setDecks(data))
        };

    useEffect(() => {
        getDecks()
    },[])

    const deckNodes = decks.map((deck) => {
        console.log(deck.id)
        return ( 

            <DeckSnapshot key ={deck.id} deck={deck}/>

        )
    });

 
    return(
        
        <View>
          {deckNodes}
        </View>
    )

}

const styles = StyleSheet.create({
    container: {
      flex: 1,
    //   backgroundColor: '#fff',
      alignItems: 'center',
      justifyContent: 'center',
    },
    h1: {
        flex: 1,
        // backgroundColor: '#fff',
        alignItems: 'center',
        justifyContent: 'flex-start',
        fontSize: 30,
    },
    h2: {
        flex: 1,
        backgroundColor: '#fff',
        alignItems: 'center',
        justifyContent: 'flex-start',
        fontSize: 20,
    }
});




export default AllDecksScreen;

// <DeckSnapshot key={deck.id}>
// <SafeAreaView style = {styles.container}>
//     <Text style = {styles.h1}>
//         name: {deck.name}
//     </Text>
//     <Text style = {styles.h2}> 
//         total cards: {deck.cardCount}
//     </Text>
// </SafeAreaView>
// </DeckSnapshot>