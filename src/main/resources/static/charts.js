var bestFitness = 0.0;
var bestSerie;
var workerSeries = [];
var bestOfAllPoints = [];

function addPointToCharts(workerId, xVal, value) {
    var point = {
        category: workerId,
        x: xVal,
        y: value
    };

    // best in time
    if(value > bestFitness) {
        chartBestInTime.series[0].addPoint(point);
        bestFitness = value;
    }

    // all in time
    if (workerSeries[workerId] === undefined) {
        workerSeries[workerId] = chartAllInTime.addSeries({
            name: "Worker " + workerId,
            data: [],
            marker: {
                enabled: true,
                radius: 3
            }
        });
    }

    workerSeries[workerId].addPoint(point, true, false);

    // best of all
    if (bestOfAllPoints[workerId] === undefined) {

    }

}

Highcharts.setOptions({
    lang: {
        noData: "Waiting for data from server"
    },

    global: {
        useUTC: false
    }
});

var chartSettings = {
    rangeSelector: {
        allButtonsEnabled: true,
        buttons: [{
            type: 'second',
            count: 30,
            text: '30 secs'
        }, {
            type: 'minute',
            count: 1,
            text: '1 min'
        }, {
            type: 'minute',
            count: 2,
            text: '2 min'
        }, {
            type: 'minute',
            count: 5,
            text: '5 min'
        }, {
            type: 'minute',
            count: 10,
            text: '10 min'
        }, {
            type: 'minute',
            count: 30,
            text: '30 min'
        }, {
            type: 'hour',
            count: 1,
            text: '1 h'
        }],
        buttonTheme: {
            width: 60
        },
        selected: 2
    }
};