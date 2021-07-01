import React, {useState, useEffect}from 'react';
import { SafeAreaView, StyleSheet, Text, View } from 'react-native';

const DeckContainer = () => {

    const [decks, setDecks] = useState("decks go here");

    return (
        <SafeAreaView>
            <Text>Deck info goes here </Text>
        </SafeAreaView>
    )

}

export default DeckContainer;


