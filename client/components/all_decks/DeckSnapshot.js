import React, {useState, useEffect}from 'react';
import { Alert, Pressable, StyleSheet, Text, View } from 'react-native';
import { SafeAreaView } from 'react-native-safe-area-context';



const DeckSnapshot = ({deck, navigation: { navigate }}) => {

    return(
       
        // style = {styles.container}
        // style = {styles.container}
        
        <SafeAreaView >
            <Pressable 
            onPress={() => {
                const id = deck.id
                navigate('SpecificDeck', {deck_id: id, deck});
            }}>
            <Text >
                name: {deck.name}
            </Text>
            <Text> 
                total cards: {deck.cardCount}
            </Text>
            </Pressable>
        </SafeAreaView>   
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
        backgroundColor: 'red',
        alignItems: 'center',
        justifyContent: 'flex-start',
        fontSize: 30,
    },
    h2: {
        flex: 1,
        backgroundColor: 'blue',
        alignItems: 'center',
        justifyContent: 'flex-start',
        fontSize: 20,
    }
});

export default DeckSnapshot;