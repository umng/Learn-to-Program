function runProgram() {
  document.getElementById("output").innerHTML = "running Program...";

  var items = JSON.parse("[" + document.getElementById("input").value + "]");

  var sumMap = [];
  var countMap = [];
  for (var i in items) {
    for (var j in items[i]) {
      sumMap.hasOwnProperty(items[i][j])
        ? (sumMap[items[i][j]] += parseInt(i) + parseInt(j))
        : (sumMap[items[i][j]] = parseInt(i) + parseInt(j));
      countMap.hasOwnProperty(items[i][j])
        ? countMap[items[i][j]]++
        : (countMap[items[i][j]] = 1);
    }
  }
  // console.log(sumMap);
  // console.log(countMap);

  var followsPattern = true;
  var coordinateValue;
  for (var i in sumMap) {
    if (coordinateValue) {
      if (coordinateValue == sumMap[i] / countMap[i]) {
        followsPattern = true;
        break;
      } else {
        followsPattern = false;
      }
    }
    coordinateValue = sumMap[i] / countMap[i];
  }
  console.log(coordinateValue);
  console.log(followsPattern);

  document.getElementById("output").innerHTML = followsPattern;
}
