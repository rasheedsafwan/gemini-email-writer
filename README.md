# AI-Powered Gmail Reply Generator 🚀

## Overview
This Chrome extension generates *intelligent* (sometimes) and context-aware email replies using Google's Gemini API. The extension seamlessly integrates with Gmail, allowing users to generate AI-powered responses with a single click.

## Features
✅ AI-generated email replies 
✅ Seamless integration with Gmail  
✅ One-click response generation  
✅ Backend powered by Spring Boot  
✅ Processes email context for more relevant responses  

## Tech Stack
- **Frontend**: Chrome Extension (JavaScript, HTML, CSS)
- **Backend**: Spring Boot
- **AI Model**: Google Gemini API

## Installation
1. **Clone the Repository**
   ```sh
   git clone https://github.com/rasheedsafwan/gemini-email-writer.git
   ```

2. **Load the Extension into Chrome**
   - Open `chrome://extensions/` in your browser.
   - Enable **Developer Mode** (top-right corner).
   - Click **Load unpacked** and select the `email-writer-extension 2` folder from this repo.

3. **Set Up the Backend**
   - Navigate to the backend directory:
     ```sh
     cd email-writer-sb
     ```
   - Build and run the Spring Boot server:
     ```sh
     mvn spring-boot:run
     ```

4. **Configure API Key**
   - Get a Google Gemini API key from [Google AI](https://ai.google.com/)
   - Add your API key to the backend `application.properties`:
     ```properties
     gemini.api.key=YOUR_API_KEY_HERE
     ```

## Usage
1. Open Gmail.
2. Click on the **AI Reply** button when composing an email.
3. Watch as the AI *tries* to generate an intelligent response! 😂


