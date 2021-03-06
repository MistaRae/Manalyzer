import React, {useState, useEffect}from 'react';
import { Alert, Pressable, StyleSheet, Text, View, Image } from 'react-native';
import { SafeAreaView } from 'react-native-safe-area-context';
import { useIsFocused } from '@react-navigation/native';

const DeckSnapshot = ({deck, navigation: { navigate }}) => {

    const {cards} = deck;
    const cardCount = cards.length
    const isFocused = useIsFocused()

    const [faceCard, setFaceCard] = useState(null)

    const getFaceCard = () => {
    const sortedCards = [...cards].sort(function(cardA,cardB){
        const priceA = cardA.price;
        const priceB = cardB.price;
        if (priceA > priceB){
            return -1
        }
        if (priceA < priceB){
            return 1
        }
        return 0;
    });

        const mostExpensiveCard = sortedCards[0]
        setFaceCard(mostExpensiveCard)
    }

    useEffect(()=>{
        let mounted = true
        if (mounted) {
        getFaceCard()
        }
        return function cleanup(){
            mounted = false
        }
    }, [isFocused])


    return(
        
        <SafeAreaView style={styles.container}>
            <Pressable 
            onPress={() => {
                const id = deck.id
                navigate('SpecificDeck', {deck_id: id, deck});
            }}>
            <View
            style={styles.snapshotContainer}
            >
                <View
                style={styles.deckInfoContainer}
                >
                    <Text style={styles.h1}>
                        DECK NAME: {deck.name}
                    </Text>
                    <Text style={styles.h2}>
                        CARD COUNT: {cardCount}
                    </Text>
                </View>
                <View
                
                >
                    {faceCard ?
                    <Image 
                    style={styles.card}
                    source = {{uri: faceCard.imageURI}} 
                    />
                    :
                    <Image 
                        style={styles.card}
                        source = {{uri: 'https://media.magic.wizards.com/image_legacy_migration/magic/images/mtgcom/fcpics/making/mr224_back.jpg'}} 
                        />
                    }            
                </View>
            </View>
            </Pressable>
        </SafeAreaView>   
    )

}

const styles = StyleSheet.create({
    container: {
      flex: 1,
      alignItems: 'flex-start',
      justifyContent: 'flex-start',
      marginLeft: 20,
      marginRight: 10,
    },
    h1: {
        fontSize: 14,
        fontWeight: 'bold'
    },
    h2: {
        fontSize:14,
    },
    outline: {
        borderColor: "red",
        borderWidth: 2,
    },
    card: {
        margin: 20,
        resizeMode: "contain",
        width: 194,
        height: 275,
        // width: 97,
        // height: 137.5
    },
    snapshotContainer:{
        flexDirection: 'row'
    }, 
    deckInfoContainer: {
        marginLeft: 25,
        width: 100,
        paddingTop: 50,
        alignItems: 'flex-start',
        justifyContent: 'flex-start',
    }
});

export default DeckSnapshot;