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
        initializeLodgeSelectList();
        console.log(lodgesJson);
    });
}

const lodgeData = function(){
    getLodgesJson();
}

$(document).ready(lodgeData);

function buildLodgeSelectList(){
    const selectNaN = '<option value="" disabled selected>Select lodge</option>';
    var innerHtml = selectNaN;
    if(lodgesJson == undefined || lodgesJson == null) return innerHtml;
    for(let i=0; i<lodgesJson.length; i++)
        innerHtml += '<option value="' + lodgesJson[i].id + '">' + lodgesJson[i].name + '</option>';
    return innerHtml;
}

function initializeLodgeSelectList(){
    var innerHTML = buildLodgeSelectList();
    $('#lodgeSelector').html(innerHTML);
}