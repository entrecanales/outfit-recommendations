# outfit-recommendations
## Description
This project is done to experiment with ChatGPT's API and to refresh my knowledge of Spring Boot. Also, because I want to build something that is relatively simple, but useful :D
## How to Run This
Follow these steps to run the Outfit Recommendations Spring Boot project locally:

🧰 Prerequisites

    Java 17 or higher installed

    Maven 3.8+ installed

    Git installed

    (Optional) Docker & Docker Compose for containerized setup

    An OpenAI API Key


🔐 Configure API Key

Create a file named application-secrets.properties in the root of the project (or in src/main/resources/ depending on your project setup), and add your OpenAI API key:

spring.ai.openai.api-key=YOUR_OPENAI_API_KEY

    Note: Do not commit this file to version control. You may want to add application-secrets.properties to your .gitignore.


🔧 Clone the Repository

git clone https://github.com/entrecanales/outfit-recommendations.git
cd outfit-recommendations


▶️ Run with Maven

./mvnw spring-boot:run

Or, if you have Maven installed globally:

mvn spring-boot:run


🛠️ Build the Project

To build the project into a JAR:

mvn clean package

Then run:

java -jar target/outfit-recommendations-*.jar


🌐 Access the App

Once the app is running, you can access it at:

http://localhost:8080


🧪 Running Tests

mvn test


🐳 Run with Docker (Optional)

To run using Docker:

docker build -t outfit-recommendations .
docker run -p 8080:8080 outfit-recommendations

