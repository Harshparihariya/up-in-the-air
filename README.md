# up-in-the-air

To run the application import the files and then 
run mvn clean install 
run UpInTheAirApplication 


APIs

#to get all flight details 

curl --location --request GET 'http://localhost:9094/get-all-flight-details' \
--data-raw ''


#for getting the booking details 

curl --location --request GET 'localhost:9094/booking-details?id=3' \
--data-raw ''


#for booking the flight 

curl --location --request GET 'localhost:9094/book-flight' \
--header 'Content-Type: application/json' \
--data-raw '{
    "flightdetails": {
        "flightNumber": "A322",
        "departureDateTime": "2022-12-01T12:00:00",
        "arrivalCity": "Bangalore",
        "departureCity": "Delhi",
        "ticketPrice": "7000",
        "arrivalDateTime": "2022-12-01T09:00:00"
    },
    "passengers": [
        {
            "name": "Diptam",
            "address": "Sector 168,Noida",
            "phoneNumber": "7920082901",
            "emailId": "diptam@gmail.com"
        }
        
        
        
Working on it for further development need to add a frontend and optimise it even more         
    ],
    "bookingDateTime": "2022-12-19T12:10:00"
}'
