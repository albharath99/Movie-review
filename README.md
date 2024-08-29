# Movie-review
Movie review system. Allows review by users.

Dev by A L BHARATH.

Current implementation:
APIs:

1) Create movie - creates an entry in MongoDB
   
     curl --location 'http://localhost:8080/api/movie' \
--header 'Content-Type: application/json' \
--header 'Cookie: JSESSIONID=516F64C4EFCE6DEBA267ECCACA131BEF' \
--data '{
    "id": 2,
    "name": "Indian",
    "director": "Shankar"
}'
