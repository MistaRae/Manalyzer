import React, {useState, useEffect}from 'react';
import { StyleSheet,SafeAreaView, Text, View, Dimensions } from 'react-native';
import { ProgressChart, BarChart } from 'react-native-chart-kit';

const screenWidth = Dimensions.get("window").width

const CompositionChart = ({route, navigation : {navigate}}) => {

    const {deckList} = route.params; 
    const deck_id = route.params; 
    const cardCount = deckList.length 

    const getPercentage = (cardQuantity, cardCount) => {
       const percentageContent =  cardQuantity / cardCount 
       percentageContent.toFixed(2);
       const float = new Number(percentageContent)
       return float
    } 

    const getChartData = () => {
        const reducedList = deckList.reduce((accumulator, currentCard) => {
            const found = accumulator.find(card => card.type == currentCard.type) 
            if (found) {found.quantity += 1}
            else {accumulator.push({...currentCard, quantity: 1})}
            return accumulator 
        },[]); 

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

        const newData = sortedList.map((cardType) => getPercentage(cardType.quantity, cardCount));
        return newData;
    } 

    const data = {
        labels: ["Art.","Crea.", "Ench.","Inst.","Land", "Sorc."], 
        data: getChartData()
    }

    const ManaCurve = () => {

        const getBarData = () => {
            const reducedList = deckList.reduce((accumulator, currentCard) => {
                const found = accumulator.find(card => card.cost == currentCard.cost)
                if (found) {found.quantity += 1}
                else {accumulator.push({...currentCard, quantity: 1})}
                return accumulator 
            },[]); 
            const sortedList = reducedList.sort(function(a,b){
                const typeA = a.cost;
                const typeB = b.cost;
                if (typeA < typeB){
                    return -1
                }
                if (typeA > typeB){
                    return 1
                }
                return 0;
            })
    
            const newData = sortedList.map((card) => card.quantity)
            return newData;
        } 

        const getBarLabels = () => {
            const reducedList = deckList.reduce((accumulator, currentCard) => {
                const found = accumulator.find(card => card.cost == currentCard.cost)
                if (found) {found.quantity += 1}
                else {accumulator.push({...currentCard, quantity: 1})}
                return accumulator 
            },[]); 
            const sortedList = reducedList.sort(function(a,b){
                const typeA = a.cost;
                const typeB = b.cost;
                if (typeA < typeB){
                    return -1
                }
                if (typeA > typeB){
                    return 1
                }
                return 0;
            })
    
            const newData = sortedList.map((card) => card.cost)
            return newData;
        }
            const barData = {
                labels: getBarLabels(),
                datasets: [
                    {
                data: getBarData()
              },
            ],
          };

        return (
            <SafeAreaView>
                <BarChart
                    data={barData}
                    width={screenWidth -40}
                    height={220}
                    // yAxisLabel={""}
                    // xAxisLabel={""}
                    chartConfig={barChartConfig}/>
            </SafeAreaView>
        )
    }


    const Ratings = () => {

        let rating = 0
        let totalCost = 0;
        let totalCreatures = 0;
        let totalInstants = 0;
        let totalSorceries = 0;
        let totalLand = 0;

        deckList.forEach((card) => totalCost += card.cost)
          
          deckList.forEach((card) => {
            if(card.type == 'LAND'){
                totalLand += 1 
            }
            return totalLand
        })

          deckList.forEach((card) => {
            if(card.type == 'CREATURE'){
                totalCreatures += 1 
            }
            return totalCreatures
        })

          deckList.forEach((card) => {
            if(card.type == 'INSTANT'){
                totalInstants += 1 
            }
            return totalInstants
        })

          deckList.forEach((card) => {
            if(card.type == 'SORCERY'){
              totalSorceries += 1 
            }
            return totalSorceries
      })

        let playables = cardCount - totalLand 
        let averageCost = totalCost / playables

        const getRating = () => {
            if (cardCount > 59){
                rating +=1
            } 
            if(cardCount / totalLand > 0.3) {
                rating += 1
            }
            if(averageCost > 2.0 && averageCost < 3.3) {
                rating += 1
            }
            if(cardCount / totalCreatures > 0.2 && cardCount / totalCreatures < 0.4){
                rating += 1.5
            }
            if(totalInstants > totalSorceries) {
                rating += 0.5
            }
        }
        
        getRating()

        return(
            <SafeAreaView>
            {/* <Text>{rating > 0 && rating < 1} &#11240; </Text> */}
            <Text
            style = {styles.ratings}
            >RATING: {rating}/5</Text>
            </SafeAreaView>
        )
    }

    return (
        <SafeAreaView
        style = {styles.container}>
            <ProgressChart
              style={styles.progressChart}
              data={data}
              width={screenWidth -40}
              height={220}
              strokeWidth={12}
              radius={30}
              chartConfig={progressChartConfig}
              hideLegend={false}
            />
            <ManaCurve
            style = {styles.barChart}
            />
            <Ratings
            style = {styles.ratings}
            />
        </SafeAreaView>
    )
};

const progressChartConfig = {
    backgroundColor: '#ffffff',
    backgroundGradientFrom: '#1E2923',
    backgroundGradientTo: '#08130D',
    color: (opacity = 1) => `rgba(26, 255, 146, ${opacity})`,
    style: {
    borderRadius: 16
}}

const barChartConfig = {
    backgroundColor: '#ffffff',
    backgroundGradientFrom: '#1E2923',
    backgroundGradientTo: '#08130D',
    color: (opacity = 1) => `rgba(26, 255, 146, ${opacity})`,
    style: {
    borderRadius: 16
    }
}

const styles = StyleSheet.create({
    container: {
        margin: 20,
        flex: 1,
        // backgroundColor: '#fff',
        alignItems: 'center',
        justifyContent: 'flex-start',
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
    }, 
    barChart: {
        marginTop: 10,
        marginBottom: 10
    },
    progressChart: {
        marginTop: 0,
        marginBottom: 10
    }, 
    ratings: {
        padding: 20,
        fontSize: 20
    }

})

export default CompositionChart