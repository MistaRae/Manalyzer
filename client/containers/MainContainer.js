import React, {useState, useEffect}from 'react';
import { StyleSheet, Text, View } from 'react-native';
import { createStackNavigator } from '@react-navigation/stack';
import LogInContainer from './LogInContainer';


const MainContainer = () => {

  

    return(
        <View style={styles.container}>
            <LogInContainer style={styles.container}/>
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

export default MainContainer;