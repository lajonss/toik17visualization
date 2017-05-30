/**
 * Created by huber on 30.05.2017.
 */
/**
 * Created by huber on 30.05.2017.
 */

var chartBestOfAll = Highcharts.stockChart('chartBestOfAll', {

    rangeSelector: chartSettings.rangeSelector,

    title: {
        text: 'All Workers In Time'
    },

    plotOptions: {
        line: {
            enableMouseTracking: false
        },

        series:{
            pointInterval: 86400000
        }
    },

    legend: {
        layout: 'vertical',
        align: 'right',
        verticalAlign: 'middle',
        borderWidth: 0
    },

    series: [{
        name: 'all',
        data: []
    }]

});
