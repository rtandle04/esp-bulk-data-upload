project :- esp-bulk-data-upload

API:-
1. boolean saveComplexJson(User user)

Uploading the bulk data 
1) We can upload entire JSON structure as a single attribute i.e. Map.
2) We can also convert from Map back to JSON 

Example request body :- We can send any complex json structure to a single attribute and store it in DB.
example1):-  In the below example userData json strucutre as a single attribute

{
"userId":"123",
"userData":{"userName":"ramakanth",
"emailId":"dummy",
"address":"",
"siblings": [
        {
            "name":  "Andrew", 
            "age":   "23", 
            "alive": "true"
        },
        {
            "name":  "Christine",
            "age":   "19",
            "alive": "true"
        }
        ]
}
}


