# Spring AI Function Calling API

## Overview

This README provides instructions on how to interact with a Spring AI application using function calling. You can use the provided `curl` command to send requests and receive responses from the AI service.

## Prerequisites

Before you start, ensure you have the following:
- **Spring AI Application**: Ensure your Spring AI application is up and running on `http://localhost:8080`.
- **cURL**: Ensure `curl` is installed on your system. You can download it from [curl's official website](https://curl.se/download.html) if needed.

## How to Use the API

The API endpoint provided below allows you to send a message and receive a response based on the AI's processing.

### API Endpoint

http://localhost:8080/ai/generate


### Example cURL Command

To send a request to the API and get a response, use the following `curl` command:

```bash
curl --location --request GET 'http://localhost:8080/ai/generate?message=What%20is%20the%20price%20of%20samsung%20and%20what%20is%20the%20quantity%20available'


{
  "response": "The price of Samsung products varies depending on the model and retailer. Please check the latest prices on our website. The quantity available also varies by store and product."
}
