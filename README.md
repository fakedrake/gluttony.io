[![codeship.io](https://codeship.io/projects/1551a390-c766-0131-6868-2a057a666bab/status)](https://www.codeship.io/projects/22160/)
# [gluttony.io](http://gluttony.herokuapp.com/)


All your RSS, atom and social feeds in one place.

## Prerequisites

You will need [Leiningen][1] 2.0 or above installed.

[1]: https://github.com/technomancy/leiningen

## Running

To start a web server for the application, run:

    lein ring server

## Testing

To test the platform run:

	lein test

## Features

I am still learning this so for now all I have is a JSON echo service
over GET thus with a running server you can:

	$ curl http://localhost:3000/echo-get\?people\=shit\&slipknot\=ftw
	{"slipknot":"ftw","people":"shit"}

## Developer notes

I made a new ns in *routes/* where I put all the "interesting" logic
and some stuff in *util.clj*. If you add another set of routes you
need to update *handler.clj*

## License

Copyright © 2014 Chris Perivolaropoulos
