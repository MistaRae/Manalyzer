import React, {useState, useEffect}from 'react';
import { Alert, Pressable, StyleSheet, Text, View } from 'react-native';
import { SafeAreaView } from 'react-native-safe-area-context';



const DeckSnapshot = ({deck, navigation: { navigate }}) => {

    const {cards} = deck;
    const cardCount = cards.length

    return(
        
        <SafeAreaView style={styles.container}>
            <Pressable 
            // style={styles.outline}
            onPress={() => {
                const id = deck.id
                navigate('SpecificDeck', {deck_id: id, deck});
            }}>
            <Text style={styles.h1}>
                DECK NAME: {deck.name}
            </Text>
            <Text style={styles.h2}>
                CARD COUNT: {cardCount}
            </Text>
            </Pressable>
        </SafeAreaView>   
    )

}

const styles = StyleSheet.create({
    container: {
      flex: 1,
    //   backgroundColor: '#fff',
      alignItems: 'flex-start',
      justifyContent: 'flex-start',
      marginLeft: 20,
      marginRight: 20,
    },
    h1: {
        flex: 1,
        // backgroundColor: 'yellow',
        alignItems: 'center',
        justifyContent: 'center',
        fontSize: 20,
    },
    h2: {
        flex: 1,
        // backgroundColor: 'blue',
        alignItems: 'center',
        justifyContent: 'flex-start',
        fontSize:15,
    },
    outline: {
        borderColor: "red",
        borderWidth: 2,
    }
});

export default DeckSnapshot;