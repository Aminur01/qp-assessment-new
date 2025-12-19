Grocery Booking API

This README provides instructions for interacting with the Grocery Booking API using cURL commands. The API supports functionalities for Admin and User roles, allowing management of grocery items and user bookings.

API Endpoints

Admin Responsibilities

1. Add New Grocery Items
curl --location 'http://localhost:8091/api/admin/grocery-items' \
--header 'Content-Type: application/json' \
--data '{
  "name": "Potato",
  "price": 55,
  "quantity": 50,
  "description": "Potato"
}'

2. View All Grocery Items

curl --location 'http://localhost:8091/api/admin/grocery-items'

3. Remove a Grocery Item

curl --location --request DELETE 'http://localhost:8091/api/admin/grocery-items/{id}'

4. Update Grocery Item Details

curl --location --request PUT 'http://localhost:8091/api/admin/grocery-items/{id}' \
--header 'Content-Type: application/json' \
--data '{
  "name": "Tomato",
  "price": 40,
  "quantity": 30,
  "description": "Fresh Tomatoes"
}'

5. Update Inventory Levels

curl --location --request PATCH 'http://localhost:8091/api/admin/grocery-items/{id}/inventory' \
--header 'Content-Type: application/json' \
--data '{
  "quantity": 100
}'

User Responsibilities

1. View Available Grocery Items

curl --location 'http://localhost:8091/api/user/grocery-items'

2. Book Multiple Grocery Items
curl --location --request POST 'http://localhost:8091/api/user/orders' \
--header 'Content-Type: application/json' \
--data '{
  "items": [
    { "id": 1, "quantity": 2 },
    { "id": 3, "quantity": 5 }
  ]
}'
