# 1st Assessment


* Each assignment must be the sole work of the student who received it.
* Assignment will be closely monitored, and students may be asked to explain any suspicious similarities with any piece of code available.
* When you submit an assignment that is not your own original work you will get Zero _(we have some tools to identify plagio)_.


This assignment contains an _embedded evaluation application_ which will allow you to see your progress in real-time. You will need **Docker**
and a (recent) version of **IntelliJ** (some help [here](https://gitlab.estig.ipb.pt/dsys/ds-classes/-/wikis/first-steps)).

To start the assessment perform the following steps:

* Open the `docker-compose.yml` file on the root of this project and start the service(s)
  there:
    * Either by hitting the <span>&triangleright;&triangleright;</span> button to start all services;
    * Or, if you prefer to use the terminal, `cd` to the project's directory and issue - `docker-compose up`
* Use your browser to open this url - http://localhost:8989 - if all went well, you should see the assessment information
  and the completion status of each step.


The assignment requires you to modify the following files:

* `src/main/proto/assessment.proto` - contains an incomplete `grpc` protocol buffers which you will use for your `message` and `service` declarations;
* `src/main/java/pt/ipb/dsys/assessment1/Main.java` - contains an incomplete `.java` file which you will use to implement a `grpc` client.

The server part of the `grpc` implementation already exists on the `docker` container you started earlier listening on
`127.0.0.1:8888`. You just need to write your `.proto`and `.java`code to match it!

The next section describes, in detail the `service` and `message` declarations you need in order to achieve the assignment.

# Triangle

The service running on the server was implemented according to the following specification:

* **Messages**:
  * `Scalar` with a single attribute name `value` (`double`)
  * `TriangleParam` with two atrributes, `base` and `height` both of type `double`

* **Service(s)**:
  * `Triangle` with the following `rpc` methods:
      * A method named `area` which receives a parameter of type `TriangleParam` and returns a `Scalar`

Modify the `.proto` file to declare this objects.

After compiling your code, all the _stub_ classes for your `messages` and `services` should have been created.

Modify the `Main.java` class (namely the `main` method) to connect to server `127.0.0.1:8888` using **plaing text** 
connection (hint: investigate the`ManagedChannel` class).

Obtain a new blocking stub for the `Triangle` service and use the remote methods to:
* Calculate the area of a square with base 314883 and height 314883.

The assignment will be marked as completed when you are able to:

1. Connect to the `grpc` server;
2. Invoke the `area` method;

<font size="5">**Good Luck!**</font>