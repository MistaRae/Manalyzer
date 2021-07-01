import React, {useState, useEffect}from 'react';
import { StyleSheet, Text, View } from 'react-native';

const AllDecksContainer = () => {

    const [decks, setDecks] = useState([]);

    const baseURL = 'http://192.168.1.166:8080/decks';

    const getDecks = () =>  {
            return fetch(baseURL)
                .then(res => res.json())
                .then(data => setDecks(data))
                // .catch(()=>setDecks("Broken"))
        };


    useEffect(() => {
        getDecks()
    },[])


 
    return(
        <View style = {styles.container}>
           <Text> {decks.length > 0 ? decks[0].name : "broken"}</Text>
        </View>
    )

}

const styles = StyleSheet.create({
    container: {
      flex: 1,
      backgroundColor: '#fff',
      alignItems: 'center',
      justifyContent: 'center',
    },
  });

export default AllDecksContainer;