# Spring Arithmetic API

This is a simple Spring Boot application that performs basic arithmetic operations (addition, subtraction, multiplication, and division). The API accepts JSON requests with two numbers and a specified operation.

## Request Format

The request body should be in the following format:

```json
{
    "num1": <number1>,
    "num2": <number2>,
    "calculation": "<operation>"
}
```

### Available Operations:
- `add`: Adds `num1` and `num2`
- `sub`: Subtracts `num2` from `num1`
- `mul`: Multiplies `num1` by `num2`
- `div`: Divides `num1` by `num2` (returns error if `num2` is 0)

## Example Request

### Addition Example:
```json
{
    "num1": 10,
    "num2": 5,
    "calculation": "add"
}
```

### Response:
```json
{
    "result": 15
}
```

### Division Example:
```json
{
    "num1": 10,
    "num2": 2,
    "calculation": "div"
}
```

### Response:
```json
{
    "result": 5
}
```

## Running the Application

### Prerequisites

- [Java 11 or later](https://adoptopenjdk.net/)
- [Maven](https://maven.apache.org/)

### Steps to Run:

1. Clone the repository:
   ```bash
   git clone <repository-url>
   cd <project-directory>
   ```

2. Build the project:
   ```bash
   mvn clean install
   ```

3. Run the application using Maven:
   ```bash
   mvn spring-boot:run
   ```

4. The application will start on the default port `8080`.

## API Endpoints

- `POST /api/calculate`
  - Body: JSON object with `num1`, `num2`, and `calculation`
  - Response: JSON object with the result of the calculation.

Example cURL command to test the API:

```bash
curl -X POST http://localhost:8080/api/calculate 
  -H "Content-Type: application/json" 
  -d '{"num1": 10, "num2": 5, "calculation": "add"}'
```

This will return:

```json
{
    "result": 15
}
```

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.
```

This `README.md` provides an overview of how to use the API, examples of requests and responses, and how to run the Spring Boot application. Let me know if you need any adjustments or further details!

