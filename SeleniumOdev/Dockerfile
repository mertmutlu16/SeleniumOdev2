# Base image
FROM adoptopenjdk:11-jdk-hotspot-bionic

# Gerekli dosyaları kopyala
COPY ./src /SeleniumOdev/src
COPY ./driver/chromedriver.exe /usr/local/bin/chromedriver.exe
COPY Manifest.txt /SeleniumOdev/Manifest.txt
COPY seleniumdriver/selenium-server-4.9.0.jar /SeleniumOdev/seleniumdriver/selenium-server-4.9.0.jar

# Gerekli bağımlılıkları yükle
RUN apt-get update && apt-get install -y \
    wget \
    unzip \
    libglib2.0-0 \
    libnss3 \
    libx11-6 \
    libx11-xcb1 \
    libxcb1 \
    libxcomposite1 \
    libxcursor1 \
    libxdamage1 \
    libxext6 \
    libxfixes3 \
    libxi6 \
    libxrandr2 \
    libxrender1 \
    libxss1 \
    libxtst6 \
    ca-certificates \
    fonts-liberation \
    libappindicator3-1 \
    libasound2 \
    libatk-bridge2.0-0 \
    libatk1.0-0 \
    libcairo2 \
    libcups2 \
    libdbus-1-3 \
    libgbm1 \
    libgdk-pixbuf2.0-0 \
    libgtk-3-0 \
    libnspr4 \
    libpango-1.0-0 \
    libcairo-gobject2 \
    libpangocairo-1.0-0 \
    libxtst6 \
    xvfb \
    libu2f-udev \
    libvulkan1 \
    xdg-utils

# Chrome yüklemesi
RUN wget -q https://dl.google.com/linux/direct/google-chrome-stable_current_amd64.deb && \
    dpkg -i google-chrome-stable_current_amd64.deb && \
    apt-get install -y -f && \
    rm google-chrome-stable_current_amd64.deb

# Çalışma dizinini ayarla
WORKDIR /SeleniumOdev

# Kaynak dosyalarını derle
RUN mkdir -p bin
RUN javac -cp .:seleniumdriver/selenium-server-4.9.0.jar:src -d bin src/pkt/*.java

# Çalışma dizinini değiştir
WORKDIR /SeleniumOdev/bin

# JAR dosyasını oluştur
RUN jar -cvfm Program.jar ../Manifest.txt pkt/*.class

# Xvfb başlatma ve varsayılan ekran değişkenlerini ayarlama
ENV DISPLAY=:99
ENV DBUS_SESSION_BUS_ADDRESS=/dev/null

# Docker konteyneri çalıştığında otomatik olarak Xvfb ve Selenium sunucusunu başlat
CMD Xvfb :99 -screen 0 1024x768x16 & \
    java -cp ".:/SeleniumOdev/seleniumdriver/*:Program.jar" pkt.Program
