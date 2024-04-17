# Liveasy Assignment

## Problem Statement
You have to implement a simple REST API for a library management system. The API should be able to perform the following operations:
1. Add a load
2. Get all loads
3. Get a load by ID
4. Update a load by ID
5. Delete a load by ID

## Requirements
1. The API shoudl be implemented using Spring Boot.
2. The data should be stored in a PostgreSQL database.

## Load
A load has the following attributes:
1. ID
2. Loading Point
3. Unloading Point
4. Product Type
5. Truck Type
6. Number of Trucks
7. Weight
8. Date
9. Comment
10. ShipperID

## API
The API should have the following endpoints:
1. POST /load
2. GET /loads/{shipperID}
3. GET /load/{loadId}
4. PUT /load/{loadId}
5. DELETE /load/{loadId}
6. GET /home
