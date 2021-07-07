import React, {useState, useEffect}from 'react';
import { ScrollView, StyleSheet, Text, SafeAreaView, View } from 'react-native';
import { useIsFocused } from '@react-navigation/native'
import DeckSnapshot from '../components/all_decks/DeckSnapshot';
import MenuBar from '../components/app_utility/MenuBar';
import NewDeckForm from '../components/app_utility/NewDeckForm'

const AllDecksScreen = ({navigation}) => {

    const [decks, setDecks] = useState([]);
    const isFocused = useIsFocused()

  

    const baseURL = 'http://192.168.1.166:8080/decks';

    const getDecks = () => {
            return fetch(baseURL)
                .then(res => res.json())
                .then(data => setDecks(data))
        };

    useEffect(() => {
        let mounted = true
        if (mounted) {
            getDecks()  
        }
            
            return function cleanup(){
                mounted = false
            }
    },[[isFocused]])

    const deckNodes = decks.map((deck) => {

        // console.log(deck)

        return ( 
            <DeckSnapshot key ={deck.id} deck={deck} navigation={navigation} />
        )
    });
 
    if (decks.length == 0) {
        return (
            <Text>loading</Text>
        )
    }

    return(
        
        <SafeAreaView style = {styles.container}>
            <MenuBar navigation = {navigation}/>
            <ScrollView>
          {deckNodes}
          </ScrollView>
        </SafeAreaView>
    )

}

const styles = StyleSheet.create({
    container: {
        // marginLeft: 20,
        flex: 1,
        backgroundColor: '#fff',
        // alignItems: 'center',
        // justifyContent: 'center',
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

