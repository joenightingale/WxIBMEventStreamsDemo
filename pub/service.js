app.service('myserv', function() {
          this.getServiceList = function () {
    return [{"serviceName":"wx.eventstreams.consumer.consumeTemperature_:stream_target","description":"This is the service that is invoked with the results of the event trigger, the group name being the device and the averaged value being the temperature of the last 10 readings for it.","serviceinputs":[{"inputName":"stream_group","inputType":"Document List","inputComments":"temperatures grouped by device id","required":true,"wrapperType":"--"}],"serviceoutputs":[]},{"serviceName":"wx.eventstreams.producer:sendTemperature","description":"This service simulates an emitter with a series of temperatures for the given devices.","serviceinputs":[{"inputName":"devices","inputType":"Document List","inputComments":"no comment","required":true,"wrapperType":"--"},{"inputName":"startSeq","inputType":"String","inputComments":"no comment","required":true,"wrapperType":"--"}],"serviceoutputs":[]}];
}
this.getISEndpoint = function() { 
 return 'http://localhost:5555/';
}
this.getAPIList = function() { 
 return [];
}
this.getCreatedTime = function() { 
 return "26-08-2024 14:33:42 CEST";
}
this.getPackageInfo = function(){
 return{"packageName":"WxIBMEventStreamsDemo","displayName":"Event Streams Integration Demo","status":"Prototype","tags":["demo","events","streaming"],"createdDate":"21-08-2024 08:30:24 CEST","version":"1.0","buildNumber":"","description":"Demo webMethods packages to show how IBM Event Streams \ncan be tightly integrated with webMethods Integration"};
}
});
