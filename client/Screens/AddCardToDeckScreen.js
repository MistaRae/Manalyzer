import React, {useState, useEffect}from 'react';
import { Image, Alert, Text,TextInput, Button, View, SafeAreaView, StyleSheet, Pressable } from 'react-native';
import Request from '../helpers/request';
const AddCardToDeckScreen = ({route, navigation: { navigate }}) => {

    const [currentCard, setCurrentCard] = useState({});
    const [searchString,setSearchString] = useState('');
    const [cardData, setCardData] = useState({})
    const [modalVisible, setModalVisible] = useState(false);

    const {deck_id} = route.params;


    useEffect(() => {
        getCard()
    },[searchString])

    const baseURL = "https://api.scryfall.com/cards/named?fuzzy=";

    const addCardToDeck = () => {
        console.log(deck_id);
        const url = "http://192.168.1.166:8080/decks/" + deck_id + "/add-card"
        const request = new Request();
        request.post(url, currentCard)
        .then(data => navigate('SpecificDeck', {deck_id: data.id}))
    }

    // this.decks = new ArrayList<>();
    // this.name = name;
    // this.colour = colour;
    // this.cost = cost;
    // this.oracleText = oracleText;
    // this.power = power;
    // this.toughness = toughness;
    // this.type = type;

    const parseType = rawType => {
        if (rawType.includes('creature')) {
            return 'CREATURE';
        } else if (rawType.includes('land')) {
            return 'LAND';
        } else if (rawType.includes('artefact')) {
            return 'ARTEFACT';
        } else if (rawType.includes('enchantment')) {
            return 'ENCHANTMENT';
        } else if (rawType.includes('instant')) {
            return 'INSTANT';
        } else if (rawType.includes('sorcery')) {
            return 'SORCERY';
        }
    }

    const getCard = () => {
        return fetch(baseURL + searchString)
            .then(res => res.json())
            .then(data => {
                const { id, type_line, toughness, power, cmc, name, colors, oracle_text, image_uris } = data;
                // TODO Colors as array, decks as something
                
                setCurrentCard({
                    id: id,
                    decks: [],
                    name: name,
                    colour: colors[0] || "",
                    cost: cmc,
                    oracleText: oracle_text,
                    power: power,
                    toughness: toughness,
                    type: parseType(type_line.toLowerCase()),
                    image_uris: image_uris,
                });
            })
    };


    return (
        <SafeAreaView 
        style = {styles.container}
        >
            <View 
            style={styles.all_fields}
            >
            <TextInput 
            style = {styles.search_field}
            onChangeText = {(text) => setSearchString(text)}
            placeholder = "search by card name..."/>        
            </View>
            {currentCard.name ? 
                <Image 
                style={styles.card}
                source = {{uri: currentCard.image_uris.border_crop}} 
                />
                :
                <Image 
                style={styles.card}
                source = {{uri: 'https://media.magic.wizards.com/image_legacy_migration/magic/images/mtgcom/fcpics/making/mr224_back.jpg'}} 
                />
            }
            <Button
            style = {styles.button}
            title = {`${deck_id}`}
            color = "black"
            onPress = {addCardToDeck}
            />
        </SafeAreaView>
    )

}

const styles = StyleSheet.create({
    container: {
        margin: 20,
        flex: 1,
        backgroundColor: '#fff',
        alignItems: 'center',
        justifyContent: 'center',
    }, 
    all_fields: {
        flexDirection: "row",
        flex:1,
    },
    search_field: {
        borderColor: "black",
        borderWidth: 2,
        flex: 1,
        padding: 10,
        height: 50,
        margin: 5
    }, 
    outline: {
        flex: 1,
        borderColor: "red",
        borderWidth: 2,
    },
    card: {
        margin: 20,
        // backgroundColor: "black",
        resizeMode: "contain",
        width: "100%",
        height: "70%",
        // width: 388,
        // height: 550,
    }
})

export default AddCardToDeckScreen;