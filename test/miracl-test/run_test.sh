#!/bin/bash

function gen()
{

    OPTIMIZED=$1
    optimized=$2
    N=$3
    dst_dir=miracl_${optimized}_${N}

    msg="[OPTMIZE:$*] "
    echo -e "\n"${msg}

    cd ${dst_dir}


    rm -f test test.cpp
    cp ../test.cpp ./

    g++ -O2 -std=c++11 test.cpp miracl.a -o test

    #echo -e ${msg}"\c" >> ../test_report.txt
    #time ./test  >> ../test_report.txt
    echo -e ${msg}"\c" >> ../test_report.txt
    time ./test 128 2 1024000 >> ../test_report.txt
   # echo -e ${msg}"\c" >> ../test_report.txt
   # time ./test 512 256 1024 >> ../test_report.txt
   # echo -e ${msg}"\c" >> ../test_report.txt
   # time ./test 1024 1024 102400 >> ../test_report.txt

    cd ..
}

echo "" > test_report.txt

gen
gen MR_COMBA mrcomba 2
gen MR_KCM mrkcm 2
gen MR_COMBA mrcomba 4
gen MR_KCM mrkcm 4
gen MR_COMBA mrcomba 8
gen MR_KCM mrkcm 8
gen MR_COMBA mrcomba 16
gen MR_KCM mrkcm 16

cat ./test_report.txt

exit 0


