# fibonacci-test

Good. I used Java along with Springboot because it's my main development language and framework and the one I feel most comfortable building applications with.
Create a controller to be able to receive http requests and a service class to handle all the logic, this way I decouple the code a bit and make it more readable.

I used BigInteger as the object to handle the data input, calculation, and response, because BigInteger is a class that allows handling of very large numbers, giving it more ability to perform larger calculations.

There aren't many improvement opportunities for such a simple API. However, in the future one could better validate the input format, checking that it is a number and not negative,
and return a message accordingly, at the moment it only returns 400 bad requests. On the other hand, a result cache could be implemented to return
the same query without having to recalculate it. The algorithm could also be improved with some recursive version.
