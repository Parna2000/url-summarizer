# URL SUMMARIZER
This is a URL summarizer application which can summarize the content of a URL, if it is text based. The frontend of this application is made with react, the backend consist of Springboot and fastAPI. Here the frontend sends requests to the springboot server. The springboot server act as a middleman and sends the requests to the fastAPI which performs the actual summarization task using thisrd party API 'SMMRY API'.
The fastAPI server then sends the response to springboot server which eventually send it back to frontend. The resquest history is also recorded by the springboot server in PostgreSQL database.

Links to other parts of the project:

1. Link to react frontend: https://github.com/Parna2000/url-summarizer-frontend/tree/main
2. Link to springBoot server: https://github.com/Parna2000/url-summarizer/tree/main/backend/Spring-Boot
3. Link to fastAPI-server: https://github.com/Parna2000/url-summarizer-fastAPI/tree/main

## SPRING-BOOT SERVER FOR URL SUMMARIZER
These are the steps you need to follow to run the spring-boot server in your local environment.
1. Fork the repository to your github repository.
2. Clone the project to you local environment.
3. Sync the gradle.
4. Run the `main` function of `Application.java`.
5. Adjust the ports, if needed.
