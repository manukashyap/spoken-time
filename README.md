# Spoken Time

Java based Gradle  App to convert time provided in numerical format into Spoken Time according to various dialects.
Currently supports conversion to British spoken time

### How to run the application

To run the application, go to the root folder of the project and execute the following command on UNIX system
```shell
./gradlew --console plain run
```
If you are on a Windows Machine, execute the following command.
```shell
.\gradlew.bat --console plain run
```
#### British Spoken Time

Below are a few examples of British Spoken Time conversion
| Numeric Time | British Spoken Time  |
|--------------|----------------------|
| 1:00         | one o'clock           |
| 2:05         | five past two         |
| 3:10         | ten past three        |
| 4:15         | quarter past four     |
| 5:20         | twenty past five      |
| 6:25         | twenty five past six  |
| 6:32         | six thirty two        |
| 7:30         | half past seven       |
| 7:35         | twenty five to eight  |
| 8:40         | twenty to nine        |
| 9:45         | quarter to ten        |
| 10:50        | ten to eleven         |
| 11:55        | five to twelve        |
| 00:00        | midnight              |
| 12:00        | noon                  |
