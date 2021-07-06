import React, {useState, useEffect}from 'react';
import { StyleSheet,SafeAreaView, Text, View, Dimensions } from 'react-native';
import { BarChart } from 'react-native-chart-kit';

const ManaCurve = () => {


    const barData = {
        labels: ['January', 'February', 'March', 'April', 'May', 'June'],
        datasets: [
          {
            data: [20, 45, 28, 80, 99, 43],
          },
        ],
      };

    return (
        <SafeAreaView>
            <BarChart/>
        </SafeAreaView>

    )

}

export default ManaCurve;