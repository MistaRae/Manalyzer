import React, {useState, useEffect}from 'react';
import { StyleSheet, Text, View } from 'react-native';
import { SafeAreaView } from 'react-native-safe-area-context';



const DeckSnapshot = ({deck}) => {



    return(
       
        <SafeAreaView style = {styles.container}>

            <Text >
                name: {deck.name}
            </Text>
            <Text> 
                total cards: {deck.cardCount}
            </Text>
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

export default DeckSnapshot;