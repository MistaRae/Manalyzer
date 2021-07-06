import React from 'react';
import { Alert, StyleSheet, Text,TextInput, Button, View, Image } from 'react-native';
import { NavigationContainer } from "@react-navigation/native"
import { createStackNavigator } from '@react-navigation/stack';

const LogIn = ({ navigation: { navigate } }) => {

    return(

    <View
    style = {styles.container}>
        <TextInput 
        style = {styles.textInputs}
        placeholder="Email"/>
        <TextInput 
        style = {styles.textInputs}
        secureTextEntry={true}
        placeholder="Password"/>
        <Button 
        style = {styles.button}
        onPress={() => navigate('AllDecks')}
        title = "Log In"
        color="black"/>
        <Image
        style = {styles.image}
        source = {{ uri : "https://images-wixmp-ed30a86b8c4ca887773594c2.wixmp.com/f/8b3d928c-e227-41f2-853d-3837c6374981/d1zb9mu-af86a342-d50f-418e-8a44-5f6b1814a00c.jpg?token=eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJ1cm46YXBwOjdlMGQxODg5ODIyNjQzNzNhNWYwZDQxNWVhMGQyNmUwIiwiaXNzIjoidXJuOmFwcDo3ZTBkMTg4OTgyMjY0MzczYTVmMGQ0MTVlYTBkMjZlMCIsIm9iaiI6W1t7InBhdGgiOiJcL2ZcLzhiM2Q5MjhjLWUyMjctNDFmMi04NTNkLTM4MzdjNjM3NDk4MVwvZDF6YjltdS1hZjg2YTM0Mi1kNTBmLTQxOGUtOGE0NC01ZjZiMTgxNGEwMGMuanBnIn1dXSwiYXVkIjpbInVybjpzZXJ2aWNlOmZpbGUuZG93bmxvYWQiXX0.wqy0LLtRAARNzufw6PBPHqrdETkeOwIciXuJJ4ofx7Y"}}
        />
    </View>
    )
}

const styles = StyleSheet.create({
    container: {
        marginLeft: 20,
        flex: 1,
        backgroundColor: '#fff',
        alignItems: 'center',
        justifyContent: 'center',
    },
    textInputs: {
        marginBottom: 10,
        borderColor: "grey",
        borderWidth: 2,
        padding: 5,
        width: 220
    },
    image: {
        height: 200,
        width: 200
    },
    button:{
        marginTop: 10
    }
})

export default LogIn;