var lodgesJson;
const host = getDomain();

function getDomain(){
    var url = window.location.href;
    var arr = url.split("/");
    var result = arr[0] + "//" + arr[2];
    return result;
}

function getLodgesJson(){
    $.getJSON(host + '/api/lodge', function(data) {
        lodgesJson = data;
        console.log(lodgesJson);
    });
}

const lodgeData = function(){
    getLodgesJson();
}

$(document).ready(lodgeData);