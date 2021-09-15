echo 			"Maven package"
call mvn package
echo 			"Maven run"
call java -jar target/codingTask-1.0.jar
pause