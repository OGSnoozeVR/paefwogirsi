#!/bin/bash

echo "=============================="
echo "Building Jarvis AI Assistant"
echo "=============================="

if ! command -v mvn &> /dev/null
then
    echo "Maven not installed."
    echo "Install Maven and Java JDK first."
    exit
fi

mvn clean package

mkdir -p dist

cp target/jarvis-assistant-1.0.jar dist/JarvisAssistant.jar

echo ""
echo "Build complete!"
echo "Jar located at:"
echo "dist/JarvisAssistant.jar"

read -p "Press enter to exit"
