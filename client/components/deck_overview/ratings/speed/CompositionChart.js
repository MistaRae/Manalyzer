import React, {useState, useEffect}from 'react';
import { StyleSheet,SafeAreaView, Text, View, Dimensions } from 'react-native';
import { ProgressChart } from 'react-native-chart-kit';

const screenWidth = Dimensions.get("window").width

const CompositionChart = ({route, navigation : {navigate}}) => {

    const {deckList} = route.params; // <<-- should this be a state
    const deck_id = route.params; // <<-- do i need this? should i just take the whole deck object through?
    const cardCount = deckList.length // <<-- total number of cards in the deck for working out percentage content

    const getPercentageContent = (cardQuantity, cardCount) => {
       const percentageContent =  cardQuantity / cardCount //  <<-- numbers for chart need to be floats
       percentageContent.toFixed(2); // <<-- rounding to 2 decimal places
       const float = new Number(percentageContent)
       return float
    } 

    const getChartData = () => {
        const reducedList = deckList.reduce((accumulator, currentCard) => {
            const found = accumulator.find(card => card.type == currentCard.type) // <<-- count by card type(instant,sorcery,creature)
            if (found) {found.quantity += 1}
            else {accumulator.push({...currentCard, quantity: 1})}
            return accumulator // <<-- populating reducedList with accumulator values
        },[]); // <<-- second argument, new list

        const sortedList = reducedList.sort(function(a,b){
            const typeA = a.type.toUpperCase();
            const typeB = b.type.toUpperCase();
            if (typeA < typeB){
                return -1
            }
            if (typeA > typeB){
                return 1
            }
            return 0;
        })

        const newData = sortedList.map((cardType) => getPercentageContent(cardType.quantity, cardCount));
        return newData;
    } 

    const data = {
        labels: ["Art.","Crea.", "Ench.","Inst.","Land", "Sorc."], 
        data: getChartData()
        // data: [0.10,0.6,0.2,0.3,0.5] 
    }

    return (
        <SafeAreaView
        style = {styles.container}>
            <ProgressChart
              data={data}
              width={screenWidth -40}
              height={220}
              strokeWidth={16}
              radius={32}
              chartConfig={chartConfig}
              hideLegend={false}
            />
        </SafeAreaView>
    )
};

const chartConfig = {
    backgroundColor: '#ffffff',
    backgroundGradientFrom: '#1E2923',
    backgroundGradientTo: '#08130D',
    color: (opacity = 1) => `rgba(26, 255, 146, ${opacity})`,
    // color: (opacity = 1) => `rgba(26, 255, 146, ${opacity})`,
    style: {
    borderRadius: 16
}}

const styles = StyleSheet.create({
    container: {
        margin: 20,
        flex: 1,
        // backgroundColor: '#fff',
        alignItems: 'center',
        justifyContent: 'flex-start',
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