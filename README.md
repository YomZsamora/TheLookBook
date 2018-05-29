# TheLookBook

A Java and spark web-app that uses GoodReads API to retrieve details / data on books and their respective authors. The application is part of the Week 5 Group Project.

## Description

Deciding what to read next? You’re in the right place. Tell the app what titles or genres you enjoye and it’ll give you surprisingly insightful recommendations.

![thelookbook](https://user-images.githubusercontent.com/38578499/40585148-2fada256-61b6-11e8-957b-5989697c59cb.png)

## Getting Started

A very simple app to exemplify how to get data from the GoodReads API using http calls on the server side. It doesn't make use of the database. Once the data is received, it is "forwarded" to the client to be displayed. One can display more data if desired.

##### Overview
The App does the following:
1. Fetch the books from the GoodReads API in JSON format
2. Deserialize the JSON data for each of the books into `Book` objects
3. Build an array of `Book` objects and create an `ArrayAdapter` for those books
4. Attach the adapter for the books to a ListView to display the data on screen

##### Technologies Used
- Java
- Spark
- JUnit
- Velocity Template Engine

##### Prerequisites
- Basic Git knowledge, including an installed version of Git.
- Your application must run on the OpenJDK version 6, 7 or 8.

##### Installation

- Clone this repository (https://github.com/YomZsamora/TheLookBook.git) to a location in your file system. 
- Open terminal command line then navigate to the root folder of the application.
- Run `gradle run` command.
- Navigate to `http://localhost:4567/` in your browser.

