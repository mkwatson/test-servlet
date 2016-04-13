# test-servlet

## Running

To start a web server for the application, run:

    lein ring server-headless
    
Then in other shell:
    
    curl 127.0.0.1:3000
    
You should see the main thread wait for the new thread to complete, and the request to complete after 5 seconds. Printing "From the dead!" to the console and returning "Hello World" in the HTTP request.

## License

Copyright © 2016 FIXME
