echo ""
echo "--------------------------------------------------------"
echo "Welcome to Puje's mini project 01"
echo ""
echo "--------------------------------------------------------"
echo "Now cleaning and compiling java to jar project using by maven"
echo "--------------------------------------------------------"



mvn clean
mvn -Dmaven.test.skip=true package
docker build -t springbootapp .

docker-compose up -d

#read -n 1 -s -r -p "Press any key to start containers"
#docker container start springbootapp


echo ""
echo "--------------------------------------------------------"
echo ""
echo "Now open your browser and write:"
echo "URL: http://localhost:4446"
echo "username for Admin: admin password: admin"
echo "username for User: user password: user"
echo "Enjoy it! Thank you!!!"
echo "README.md is more clear understanding for checking functionality."
echo "                        the script written by Purevdemberel at MUM.EDU"
echo "--------------------------------------------------------"
echo ""
