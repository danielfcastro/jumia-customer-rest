# REST API - Customers

This documentation describes aspects and procedures to run this REST API

## Overview

This API was developed using Springboot 2.1.6.  It uses paging to reduce the overall weight over networking and increase the overall performance.

## Running the Example

1. Using the bash or command prompt navigate to the project directory
2. Run the command:
	```docker build -t jumia-api .```
3. Run the command
	```docker run -p 8080:8080 jumia-api```
4. Visit: <http://127.0.0.1:8080/v1/customers> (should display a JSON with the customers data)
5. Visit <http://localhost:8080/swagger-ui/index.html> (should display the Swagger Interface)

## Concepts

Pagination - It uses 3 query string parameters, namely: 'page', 'size' and 'sort' to implement the pagination


## License

[MIT](https://opensource.org/licenses/MIT)