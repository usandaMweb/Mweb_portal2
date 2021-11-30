#!/bin/bash
# Ensure that you installed on remote machine:
# git maven google-chrome-stable Xvfb

killall Xvfb
Xvfb :10 &
export JAVA_TOOL_OPTIONS=-Dfile.encoding=UTF8
export DISPLAY=:10
set -e
#mvn clean install

mvn -Dtest="/testNG/*" test

#mvn -Dtest=TestProductDetailsTransferExistingFiberLine test

#mvn allure:serve
#mvn -Dtest=NewCustomerFibreOrder test
#mvn -Dsuite=AllTestRunner test
