var stats = {
    type: "GROUP",
name: "All Requests",
path: "",
pathFormatted: "group_missing-name-b06d1",
stats: {
    "name": "All Requests",
    "numberOfRequests": {
        "total": "1000",
        "ok": "1000",
        "ko": "0"
    },
    "minResponseTime": {
        "total": "488",
        "ok": "488",
        "ko": "-"
    },
    "maxResponseTime": {
        "total": "3872",
        "ok": "3872",
        "ko": "-"
    },
    "meanResponseTime": {
        "total": "2057",
        "ok": "2057",
        "ko": "-"
    },
    "standardDeviation": {
        "total": "1126",
        "ok": "1126",
        "ko": "-"
    },
    "percentiles1": {
        "total": "1768",
        "ok": "1768",
        "ko": "-"
    },
    "percentiles2": {
        "total": "3574",
        "ok": "3574",
        "ko": "-"
    },
    "percentiles3": {
        "total": "3795",
        "ok": "3795",
        "ko": "-"
    },
    "percentiles4": {
        "total": "3864",
        "ok": "3864",
        "ko": "-"
    },
    "group1": {
    "name": "t < 800 ms",
    "htmlName": "t < 800 ms",
    "count": 208,
    "percentage": 21
},
    "group2": {
    "name": "800 ms <= t < 1200 ms",
    "htmlName": "t >= 800 ms <br> t < 1200 ms",
    "count": 20,
    "percentage": 2
},
    "group3": {
    "name": "t >= 1200 ms",
    "htmlName": "t >= 1200 ms",
    "count": 772,
    "percentage": 77
},
    "group4": {
    "name": "failed",
    "htmlName": "failed",
    "count": 0,
    "percentage": 0
},
    "meanNumberOfRequestsPerSecond": {
        "total": "200",
        "ok": "200",
        "ko": "-"
    }
},
contents: {
"req_get-user-reques-a4fef": {
        type: "REQUEST",
        name: "get user request",
path: "get user request",
pathFormatted: "req_get-user-reques-a4fef",
stats: {
    "name": "get user request",
    "numberOfRequests": {
        "total": "1000",
        "ok": "1000",
        "ko": "0"
    },
    "minResponseTime": {
        "total": "488",
        "ok": "488",
        "ko": "-"
    },
    "maxResponseTime": {
        "total": "3872",
        "ok": "3872",
        "ko": "-"
    },
    "meanResponseTime": {
        "total": "2057",
        "ok": "2057",
        "ko": "-"
    },
    "standardDeviation": {
        "total": "1126",
        "ok": "1126",
        "ko": "-"
    },
    "percentiles1": {
        "total": "1768",
        "ok": "1768",
        "ko": "-"
    },
    "percentiles2": {
        "total": "3574",
        "ok": "3574",
        "ko": "-"
    },
    "percentiles3": {
        "total": "3795",
        "ok": "3795",
        "ko": "-"
    },
    "percentiles4": {
        "total": "3864",
        "ok": "3864",
        "ko": "-"
    },
    "group1": {
    "name": "t < 800 ms",
    "htmlName": "t < 800 ms",
    "count": 208,
    "percentage": 21
},
    "group2": {
    "name": "800 ms <= t < 1200 ms",
    "htmlName": "t >= 800 ms <br> t < 1200 ms",
    "count": 20,
    "percentage": 2
},
    "group3": {
    "name": "t >= 1200 ms",
    "htmlName": "t >= 1200 ms",
    "count": 772,
    "percentage": 77
},
    "group4": {
    "name": "failed",
    "htmlName": "failed",
    "count": 0,
    "percentage": 0
},
    "meanNumberOfRequestsPerSecond": {
        "total": "200",
        "ok": "200",
        "ko": "-"
    }
}
    }
}

}

function fillStats(stat){
    $("#numberOfRequests").append(stat.numberOfRequests.total);
    $("#numberOfRequestsOK").append(stat.numberOfRequests.ok);
    $("#numberOfRequestsKO").append(stat.numberOfRequests.ko);

    $("#minResponseTime").append(stat.minResponseTime.total);
    $("#minResponseTimeOK").append(stat.minResponseTime.ok);
    $("#minResponseTimeKO").append(stat.minResponseTime.ko);

    $("#maxResponseTime").append(stat.maxResponseTime.total);
    $("#maxResponseTimeOK").append(stat.maxResponseTime.ok);
    $("#maxResponseTimeKO").append(stat.maxResponseTime.ko);

    $("#meanResponseTime").append(stat.meanResponseTime.total);
    $("#meanResponseTimeOK").append(stat.meanResponseTime.ok);
    $("#meanResponseTimeKO").append(stat.meanResponseTime.ko);

    $("#standardDeviation").append(stat.standardDeviation.total);
    $("#standardDeviationOK").append(stat.standardDeviation.ok);
    $("#standardDeviationKO").append(stat.standardDeviation.ko);

    $("#percentiles1").append(stat.percentiles1.total);
    $("#percentiles1OK").append(stat.percentiles1.ok);
    $("#percentiles1KO").append(stat.percentiles1.ko);

    $("#percentiles2").append(stat.percentiles2.total);
    $("#percentiles2OK").append(stat.percentiles2.ok);
    $("#percentiles2KO").append(stat.percentiles2.ko);

    $("#percentiles3").append(stat.percentiles3.total);
    $("#percentiles3OK").append(stat.percentiles3.ok);
    $("#percentiles3KO").append(stat.percentiles3.ko);

    $("#percentiles4").append(stat.percentiles4.total);
    $("#percentiles4OK").append(stat.percentiles4.ok);
    $("#percentiles4KO").append(stat.percentiles4.ko);

    $("#meanNumberOfRequestsPerSecond").append(stat.meanNumberOfRequestsPerSecond.total);
    $("#meanNumberOfRequestsPerSecondOK").append(stat.meanNumberOfRequestsPerSecond.ok);
    $("#meanNumberOfRequestsPerSecondKO").append(stat.meanNumberOfRequestsPerSecond.ko);
}