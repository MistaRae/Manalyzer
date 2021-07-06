import React, {useState, useEffect}from 'react';
import { StyleSheet,SafeAreaView, Text, View } from 'react-native';
import { ProgressChart } from 'react-native-chart-kit';

const CompositionChart = ({route, navigation : {navigate}}) => {

    const deckList = route.params; // <<-- should this be a state
    const deck_id = route.params; // <<-- do i need this? should i just take the whole deck object through?

        const reducedList = deckList.reduce((accumulator, currentCard) => {
            const found = accumulator.find(card => card.type_line == currentCard.type_line) // <<-- count by card type
            if (found) {found.quantity += 1}
            else {accumulator.push({...currentCard, quantity: 1})}
            return accumulator 
        },[])

        // sort reduced list here? 
    const data = {
        labels: ["Artefacts","Creatures", "Enchantments","Instants","Land", "Sorceries"], 
        data: [0.10,0.6,0.2,0.3,0.5] // <<-- hard coded test values.
        // *** possible data set below -- need to be converted to a float?
        // *** percentages based on recommended quantities/composition of deck. 30% land, 40% creatures 30% spells and artefacts
        // data: [reducedList[0].quantity, reducedList[1].quantity,reducedList[2].quantity,reducedList[3].quantity,reducedList[4].quantity,reducedList[5].quantity]
      };
    return (
        <SafeAreaView>
            <ProgressChart
              data={data}
              width={screenWidth}
              height={220}
              strokeWidth={16}
              radius={32}
              chartConfig={chartConfig}
              hideLegend={false}
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
        flex: .1,
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

export default CompositionChart