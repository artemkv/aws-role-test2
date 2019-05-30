const AWS = require('aws-sdk');

console.log("Running...");

AWS.config.update({ region: 'eu-west-1' });
let s3 = new AWS.S3();

s3.listBuckets(function(err, data) {
    if (err) {
        console.log("Error is: " + err);
    } else {
        console.log("Data is: " + JSON.stringify(data));
    }
});