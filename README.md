# Package Name : WxIBMEventStreamsDemo

This is a webMethods package and requires a webMethods Integration Server to host it. Package versioning and configuration can be found in the package [manifest](./JcEventStreamsCollaboration/manifest.v3) file. Service and API documentation is available on the package's home page http:// &lt;server&gt;:&lt;port&gt;/&lt;packagename>.

We've created this package in order to give you a demo of how to produce and consume messages from IBM Event Streams with webMethods Integration. 

## Setup

You will need to update the connection properties from the admin UI at http://localhost:5555, then navigate to Streaming -> Provider settings -> "WxIBMEventStreamsDemo_IBMEventStream_SaaS"

Edit the kafka connection properties with your own by copying and pasting them into the "Configuration Parameters" section. Don't forget to then replace the password value [*****] with your own API key.

You should then test the connection to see if webMethods can successfully fetch available topics and if that works you can then enable the connection for use.

## Try it

To try it out navigate to the package's home page at http://localhost:5555/WxIBMEventStreamsDemo