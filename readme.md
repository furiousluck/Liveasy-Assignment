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

```
1. POST /load  // Add a load
2. GET /loads/{shipperID} // Get all loads with the given shipperID
3. GET /load/{loadId} // Get a load by ID
4. PUT /load/{loadId} // Update a load by ID
5. DELETE /load/{loadId} // Delete a load by ID
6. GET /home //get all loads
```

## Sample Data
```json
{
	"loadingPoint": "jaipur",
	"unloadingPoint": "delhi",
	"productType": "chemicals",
	"truckType": "canter",
	"noOfTrucks": "1",
	"weight": "100",
    "comment":"",
	"shipperID" : "188d704e-5d44-4717-9382-4c9c98894e21",
	"date" : "02-01-2023"
}
```


## Development
1. Fork this repository.
2. Clone the forked repository.
3. Modify the application.properties file to connect to your PostgreSQL database.
4. Implement the API.