import speech_recognition as sr
import pyttsx3
import wikipedia
import pywhatkit
import datetime

# Initialize Text-to-Speech engine
engine = pyttsx3.init()
engine.setProperty('rate', 150)  # Speed of speech
engine.setProperty('volume', 0.9)  # Volume (0.0 to 1.0)

def speak(text):
    engine.say(text)
    engine.runAndWait()

def take_command():
    recognizer = sr.Recognizer()
    with sr.Microphone() as source:
        print("Listening...")
        recognizer.adjust_for_ambient_noise(source)
        audio = recognizer.listen(source)
        try:
            command = recognizer.recognize_google(audio).lower()
            print(f"You said: {command}")
        except sr.UnknownValueError:
            speak("Sorry, I did not understand that.")
            return None
        except sr.RequestError:
            speak("Speech service is down.")
            return None
        return command

def process_command(command):
    if 'time' in command:
        time = datetime.datetime.now().strftime('%H:%M')
        speak(f"The current time is {time}")
    elif 'search wikipedia for' in command:
        topic = command.replace('search wikipedia for', '').strip()
        result = wikipedia.summary(topic, sentences=2)
        speak(result)
    elif 'play' in command:
        song = command.replace('play', '').strip()
        speak(f"Playing {song}")
        pywhatkit.playonyt(song)
    else:
        speak("I can’t handle that request yet!")

def main():
    speak("Hello! How can I assist you today?")
    while True:
        command = take_command()
        if command:
            process_command(command)
        if 'exit' in command or 'quit' in command:
            speak("Goodbye!")
            break

if __name__ == "__main__":
    main()
