project :- esp-bulk-data-upload

Uploading the bulk data
1) we can upload entire JSON structure as a single attribute i.e. Map.
2) we can also convert it to Map back to JSON 

Example request body :- We can send any complex json structure to a single attribute and store it in DB.
example1):- 
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


