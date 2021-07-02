import React, {useState, useEffect}from 'react';
import { StyleSheet, Text, View } from 'react-native';
import LogInScreen from './LogInScreen';
import LogIn from '../components/app_utility/LogIn';



const HomeScreen = ({navigation}) => {



    return(
        <View style={styles.container}>
            <LogIn style={styles.container} navigation={navigation} />
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

export default HomeScreen;